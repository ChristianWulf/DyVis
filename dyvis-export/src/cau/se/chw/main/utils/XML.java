package cau.se.chw.main.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

/**
 * Provides methods to generate, validate and extract XML documents.
 * 
 */
public class XML {

	private Marshaller m;
	private Unmarshaller u;
	private Validator validator;

	private static final Logger logger = Logger.getLogger(XML.class.getName());
	/**
	 * Singleton instance
	 */
	private static volatile XML instance;

	private XML() { // Singleton
		try {
			JAXBContext jc = JAXBContext.newInstance("org.omg.schema.spec.kdm._1_1.core:"
					+ "org.omg.schema.spec.kdm._1_1.kdm:" + ""
					+ "org.omg.schema.spec.kdm._1_1.source:" + "org.omg.schema.spec.kdm._1_1.code:"
					+ "org.omg.schema.spec.kdm._1_1.structure");
			u = jc.createUnmarshaller();
			m = jc.createMarshaller();
			configureMarshaller(m);
		} catch (JAXBException e) {
			// logger.log(Level.SEVERE, "Could not create JAXBContext", e);
			e.printStackTrace();
		}
	}

	public static XML getInstance() {
		if (instance == null) {
			synchronized (XML.class) {
				if (instance == null) {
					instance = new XML();
				}
			}
		}
		return instance;
	}

	// ---------------------------------------------------
	// other Methods
	// ---------------------------------------------------

	/**
	 * Loads the specific schema enabling (un)marshalling.
	 * 
	 * @param filename
	 * @throws FileNotFoundException
	 * @throws PropertyException
	 */
	public void loadSchema(String filename) throws FileNotFoundException, PropertyException {
		File f = new File(filename);
		if (!f.exists()) {
			throw new FileNotFoundException(f.getAbsolutePath());
		}

		SchemaFactory sf = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
			Schema schema = sf.newSchema(f);
			validator = schema.newValidator();
			u.setSchema(schema);
			m.setSchema(schema);

			configureMarshaller(m);
		} catch (SAXException e) {
			logger.log(Level.SEVERE, "Could not parse schema", e);
		}
	}

	private void configureMarshaller(Marshaller marshaller) throws PropertyException {
		marshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper",
				new PreferredMapper("org.omg"));
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	}

	/**
	 * validates the <code>xmlString</code> if it is a valid JAXB file with the
	 * matching schema previously loaded
	 * 
	 * @param xmlString
	 *            a XML representation
	 * @return true if valid else false
	 */
	public boolean validate(String xmlString) {
		try {
			synchronized (XML.class) {
				validator.validate(new StreamSource(new StringReader(xmlString)));
			}
		} catch (IOException ex) {
			logger.log(Level.SEVERE, xmlString, ex);
			return false;
		} catch (SAXException e) {
			// instance document is invalid!
			logger.log(Level.SEVERE, xmlString, e);
			return false;
		}
		return true;
	}

	/**
	 * Generates an XML string representation of the given <code>element</code>.
	 * 
	 * @param element
	 * @return
	 */
	public String generate(JAXBElement<?> element) {
		StringWriter outStr = new StringWriter(); // need not to be closed
		try {
			synchronized (XML.class) {
				m.marshal(element, outStr);
			}
		} catch (JAXBException ex) {
			logger.log(Level.SEVERE, "XML generation failt.", ex);
		}

		return outStr.toString();
	}

	/**
	 * Extract the XML string and returns a new object holding the data.
	 * 
	 * @param String
	 *            an XML representation
	 * @return Object
	 */
	public Object extract(String xmlString) {
		Object obj = null;

		StringReader source = new StringReader(xmlString);
		try {
			JAXBElement<?> element;
			synchronized (XML.class) {
				element = (JAXBElement<?>) u.unmarshal(source);
			}
			obj = element.getValue();
		} catch (JAXBException ex) {
			logger.log(Level.SEVERE, null, ex);
		} finally {
			source.close();
		}

		return obj;
	}

	/**
	 * Returns the xml conform timestamp of the current time and date.
	 * 
	 * @return timestamp in xml format
	 */
	public XMLGregorianCalendar today() {
		XMLGregorianCalendar timestamp = null;
		try {
			GregorianCalendar today = new GregorianCalendar();
			timestamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(today);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return timestamp;
	}
}
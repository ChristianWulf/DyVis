//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.omg.schema.spec.kdm._1_1.code.ItemUnit;


/**
 * <p>Java class for IndexElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/data}DataResource">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="implementation" type="{http://schema.omg.org/spec/KDM/1.1/code}ItemUnit"/>
 *       &lt;/choice>
 *       &lt;attribute name="implementation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexElement", propOrder = {
    "implementation"
})
@XmlSeeAlso({
    ReferenceKey.class,
    Index.class,
    UniqueKey.class
})
public class IndexElement
    extends DataResource
{

    protected List<ItemUnit> implementation;
    @XmlAttribute(name = "implementation")
    protected String altImplementation;

    /**
     * Gets the value of the implementation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implementation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplementation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemUnit }
     * 
     * 
     */
    public List<ItemUnit> getImplementation() {
        if (implementation == null) {
            implementation = new ArrayList<ItemUnit>();
        }
        return this.implementation;
    }

    /**
     * Gets the value of the altImplementation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltImplementation() {
        return altImplementation;
    }

    /**
     * Sets the value of the altImplementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltImplementation(String value) {
        this.altImplementation = value;
    }

}

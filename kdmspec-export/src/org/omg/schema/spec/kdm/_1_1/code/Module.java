//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.code;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Module complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Module">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/code}CodeItem">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="codeElement" type="{http://schema.omg.org/spec/KDM/1.1/code}AbstractCodeElement"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Module", propOrder = {
    "codeElement"
})
@XmlSeeAlso({
    LanguageUnit.class,
    CompilationUnit.class,
    Package.class,
    CodeAssembly.class
})
public class Module
    extends CodeItem
{

    protected List<AbstractCodeElement> codeElement;

    /**
     * Gets the value of the codeElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCodeElement }
     * 
     * 
     */
    public List<AbstractCodeElement> getCodeElement() {
        if (codeElement == null) {
            codeElement = new ArrayList<AbstractCodeElement>();
        }
        return this.codeElement;
    }

}

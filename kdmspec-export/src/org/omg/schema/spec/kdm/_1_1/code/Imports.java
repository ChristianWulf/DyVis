//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.code;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Imports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Imports">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/code}AbstractCodeRelationship">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="to" type="{http://schema.omg.org/spec/KDM/1.1/code}CodeItem"/>
 *         &lt;element name="from" type="{http://schema.omg.org/spec/KDM/1.1/code}CodeItem"/>
 *       &lt;/choice>
 *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Imports", propOrder = {
    "toOrFrom"
})
public class Imports
    extends AbstractCodeRelationship
{

    @XmlElementRefs({
        @XmlElementRef(name = "to", type = JAXBElement.class),
        @XmlElementRef(name = "from", type = JAXBElement.class)
    })
    protected List<JAXBElement<CodeItem>> toOrFrom;
    @XmlAttribute
    protected String to;
    @XmlAttribute
    protected String from;

    /**
     * Gets the value of the toOrFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toOrFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToOrFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CodeItem }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeItem }{@code >}
     * 
     * 
     */
    public List<JAXBElement<CodeItem>> getToOrFrom() {
        if (toOrFrom == null) {
            toOrFrom = new ArrayList<JAXBElement<CodeItem>>();
        }
        return this.toOrFrom;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

}

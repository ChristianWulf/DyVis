//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.action;

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
 * <p>Java class for ExitFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExitFlow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/action}AbstractActionRelationship">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="to" type="{http://schema.omg.org/spec/KDM/1.1/action}ActionElement"/>
 *         &lt;element name="from" type="{http://schema.omg.org/spec/KDM/1.1/action}ActionElement"/>
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
@XmlType(name = "ExitFlow", propOrder = {
    "toOrFrom"
})
public class ExitFlow
    extends AbstractActionRelationship
{

    @XmlElementRefs({
        @XmlElementRef(name = "from", type = JAXBElement.class),
        @XmlElementRef(name = "to", type = JAXBElement.class)
    })
    protected List<JAXBElement<ActionElement>> toOrFrom;
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
     * {@link JAXBElement }{@code <}{@link ActionElement }{@code >}
     * {@link JAXBElement }{@code <}{@link ActionElement }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ActionElement>> getToOrFrom() {
        if (toOrFrom == null) {
            toOrFrom = new ArrayList<JAXBElement<ActionElement>>();
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

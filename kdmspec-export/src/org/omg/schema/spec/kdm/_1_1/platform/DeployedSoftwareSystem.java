//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.platform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeployedSoftwareSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeployedSoftwareSystem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/platform}AbstractPlatformElement">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="groupedComponent" type="{http://schema.omg.org/spec/KDM/1.1/platform}DeployedComponent"/>
 *       &lt;/choice>
 *       &lt;attribute name="groupedComponent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeployedSoftwareSystem", propOrder = {
    "groupedComponent"
})
public class DeployedSoftwareSystem
    extends AbstractPlatformElement
{

    protected List<DeployedComponent> groupedComponent;
    @XmlAttribute(name = "groupedComponent")
    protected String altGroupedComponent;

    /**
     * Gets the value of the groupedComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupedComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupedComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeployedComponent }
     * 
     * 
     */
    public List<DeployedComponent> getGroupedComponent() {
        if (groupedComponent == null) {
            groupedComponent = new ArrayList<DeployedComponent>();
        }
        return this.groupedComponent;
    }

    /**
     * Gets the value of the altGroupedComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltGroupedComponent() {
        return altGroupedComponent;
    }

    /**
     * Sets the value of the altGroupedComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltGroupedComponent(String value) {
        this.altGroupedComponent = value;
    }

}

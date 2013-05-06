//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.build;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.omg.schema.spec.kdm._1_1.core.KDMEntity;


/**
 * <p>Java class for BuildResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/build}AbstractBuildElement">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="implementation" type="{http://schema.omg.org/spec/KDM/1.1/core}KDMEntity"/>
 *         &lt;element name="groupedBuild" type="{http://schema.omg.org/spec/KDM/1.1/build}AbstractBuildElement"/>
 *         &lt;element name="buildElement" type="{http://schema.omg.org/spec/KDM/1.1/build}AbstractBuildElement"/>
 *       &lt;/choice>
 *       &lt;attribute name="implementation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupedBuild" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildResource", propOrder = {
    "implementationOrGroupedBuildOrBuildElement"
})
@XmlSeeAlso({
    BuildProduct.class,
    BuildDescription.class,
    BuildComponent.class,
    Library.class,
    BuildStep.class
})
public class BuildResource
    extends AbstractBuildElement
{

    @XmlElementRefs({
        @XmlElementRef(name = "implementation", type = JAXBElement.class),
        @XmlElementRef(name = "groupedBuild", type = JAXBElement.class),
        @XmlElementRef(name = "buildElement", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends KDMEntity>> implementationOrGroupedBuildOrBuildElement;
    @XmlAttribute
    protected String implementation;
    @XmlAttribute
    protected String groupedBuild;

    /**
     * Gets the value of the implementationOrGroupedBuildOrBuildElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implementationOrGroupedBuildOrBuildElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplementationOrGroupedBuildOrBuildElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractBuildElement }{@code >}
     * {@link JAXBElement }{@code <}{@link KDMEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractBuildElement }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends KDMEntity>> getImplementationOrGroupedBuildOrBuildElement() {
        if (implementationOrGroupedBuildOrBuildElement == null) {
            implementationOrGroupedBuildOrBuildElement = new ArrayList<JAXBElement<? extends KDMEntity>>();
        }
        return this.implementationOrGroupedBuildOrBuildElement;
    }

    /**
     * Gets the value of the implementation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation() {
        return implementation;
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation(String value) {
        this.implementation = value;
    }

    /**
     * Gets the value of the groupedBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupedBuild() {
        return groupedBuild;
    }

    /**
     * Sets the value of the groupedBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupedBuild(String value) {
        this.groupedBuild = value;
    }

}

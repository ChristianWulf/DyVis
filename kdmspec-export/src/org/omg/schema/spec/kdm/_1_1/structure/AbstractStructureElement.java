//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.structure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.omg.schema.spec.kdm._1_1.core.AggregatedRelationship;
import org.omg.schema.spec.kdm._1_1.core.KDMEntity;
import org.omg.schema.spec.kdm._1_1.core.ModelElement;


/**
 * <p>Java class for AbstractStructureElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractStructureElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/core}KDMEntity">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="aggregated" type="{http://schema.omg.org/spec/KDM/1.1/core}AggregatedRelationship"/>
 *         &lt;element name="implementation" type="{http://schema.omg.org/spec/KDM/1.1/core}KDMEntity"/>
 *         &lt;element name="structureElement" type="{http://schema.omg.org/spec/KDM/1.1/structure}AbstractStructureElement"/>
 *         &lt;element name="structureRelationship" type="{http://schema.omg.org/spec/KDM/1.1/structure}AbstractStructureRelationship"/>
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
@XmlType(name = "AbstractStructureElement", propOrder = {
    "aggregatedOrImplementationOrStructureElement"
})
@XmlSeeAlso({
    Layer.class,
    ArchitectureView.class,
    Subsystem.class,
    StructureElement.class,
    Component.class,
    SoftwareSystem.class
})
public abstract class AbstractStructureElement
    extends KDMEntity
{

    @XmlElements({
        @XmlElement(name = "structureRelationship", type = AbstractStructureRelationship.class),
        @XmlElement(name = "structureElement", type = AbstractStructureElement.class),
        @XmlElement(name = "aggregated", type = AggregatedRelationship.class),
        @XmlElement(name = "implementation", type = KDMEntity.class)
    })
    protected List<ModelElement> aggregatedOrImplementationOrStructureElement;
    @XmlAttribute
    protected String implementation;

    /**
     * Gets the value of the aggregatedOrImplementationOrStructureElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregatedOrImplementationOrStructureElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregatedOrImplementationOrStructureElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractStructureRelationship }
     * {@link AbstractStructureElement }
     * {@link AggregatedRelationship }
     * {@link KDMEntity }
     * 
     * 
     */
    public List<ModelElement> getAggregatedOrImplementationOrStructureElement() {
        if (aggregatedOrImplementationOrStructureElement == null) {
            aggregatedOrImplementationOrStructureElement = new ArrayList<ModelElement>();
        }
        return this.aggregatedOrImplementationOrStructureElement;
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

}

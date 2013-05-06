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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.omg.schema.spec.kdm._1_1.action.ActionElement;
import org.omg.schema.spec.kdm._1_1.core.Element;
import org.omg.schema.spec.kdm._1_1.core.KDMEntity;
import org.omg.schema.spec.kdm._1_1.source.SourceRef;


/**
 * <p>Java class for AbstractDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractDataElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/core}KDMEntity">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="source" type="{http://schema.omg.org/spec/KDM/1.1/source}SourceRef"/>
 *         &lt;element name="dataRelation" type="{http://schema.omg.org/spec/KDM/1.1/data}AbstractDataRelationship"/>
 *         &lt;element name="abstraction" type="{http://schema.omg.org/spec/KDM/1.1/action}ActionElement"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDataElement", propOrder = {
    "sourceOrDataRelationOrAbstraction"
})
@XmlSeeAlso({
    XMLSchema.class,
    ExtendedDataElement.class,
    DataAction.class,
    AbstractContentElement.class,
    DataResource.class
})
public abstract class AbstractDataElement
    extends KDMEntity
{

    @XmlElements({
        @XmlElement(name = "abstraction", type = ActionElement.class),
        @XmlElement(name = "dataRelation", type = AbstractDataRelationship.class),
        @XmlElement(name = "source", type = SourceRef.class)
    })
    protected List<Element> sourceOrDataRelationOrAbstraction;

    /**
     * Gets the value of the sourceOrDataRelationOrAbstraction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceOrDataRelationOrAbstraction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceOrDataRelationOrAbstraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionElement }
     * {@link AbstractDataRelationship }
     * {@link SourceRef }
     * 
     * 
     */
    public List<Element> getSourceOrDataRelationOrAbstraction() {
        if (sourceOrDataRelationOrAbstraction == null) {
            sourceOrDataRelationOrAbstraction = new ArrayList<Element>();
        }
        return this.sourceOrDataRelationOrAbstraction;
    }

}

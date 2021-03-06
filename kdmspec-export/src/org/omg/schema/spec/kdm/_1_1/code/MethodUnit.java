//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.code;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/KDM/1.1/code}ControlElement">
 *       &lt;attribute name="kind" type="{http://schema.omg.org/spec/KDM/1.1/code}MethodKind" />
 *       &lt;attribute name="export" type="{http://schema.omg.org/spec/KDM/1.1/code}ExportKind" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodUnit")
public class MethodUnit
    extends ControlElement
{

    @XmlAttribute
    protected MethodKind kind;
    @XmlAttribute
    protected ExportKind export;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link MethodKind }
     *     
     */
    public MethodKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodKind }
     *     
     */
    public void setKind(MethodKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link ExportKind }
     *     
     */
    public ExportKind getExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportKind }
     *     
     */
    public void setExport(ExportKind value) {
        this.export = value;
    }

}

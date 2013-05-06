//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.code;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="byValue"/>
 *     &lt;enumeration value="byName"/>
 *     &lt;enumeration value="byReference"/>
 *     &lt;enumeration value="variadic"/>
 *     &lt;enumeration value="return"/>
 *     &lt;enumeration value="throws"/>
 *     &lt;enumeration value="exception"/>
 *     &lt;enumeration value="catchall"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterKind")
@XmlEnum
public enum ParameterKind {

    @XmlEnumValue("byValue")
    BY_VALUE("byValue"),
    @XmlEnumValue("byName")
    BY_NAME("byName"),
    @XmlEnumValue("byReference")
    BY_REFERENCE("byReference"),
    @XmlEnumValue("variadic")
    VARIADIC("variadic"),
    @XmlEnumValue("return")
    RETURN("return"),
    @XmlEnumValue("throws")
    THROWS("throws"),
    @XmlEnumValue("exception")
    EXCEPTION("exception"),
    @XmlEnumValue("catchall")
    CATCHALL("catchall"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ParameterKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterKind fromValue(String v) {
        for (ParameterKind c: ParameterKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
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
 * <p>Java class for CallableKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallableKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="regular"/>
 *     &lt;enumeration value="operator"/>
 *     &lt;enumeration value="stored"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallableKind")
@XmlEnum
public enum CallableKind {

    @XmlEnumValue("external")
    EXTERNAL("external"),
    @XmlEnumValue("regular")
    REGULAR("regular"),
    @XmlEnumValue("operator")
    OPERATOR("operator"),
    @XmlEnumValue("stored")
    STORED("stored"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    CallableKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallableKind fromValue(String v) {
        for (CallableKind c: CallableKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

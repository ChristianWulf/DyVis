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
 * <p>Java class for MacroKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MacroKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="regular"/>
 *     &lt;enumeration value="option"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MacroKind")
@XmlEnum
public enum MacroKind {

    @XmlEnumValue("regular")
    REGULAR("regular"),
    @XmlEnumValue("option")
    OPTION("option"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("external")
    EXTERNAL("external"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MacroKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MacroKind fromValue(String v) {
        for (MacroKind c: MacroKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

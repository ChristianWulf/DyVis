
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ParameterKind">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="byValue"/>
 *     &lt;xs:enumeration value="byName"/>
 *     &lt;xs:enumeration value="byReference"/>
 *     &lt;xs:enumeration value="variadic"/>
 *     &lt;xs:enumeration value="return"/>
 *     &lt;xs:enumeration value="throws"/>
 *     &lt;xs:enumeration value="exception"/>
 *     &lt;xs:enumeration value="catchall"/>
 *     &lt;xs:enumeration value="unknown"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum ParameterKind {
    BY_VALUE("byValue"), BY_NAME("byName"), BY_REFERENCE("byReference"), VARIADIC(
            "variadic"), RETURN("return"), THROWS("throws"), EXCEPTION(
            "exception"), CATCHALL("catchall"), UNKNOWN("unknown");
    private final String value;

    private ParameterKind(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static ParameterKind convert(String value) {
        for (ParameterKind inst : values()) {
            if (inst.toString().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

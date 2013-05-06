
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CallableKind">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="external"/>
 *     &lt;xs:enumeration value="regular"/>
 *     &lt;xs:enumeration value="operator"/>
 *     &lt;xs:enumeration value="stored"/>
 *     &lt;xs:enumeration value="unknown"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum CallableKind {
    EXTERNAL("external"), REGULAR("regular"), OPERATOR("operator"), STORED(
            "stored"), UNKNOWN("unknown");
    private final String value;

    private CallableKind(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static CallableKind convert(String value) {
        for (CallableKind inst : values()) {
            if (inst.toString().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

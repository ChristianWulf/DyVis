
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StorableKind">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="global"/>
 *     &lt;xs:enumeration value="local"/>
 *     &lt;xs:enumeration value="static"/>
 *     &lt;xs:enumeration value="external"/>
 *     &lt;xs:enumeration value="register"/>
 *     &lt;xs:enumeration value="unknown"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum StorableKind {
    GLOBAL("global"), LOCAL("local"), STATIC("static"), EXTERNAL("external"), REGISTER(
            "register"), UNKNOWN("unknown");
    private final String value;

    private StorableKind(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static StorableKind convert(String value) {
        for (StorableKind inst : values()) {
            if (inst.toString().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

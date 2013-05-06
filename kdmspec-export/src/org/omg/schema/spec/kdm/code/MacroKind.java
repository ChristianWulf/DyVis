
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MacroKind">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="regular"/>
 *     &lt;xs:enumeration value="option"/>
 *     &lt;xs:enumeration value="undefined"/>
 *     &lt;xs:enumeration value="external"/>
 *     &lt;xs:enumeration value="unknown"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum MacroKind {
    REGULAR("regular"), OPTION("option"), UNDEFINED("undefined"), EXTERNAL(
            "external"), UNKNOWN("unknown");
    private final String value;

    private MacroKind(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static MacroKind convert(String value) {
        for (MacroKind inst : values()) {
            if (inst.toString().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

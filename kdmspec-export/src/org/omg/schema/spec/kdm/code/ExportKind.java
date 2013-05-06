
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExportKind">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="public"/>
 *     &lt;xs:enumeration value="private"/>
 *     &lt;xs:enumeration value="protected"/>
 *     &lt;xs:enumeration value="final"/>
 *     &lt;xs:enumeration value="unknown"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum ExportKind {
    PUBLIC("public"), PRIVATE("private"), PROTECTED("protected"), FINAL("final"), UNKNOWN(
            "unknown");
    private final String value;

    private ExportKind(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static ExportKind convert(String value) {
        for (ExportKind inst : values()) {
            if (inst.toString().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}


package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MethodKind">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="method"/>
 *     &lt;xs:enumeration value="constructor"/>
 *     &lt;xs:enumeration value="destructor"/>
 *     &lt;xs:enumeration value="operator"/>
 *     &lt;xs:enumeration value="virtual"/>
 *     &lt;xs:enumeration value="abstract"/>
 *     &lt;xs:enumeration value="unknown"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum MethodKind {
    METHOD("method"), CONSTRUCTOR("constructor"), DESTRUCTOR("destructor"), OPERATOR(
            "operator"), VIRTUAL("virtual"), ABSTRACT("abstract"), UNKNOWN(
            "unknown");
    private final String value;

    private MethodKind(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static MethodKind convert(String value) {
        for (MethodKind inst : values()) {
            if (inst.toString().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

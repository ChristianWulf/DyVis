
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MacroUnit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:PreprocessorDirective">
 *       &lt;xs:attribute type="ns:MacroKind" name="kind"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MacroUnit extends PreprocessorDirective
{
    private MacroKind kind;

    /** 
     * Get the 'kind' attribute value.
     * 
     * @return value
     */
    public MacroKind getKind() {
        return kind;
    }

    /** 
     * Set the 'kind' attribute value.
     * 
     * @param kind
     */
    public void setKind(MacroKind kind) {
        this.kind = kind;
    }
}

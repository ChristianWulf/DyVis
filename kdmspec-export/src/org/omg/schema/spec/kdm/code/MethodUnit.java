
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MethodUnit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ControlElement">
 *       &lt;xs:attribute type="ns:MethodKind" name="kind"/>
 *       &lt;xs:attribute type="ns:ExportKind" name="export"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MethodUnit extends ControlElement
{
    private MethodKind kind;
    private ExportKind export;

    /** 
     * Get the 'kind' attribute value.
     * 
     * @return value
     */
    public MethodKind getKind() {
        return kind;
    }

    /** 
     * Set the 'kind' attribute value.
     * 
     * @param kind
     */
    public void setKind(MethodKind kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'export' attribute value.
     * 
     * @return value
     */
    public ExportKind getExport() {
        return export;
    }

    /** 
     * Set the 'export' attribute value.
     * 
     * @param export
     */
    public void setExport(ExportKind export) {
        this.export = export;
    }
}


package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MemberUnit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:DataElement">
 *       &lt;xs:attribute type="ns:ExportKind" name="export"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MemberUnit extends DataElement
{
    private ExportKind export;

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

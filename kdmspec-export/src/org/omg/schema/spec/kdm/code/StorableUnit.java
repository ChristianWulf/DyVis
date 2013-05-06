
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StorableUnit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:DataElement">
 *       &lt;xs:attribute type="ns:StorableKind" name="kind"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StorableUnit extends DataElement
{
    private StorableKind kind;

    /** 
     * Get the 'kind' attribute value.
     * 
     * @return value
     */
    public StorableKind getKind() {
        return kind;
    }

    /** 
     * Set the 'kind' attribute value.
     * 
     * @param kind
     */
    public void setKind(StorableKind kind) {
        this.kind = kind;
    }
}

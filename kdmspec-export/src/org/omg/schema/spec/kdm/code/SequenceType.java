
package org.omg.schema.spec.kdm.code;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SequenceType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:DerivedType">
 *       &lt;xs:attribute type="xs:string" name="size"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SequenceType extends DerivedType
{
    private String size;

    /** 
     * Get the 'size' attribute value.
     * 
     * @return value
     */
    public String getSize() {
        return size;
    }

    /** 
     * Set the 'size' attribute value.
     * 
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }
}

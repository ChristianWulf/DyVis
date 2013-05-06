
package org.omg.schema.spec.kdm.data;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ContentRestriction">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractContentElement">
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *       &lt;xs:attribute type="xs:string" name="value"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ContentRestriction extends AbstractContentElement
{
    private String kind;
    private String value;

    /** 
     * Get the 'kind' attribute value.
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'kind' attribute value.
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'value' attribute value.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'value' attribute value.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}

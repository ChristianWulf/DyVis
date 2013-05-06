
package org.omg.schema.spec.kdm.ui;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/ui" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UIEvent">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractUIElement">
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UIEvent extends AbstractUIElement
{
    private String kind;

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
}

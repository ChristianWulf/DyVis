
package org.omg.schema.spec.kdm.kdm;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaggedValue">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ExtendedValue">
 *       &lt;xs:attribute type="xs:string" name="value"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaggedValue extends ExtendedValue
{
    private String value;

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

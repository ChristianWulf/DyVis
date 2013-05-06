
package org.omg.schema.spec.kdm.kdm;

import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Attribute">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:attribute type="xs:string" name="tag"/>
 *       &lt;xs:attribute type="xs:string" name="value"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Attribute extends Element
{
    private String tag;
    private String value;

    /** 
     * Get the 'tag' attribute value.
     * 
     * @return value
     */
    public String getTag() {
        return tag;
    }

    /** 
     * Set the 'tag' attribute value.
     * 
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
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

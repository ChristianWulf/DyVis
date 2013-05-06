
package org.omg.schema.spec.kdm.kdm;

import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TagDefinition">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:attribute type="xs:string" name="tag"/>
 *       &lt;xs:attribute type="xs:string" name="type"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TagDefinition extends Element
{
    private String tag;
    private String type;

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
     * Get the 'type' attribute value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' attribute value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}

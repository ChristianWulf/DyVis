
package org.omg.schema.spec.kdm.kdm;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="ExtendedValue">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:TagDefinition" name="tag" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="tag"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class ExtendedValue extends Element
{
    private List<TagDefinition> tagList = new ArrayList<TagDefinition>();
    private String tag;

    /** 
     * Get the list of 'tag' element items.
     * 
     * @return list
     */
    public List<TagDefinition> getTags() {
        return tagList;
    }

    /** 
     * Set the list of 'tag' element items.
     * 
     * @param list
     */
    public void setTags(List<TagDefinition> list) {
        tagList = list;
    }

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
}

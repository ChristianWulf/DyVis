
package org.omg.schema.spec.kdm.kdm;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Stereotype">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:TagDefinition" name="tag" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="name"/>
 *       &lt;xs:attribute type="xs:string" name="type"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Stereotype extends Element
{
    private List<TagDefinition> tagList = new ArrayList<TagDefinition>();
    private String name;
    private String type;

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
     * Get the 'name' attribute value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' attribute value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

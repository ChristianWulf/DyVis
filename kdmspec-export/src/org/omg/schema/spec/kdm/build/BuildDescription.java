
package org.omg.schema.spec.kdm.build;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.source.SourceRef;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/source" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/build" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BuildDescription">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:BuildResource">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:SourceRef" name="source" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="text"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BuildDescription extends BuildResource
{
    private List<SourceRef> sourceList = new ArrayList<SourceRef>();
    private String text;

    /** 
     * Get the list of 'source' element items.
     * 
     * @return list
     */
    public List<SourceRef> getSources() {
        return sourceList;
    }

    /** 
     * Set the list of 'source' element items.
     * 
     * @param list
     */
    public void setSources(List<SourceRef> list) {
        sourceList = list;
    }

    /** 
     * Get the 'text' attribute value.
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'text' attribute value.
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
}

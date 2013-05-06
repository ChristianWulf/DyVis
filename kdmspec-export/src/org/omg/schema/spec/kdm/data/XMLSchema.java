
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="XMLSchema">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractDataElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractContentElement" name="contentElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class XMLSchema extends AbstractDataElement
{
    private List<AbstractContentElement> contentElementList = new ArrayList<AbstractContentElement>();

    /** 
     * Get the list of 'contentElement' element items.
     * 
     * @return list
     */
    public List<AbstractContentElement> getContentElements() {
        return contentElementList;
    }

    /** 
     * Set the list of 'contentElement' element items.
     * 
     * @param list
     */
    public void setContentElements(List<AbstractContentElement> list) {
        contentElementList = list;
    }
}

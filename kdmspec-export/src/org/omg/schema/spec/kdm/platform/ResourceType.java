
package org.omg.schema.spec.kdm.platform;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/platform" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ResourceType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractPlatformElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractPlatformElement" name="platformElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ResourceType extends AbstractPlatformElement
{
    private List<AbstractPlatformElement> platformElementList = new ArrayList<AbstractPlatformElement>();

    /** 
     * Get the list of 'platformElement' element items.
     * 
     * @return list
     */
    public List<AbstractPlatformElement> getPlatformElements() {
        return platformElementList;
    }

    /** 
     * Set the list of 'platformElement' element items.
     * 
     * @param list
     */
    public void setPlatformElements(List<AbstractPlatformElement> list) {
        platformElementList = list;
    }
}

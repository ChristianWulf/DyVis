
package org.omg.schema.spec.kdm.platform;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/platform" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlatformAction">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractPlatformElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:PlatformEvent" name="platformElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlatformAction extends AbstractPlatformElement
{
    private List<PlatformEvent> platformElementList = new ArrayList<PlatformEvent>();
    private String kind;

    /** 
     * Get the list of 'platformElement' element items.
     * 
     * @return list
     */
    public List<PlatformEvent> getPlatformElements() {
        return platformElementList;
    }

    /** 
     * Set the list of 'platformElement' element items.
     * 
     * @param list
     */
    public void setPlatformElements(List<PlatformEvent> list) {
        platformElementList = list;
    }

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

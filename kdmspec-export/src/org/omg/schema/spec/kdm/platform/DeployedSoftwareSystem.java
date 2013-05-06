
package org.omg.schema.spec.kdm.platform;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/platform" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeployedSoftwareSystem">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractPlatformElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:DeployedComponent" name="groupedComponent" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="groupedComponent"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DeployedSoftwareSystem extends AbstractPlatformElement
{
    private List<DeployedComponent> groupedComponentList = new ArrayList<DeployedComponent>();
    private String groupedComponent;

    /** 
     * Get the list of 'groupedComponent' element items.
     * 
     * @return list
     */
    public List<DeployedComponent> getGroupedComponents() {
        return groupedComponentList;
    }

    /** 
     * Set the list of 'groupedComponent' element items.
     * 
     * @param list
     */
    public void setGroupedComponents(List<DeployedComponent> list) {
        groupedComponentList = list;
    }

    /** 
     * Get the 'groupedComponent' attribute value.
     * 
     * @return value
     */
    public String getGroupedComponent() {
        return groupedComponent;
    }

    /** 
     * Set the 'groupedComponent' attribute value.
     * 
     * @param groupedComponent
     */
    public void setGroupedComponent(String groupedComponent) {
        this.groupedComponent = groupedComponent;
    }
}

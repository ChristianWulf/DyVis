
package org.omg.schema.spec.kdm.source;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.KDMModel;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InventoryModel">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMModel">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:AbstractInventoryElement" name="inventoryElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InventoryModel extends KDMModel
{
    private List<AbstractInventoryElement> inventoryElementList = new ArrayList<AbstractInventoryElement>();

    /** 
     * Get the list of 'inventoryElement' element items.
     * 
     * @return list
     */
    public List<AbstractInventoryElement> getInventoryElements() {
        return inventoryElementList;
    }

    /** 
     * Set the list of 'inventoryElement' element items.
     * 
     * @param list
     */
    public void setInventoryElements(List<AbstractInventoryElement> list) {
        inventoryElementList = list;
    }
}

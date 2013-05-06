
package org.omg.schema.spec.kdm.source;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.KDMEntity;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" abstract="true" name="AbstractInventoryElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMEntity">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:AbstractInventoryRelationship" name="inventoryRelation" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public abstract class AbstractInventoryElement extends KDMEntity
{
    private List<AbstractInventoryRelationship> inventoryRelationList = new ArrayList<AbstractInventoryRelationship>();

    /** 
     * Get the list of 'inventoryRelation' element items.
     * 
     * @return list
     */
    public List<AbstractInventoryRelationship> getInventoryRelations() {
        return inventoryRelationList;
    }

    /** 
     * Set the list of 'inventoryRelation' element items.
     * 
     * @param list
     */
    public void setInventoryRelations(List<AbstractInventoryRelationship> list) {
        inventoryRelationList = list;
    }
}

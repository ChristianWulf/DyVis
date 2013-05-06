
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DerivedType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Datatype">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:ItemUnit" name="itemUnit" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DerivedType extends Datatype
{
    private List<ItemUnit> itemUnitList = new ArrayList<ItemUnit>();

    /** 
     * Get the list of 'itemUnit' element items.
     * 
     * @return list
     */
    public List<ItemUnit> getItemUnits() {
        return itemUnitList;
    }

    /** 
     * Set the list of 'itemUnit' element items.
     * 
     * @param list
     */
    public void setItemUnits(List<ItemUnit> list) {
        itemUnitList = list;
    }
}

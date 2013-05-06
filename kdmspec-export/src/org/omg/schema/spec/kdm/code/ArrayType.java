
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:DerivedType">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:IndexUnit" name="indexUnit" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="size"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayType extends DerivedType
{
    private List<IndexUnit> indexUnitList = new ArrayList<IndexUnit>();
    private String size;

    /** 
     * Get the list of 'indexUnit' element items.
     * 
     * @return list
     */
    public List<IndexUnit> getIndexUnits() {
        return indexUnitList;
    }

    /** 
     * Set the list of 'indexUnit' element items.
     * 
     * @param list
     */
    public void setIndexUnits(List<IndexUnit> list) {
        indexUnitList = list;
    }

    /** 
     * Get the 'size' attribute value.
     * 
     * @return value
     */
    public String getSize() {
        return size;
    }

    /** 
     * Set the 'size' attribute value.
     * 
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }
}


package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.code.ItemUnit;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IndexElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:DataResource">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:ItemUnit" name="implementation" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="implementation"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IndexElement extends DataResource
{
    private List<ItemUnit> implementationList = new ArrayList<ItemUnit>();
    private String implementation;

    /** 
     * Get the list of 'implementation' element items.
     * 
     * @return list
     */
    public List<ItemUnit> getImplementations() {
        return implementationList;
    }

    /** 
     * Set the list of 'implementation' element items.
     * 
     * @param list
     */
    public void setImplementations(List<ItemUnit> list) {
        implementationList = list;
    }

    /** 
     * Get the 'implementation' attribute value.
     * 
     * @return value
     */
    public String getImplementation() {
        return implementation;
    }

    /** 
     * Set the 'implementation' attribute value.
     * 
     * @param implementation
     */
    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }
}

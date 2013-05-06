
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataContainer">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:DataResource">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:DataResource" name="dataElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataContainer extends DataResource
{
    private List<DataResource> dataElementList = new ArrayList<DataResource>();

    /** 
     * Get the list of 'dataElement' element items.
     * 
     * @return list
     */
    public List<DataResource> getDataElements() {
        return dataElementList;
    }

    /** 
     * Set the list of 'dataElement' element items.
     * 
     * @param list
     */
    public void setDataElements(List<DataResource> list) {
        dataElementList = list;
    }
}

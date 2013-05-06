
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.KDMModel;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataModel">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:KDMModel">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractDataElement" name="dataElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataModel extends KDMModel
{
    private List<AbstractDataElement> dataElementList = new ArrayList<AbstractDataElement>();

    /** 
     * Get the list of 'dataElement' element items.
     * 
     * @return list
     */
    public List<AbstractDataElement> getDataElements() {
        return dataElementList;
    }

    /** 
     * Set the list of 'dataElement' element items.
     * 
     * @param list
     */
    public void setDataElements(List<AbstractDataElement> list) {
        dataElementList = list;
    }
}

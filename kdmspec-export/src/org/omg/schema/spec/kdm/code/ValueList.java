
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ValueList">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ValueElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:ValueElement" name="valueElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ValueList extends ValueElement
{
    private List<ValueElement> valueElementList = new ArrayList<ValueElement>();

    /** 
     * Get the list of 'valueElement' element items.
     * 
     * @return list
     */
    public List<ValueElement> getValueElements() {
        return valueElementList;
    }

    /** 
     * Set the list of 'valueElement' element items.
     * 
     * @param list
     */
    public void setValueElements(List<ValueElement> list) {
        valueElementList = list;
    }
}

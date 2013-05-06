
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EnumeratedType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Datatype">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:Value" name="value" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EnumeratedType extends Datatype
{
    private List<Value> valueList = new ArrayList<Value>();

    /** 
     * Get the list of 'value' element items.
     * 
     * @return list
     */
    public List<Value> getValues() {
        return valueList;
    }

    /** 
     * Set the list of 'value' element items.
     * 
     * @param list
     */
    public void setValues(List<Value> list) {
        valueList = list;
    }
}

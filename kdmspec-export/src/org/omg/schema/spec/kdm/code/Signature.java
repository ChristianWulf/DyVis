
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Signature">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Datatype">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:ParameterUnit" name="parameterUnit" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Signature extends Datatype
{
    private List<ParameterUnit> parameterUnitList = new ArrayList<ParameterUnit>();

    /** 
     * Get the list of 'parameterUnit' element items.
     * 
     * @return list
     */
    public List<ParameterUnit> getParameterUnits() {
        return parameterUnitList;
    }

    /** 
     * Set the list of 'parameterUnit' element items.
     * 
     * @param list
     */
    public void setParameterUnits(List<ParameterUnit> list) {
        parameterUnitList = list;
    }
}

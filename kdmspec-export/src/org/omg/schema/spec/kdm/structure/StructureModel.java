
package org.omg.schema.spec.kdm.structure;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.KDMModel;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/structure" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructureModel">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMModel">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:AbstractStructureElement" name="structureElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructureModel extends KDMModel
{
    private List<AbstractStructureElement> structureElementList = new ArrayList<AbstractStructureElement>();

    /** 
     * Get the list of 'structureElement' element items.
     * 
     * @return list
     */
    public List<AbstractStructureElement> getStructureElements() {
        return structureElementList;
    }

    /** 
     * Set the list of 'structureElement' element items.
     * 
     * @param list
     */
    public void setStructureElements(List<AbstractStructureElement> list) {
        structureElementList = list;
    }
}

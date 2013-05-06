
package org.omg.schema.spec.kdm.conceptual;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.KDMModel;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/conceptual" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConceptualModel">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:KDMModel">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractConceptualElement" name="conceptualElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConceptualModel extends KDMModel
{
    private List<AbstractConceptualElement> conceptualElementList = new ArrayList<AbstractConceptualElement>();

    /** 
     * Get the list of 'conceptualElement' element items.
     * 
     * @return list
     */
    public List<AbstractConceptualElement> getConceptualElements() {
        return conceptualElementList;
    }

    /** 
     * Set the list of 'conceptualElement' element items.
     * 
     * @param list
     */
    public void setConceptualElements(List<AbstractConceptualElement> list) {
        conceptualElementList = list;
    }
}

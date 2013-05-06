
package org.omg.schema.spec.kdm.conceptual;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/conceptual" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConceptualRole">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractConceptualElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractConceptualElement" name="conceptualElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="conceptualElement"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConceptualRole extends AbstractConceptualElement
{
    private List<AbstractConceptualElement> conceptualElementList = new ArrayList<AbstractConceptualElement>();
    private String conceptualElement;

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

    /** 
     * Get the 'conceptualElement' attribute value.
     * 
     * @return value
     */
    public String getConceptualElement() {
        return conceptualElement;
    }

    /** 
     * Set the 'conceptualElement' attribute value.
     * 
     * @param conceptualElement
     */
    public void setConceptualElement(String conceptualElement) {
        this.conceptualElement = conceptualElement;
    }
}

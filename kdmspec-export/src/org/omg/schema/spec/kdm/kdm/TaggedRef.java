
package org.omg.schema.spec.kdm.kdm;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.ModelElement;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TaggedRef">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ExtendedValue">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:ModelElement" name="reference" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="reference"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TaggedRef extends ExtendedValue
{
    private List<ModelElement> referenceList = new ArrayList<ModelElement>();
    private String reference;

    /** 
     * Get the list of 'reference' element items.
     * 
     * @return list
     */
    public List<ModelElement> getReferences() {
        return referenceList;
    }

    /** 
     * Set the list of 'reference' element items.
     * 
     * @param list
     */
    public void setReferences(List<ModelElement> list) {
        referenceList = list;
    }

    /** 
     * Get the 'reference' attribute value.
     * 
     * @return value
     */
    public String getReference() {
        return reference;
    }

    /** 
     * Set the 'reference' attribute value.
     * 
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
}

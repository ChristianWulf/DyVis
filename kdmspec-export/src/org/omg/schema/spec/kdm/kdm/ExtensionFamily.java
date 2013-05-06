
package org.omg.schema.spec.kdm.kdm;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtensionFamily">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:Stereotype" name="stereotype" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="name"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtensionFamily extends Element
{
    private List<Stereotype> stereotypeList = new ArrayList<Stereotype>();
    private String name;

    /** 
     * Get the list of 'stereotype' element items.
     * 
     * @return list
     */
    public List<Stereotype> getStereotypes() {
        return stereotypeList;
    }

    /** 
     * Set the list of 'stereotype' element items.
     * 
     * @param list
     */
    public void setStereotypes(List<Stereotype> list) {
        stereotypeList = list;
    }

    /** 
     * Get the 'name' attribute value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' attribute value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}

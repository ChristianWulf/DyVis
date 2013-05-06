
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SimpleContentType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ComplexContentType">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:ComplexContentType" name="type" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *       &lt;xs:attribute type="xs:string" name="type"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SimpleContentType extends ComplexContentType
{
    private List<ComplexContentType> typeList = new ArrayList<ComplexContentType>();
    private String kind;
    private String type;

    /** 
     * Get the list of 'type' element items.
     * 
     * @return list
     */
    public List<ComplexContentType> getTypes() {
        return typeList;
    }

    /** 
     * Set the list of 'type' element items.
     * 
     * @param list
     */
    public void setTypes(List<ComplexContentType> list) {
        typeList = list;
    }

    /** 
     * Get the 'kind' attribute value.
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'kind' attribute value.
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'type' attribute value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' attribute value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}

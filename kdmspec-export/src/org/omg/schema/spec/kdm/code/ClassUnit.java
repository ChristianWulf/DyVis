
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ClassUnit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Datatype">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:CodeItem" name="codeElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="isAbstract"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ClassUnit extends Datatype
{
    private List<CodeItem> codeElementList = new ArrayList<CodeItem>();
    private String isAbstract;

    /** 
     * Get the list of 'codeElement' element items.
     * 
     * @return list
     */
    public List<CodeItem> getCodeElements() {
        return codeElementList;
    }

    /** 
     * Set the list of 'codeElement' element items.
     * 
     * @param list
     */
    public void setCodeElements(List<CodeItem> list) {
        codeElementList = list;
    }

    /** 
     * Get the 'isAbstract' attribute value.
     * 
     * @return value
     */
    public String getIsAbstract() {
        return isAbstract;
    }

    /** 
     * Set the 'isAbstract' attribute value.
     * 
     * @param isAbstract
     */
    public void setIsAbstract(String isAbstract) {
        this.isAbstract = isAbstract;
    }
}

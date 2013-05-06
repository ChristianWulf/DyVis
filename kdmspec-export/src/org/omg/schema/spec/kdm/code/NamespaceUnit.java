
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NamespaceUnit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:CodeItem">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:CodeItem" name="groupedCode" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="groupedCode"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NamespaceUnit extends CodeItem
{
    private List<CodeItem> groupedCodeList = new ArrayList<CodeItem>();
    private String groupedCode;

    /** 
     * Get the list of 'groupedCode' element items.
     * 
     * @return list
     */
    public List<CodeItem> getGroupedCodes() {
        return groupedCodeList;
    }

    /** 
     * Set the list of 'groupedCode' element items.
     * 
     * @param list
     */
    public void setGroupedCodes(List<CodeItem> list) {
        groupedCodeList = list;
    }

    /** 
     * Get the 'groupedCode' attribute value.
     * 
     * @return value
     */
    public String getGroupedCode() {
        return groupedCode;
    }

    /** 
     * Set the 'groupedCode' attribute value.
     * 
     * @param groupedCode
     */
    public void setGroupedCode(String groupedCode) {
        this.groupedCode = groupedCode;
    }
}

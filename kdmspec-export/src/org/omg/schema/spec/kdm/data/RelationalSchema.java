
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.code.CodeItem;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelationalSchema">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:DataContainer">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:CodeItem" name="codeElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelationalSchema extends DataContainer
{
    private List<CodeItem> codeElementList = new ArrayList<CodeItem>();

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
}

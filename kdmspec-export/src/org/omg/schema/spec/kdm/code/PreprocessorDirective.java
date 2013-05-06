
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PreprocessorDirective">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractCodeElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractCodeElement" name="codeElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PreprocessorDirective extends AbstractCodeElement
{
    private List<AbstractCodeElement> codeElementList = new ArrayList<AbstractCodeElement>();

    /** 
     * Get the list of 'codeElement' element items.
     * 
     * @return list
     */
    public List<AbstractCodeElement> getCodeElements() {
        return codeElementList;
    }

    /** 
     * Set the list of 'codeElement' element items.
     * 
     * @param list
     */
    public void setCodeElements(List<AbstractCodeElement> list) {
        codeElementList = list;
    }
}

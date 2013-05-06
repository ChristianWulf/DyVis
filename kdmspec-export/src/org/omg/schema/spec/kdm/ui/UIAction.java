
package org.omg.schema.spec.kdm.ui;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/ui" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UIAction">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractUIElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:UIEvent" name="UIElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UIAction extends AbstractUIElement
{
    private List<UIEvent> UIElementList = new ArrayList<UIEvent>();
    private String kind;

    /** 
     * Get the list of 'UIElement' element items.
     * 
     * @return list
     */
    public List<UIEvent> getUIElements() {
        return UIElementList;
    }

    /** 
     * Set the list of 'UIElement' element items.
     * 
     * @param list
     */
    public void setUIElements(List<UIEvent> list) {
        UIElementList = list;
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
}

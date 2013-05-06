
package org.omg.schema.spec.kdm.ui;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/ui" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UIResource">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractUIElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractUIElement" name="UIElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UIResource extends AbstractUIElement
{
    private List<AbstractUIElement> UIElementList = new ArrayList<AbstractUIElement>();

    /** 
     * Get the list of 'UIElement' element items.
     * 
     * @return list
     */
    public List<AbstractUIElement> getUIElements() {
        return UIElementList;
    }

    /** 
     * Set the list of 'UIElement' element items.
     * 
     * @param list
     */
    public void setUIElements(List<AbstractUIElement> list) {
        UIElementList = list;
    }
}

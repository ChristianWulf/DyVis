
package org.omg.schema.spec.kdm.kdm;

import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Annotation">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:attribute type="xs:string" name="text"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Annotation extends Element
{
    private String text;

    /** 
     * Get the 'text' attribute value.
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'text' attribute value.
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
}

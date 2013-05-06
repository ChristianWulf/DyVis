
package org.omg.schema.spec.kdm.source;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SourceFile">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:InventoryItem">
 *       &lt;xs:attribute type="xs:string" name="language"/>
 *       &lt;xs:attribute type="xs:string" name="encoding"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SourceFile extends InventoryItem
{
    private String language;
    private String encoding;

    /** 
     * Get the 'language' attribute value.
     * 
     * @return value
     */
    public String getLanguage() {
        return language;
    }

    /** 
     * Set the 'language' attribute value.
     * 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /** 
     * Get the 'encoding' attribute value.
     * 
     * @return value
     */
    public String getEncoding() {
        return encoding;
    }

    /** 
     * Set the 'encoding' attribute value.
     * 
     * @param encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}

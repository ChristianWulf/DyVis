
package org.omg.schema.spec.kdm.kdm;

import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Audit">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:attribute type="xs:string" name="description"/>
 *       &lt;xs:attribute type="xs:string" name="author"/>
 *       &lt;xs:attribute type="xs:string" name="date"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Audit extends Element
{
    private String description;
    private String author;
    private String date;

    /** 
     * Get the 'description' attribute value.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' attribute value.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'author' attribute value.
     * 
     * @return value
     */
    public String getAuthor() {
        return author;
    }

    /** 
     * Set the 'author' attribute value.
     * 
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /** 
     * Get the 'date' attribute value.
     * 
     * @return value
     */
    public String getDate() {
        return date;
    }

    /** 
     * Set the 'date' attribute value.
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
}

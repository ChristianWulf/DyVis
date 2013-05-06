
package org.omg.schema.spec.kdm.source;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SourceRef">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:SourceRegion" name="region" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="language"/>
 *       &lt;xs:attribute type="xs:string" name="snippet"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SourceRef extends Element
{
    private List<SourceRegion> regionList = new ArrayList<SourceRegion>();
    private String language;
    private String snippet;

    /** 
     * Get the list of 'region' element items.
     * 
     * @return list
     */
    public List<SourceRegion> getRegions() {
        return regionList;
    }

    /** 
     * Set the list of 'region' element items.
     * 
     * @param list
     */
    public void setRegions(List<SourceRegion> list) {
        regionList = list;
    }

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
     * Get the 'snippet' attribute value.
     * 
     * @return value
     */
    public String getSnippet() {
        return snippet;
    }

    /** 
     * Set the 'snippet' attribute value.
     * 
     * @param snippet
     */
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }
}

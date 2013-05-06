
package org.omg.schema.spec.kdm.source;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.Element;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/source" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SourceRegion">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Element">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns1:SourceFile" name="file" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="startLine"/>
 *       &lt;xs:attribute type="xs:string" name="startPosition"/>
 *       &lt;xs:attribute type="xs:string" name="endLine"/>
 *       &lt;xs:attribute type="xs:string" name="endPosition"/>
 *       &lt;xs:attribute type="xs:string" name="language"/>
 *       &lt;xs:attribute type="xs:string" name="path"/>
 *       &lt;xs:attribute type="xs:string" name="file"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SourceRegion extends Element
{
    private List<SourceFile> fileList = new ArrayList<SourceFile>();
    private String startLine;
    private String startPosition;
    private String endLine;
    private String endPosition;
    private String language;
    private String path;
    private String file;

    /** 
     * Get the list of 'file' element items.
     * 
     * @return list
     */
    public List<SourceFile> getFiles() {
        return fileList;
    }

    /** 
     * Set the list of 'file' element items.
     * 
     * @param list
     */
    public void setFiles(List<SourceFile> list) {
        fileList = list;
    }

    /** 
     * Get the 'startLine' attribute value.
     * 
     * @return value
     */
    public String getStartLine() {
        return startLine;
    }

    /** 
     * Set the 'startLine' attribute value.
     * 
     * @param startLine
     */
    public void setStartLine(String startLine) {
        this.startLine = startLine;
    }

    /** 
     * Get the 'startPosition' attribute value.
     * 
     * @return value
     */
    public String getStartPosition() {
        return startPosition;
    }

    /** 
     * Set the 'startPosition' attribute value.
     * 
     * @param startPosition
     */
    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    /** 
     * Get the 'endLine' attribute value.
     * 
     * @return value
     */
    public String getEndLine() {
        return endLine;
    }

    /** 
     * Set the 'endLine' attribute value.
     * 
     * @param endLine
     */
    public void setEndLine(String endLine) {
        this.endLine = endLine;
    }

    /** 
     * Get the 'endPosition' attribute value.
     * 
     * @return value
     */
    public String getEndPosition() {
        return endPosition;
    }

    /** 
     * Set the 'endPosition' attribute value.
     * 
     * @param endPosition
     */
    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
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
     * Get the 'path' attribute value.
     * 
     * @return value
     */
    public String getPath() {
        return path;
    }

    /** 
     * Set the 'path' attribute value.
     * 
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /** 
     * Get the 'file' attribute value.
     * 
     * @return value
     */
    public String getFile() {
        return file;
    }

    /** 
     * Set the 'file' attribute value.
     * 
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }
}

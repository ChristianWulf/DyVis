
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ContentItem">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractContentElement">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="type"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ContentItem extends AbstractContentElement
{
    private List<Choice> choice3List = new ArrayList<Choice>();
    private String type;

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoice3s() {
        return choice3List;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoice3s(List<Choice> list) {
        choice3List = list;
    }

    /** 
     * Get the 'type' attribute value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' attribute value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:ComplexContentType" name="type"/>
     *   &lt;xs:element type="ns:AbstractContentElement" name="contentElement"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice3Select = -1;
        private static final int TYPE_CHOICE = 0;
        private static final int CONTENT_ELEMENT_CHOICE = 1;
        private ComplexContentType type;
        private AbstractContentElement contentElement;

        private void setChoice3Select(int choice) {
            if (choice3Select == -1) {
                choice3Select = choice;
            } else if (choice3Select != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoice3Select() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoice3Select() {
            choice3Select = -1;
        }

        /** 
         * Check if Type is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifType() {
            return choice3Select == TYPE_CHOICE;
        }

        /** 
         * Get the 'type' element value.
         * 
         * @return value
         */
        public ComplexContentType getType() {
            return type;
        }

        /** 
         * Set the 'type' element value.
         * 
         * @param type
         */
        public void setType(ComplexContentType type) {
            setChoice3Select(TYPE_CHOICE);
            this.type = type;
        }

        /** 
         * Check if ContentElement is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifContentElement() {
            return choice3Select == CONTENT_ELEMENT_CHOICE;
        }

        /** 
         * Get the 'contentElement' element value.
         * 
         * @return value
         */
        public AbstractContentElement getContentElement() {
            return contentElement;
        }

        /** 
         * Set the 'contentElement' element value.
         * 
         * @param contentElement
         */
        public void setContentElement(AbstractContentElement contentElement) {
            setChoice3Select(CONTENT_ELEMENT_CHOICE);
            this.contentElement = contentElement;
        }
    }
}

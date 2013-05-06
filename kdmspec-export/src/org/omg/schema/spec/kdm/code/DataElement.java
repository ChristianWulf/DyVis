
package org.omg.schema.spec.kdm.code;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:ComputationalObject">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="ext"/>
 *       &lt;xs:attribute type="xs:string" name="size"/>
 *       &lt;xs:attribute type="xs:string" name="type"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataElement extends ComputationalObject
{
    private List<Choice> choice3List = new ArrayList<Choice>();
    private String ext;
    private String size;
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
     * Get the 'ext' attribute value.
     * 
     * @return value
     */
    public String getExt() {
        return ext;
    }

    /** 
     * Set the 'ext' attribute value.
     * 
     * @param ext
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /** 
     * Get the 'size' attribute value.
     * 
     * @return value
     */
    public String getSize() {
        return size;
    }

    /** 
     * Set the 'size' attribute value.
     * 
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
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
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:Datatype" name="type"/>
     *   &lt;xs:element type="ns:Datatype" name="codeElement"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice3Select = -1;
        private static final int TYPE_CHOICE = 0;
        private static final int CODE_ELEMENT_CHOICE = 1;
        private Datatype type;
        private Datatype codeElement;

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
        public Datatype getType() {
            return type;
        }

        /** 
         * Set the 'type' element value.
         * 
         * @param type
         */
        public void setType(Datatype type) {
            setChoice3Select(TYPE_CHOICE);
            this.type = type;
        }

        /** 
         * Check if CodeElement is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifCodeElement() {
            return choice3Select == CODE_ELEMENT_CHOICE;
        }

        /** 
         * Get the 'codeElement' element value.
         * 
         * @return value
         */
        public Datatype getCodeElement() {
            return codeElement;
        }

        /** 
         * Set the 'codeElement' element value.
         * 
         * @param codeElement
         */
        public void setCodeElement(Datatype codeElement) {
            setChoice3Select(CODE_ELEMENT_CHOICE);
            this.codeElement = codeElement;
        }
    }
}

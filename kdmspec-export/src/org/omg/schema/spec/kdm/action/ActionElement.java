
package org.omg.schema.spec.kdm.action;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.code.AbstractCodeElement;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/action" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActionElement">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractCodeElement">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ActionElement extends AbstractCodeElement
{
    private List<Choice> choice3List = new ArrayList<Choice>();
    private String kind;

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
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/code" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/action" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:AbstractCodeElement" name="codeElement"/>
     *   &lt;xs:element type="ns1:AbstractActionRelationship" name="actionRelation"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice3Select = -1;
        private static final int CODE_ELEMENT_CHOICE = 0;
        private static final int ACTION_RELATION_CHOICE = 1;
        private AbstractCodeElement codeElement;
        private AbstractActionRelationship actionRelation;

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
        public AbstractCodeElement getCodeElement() {
            return codeElement;
        }

        /** 
         * Set the 'codeElement' element value.
         * 
         * @param codeElement
         */
        public void setCodeElement(AbstractCodeElement codeElement) {
            setChoice3Select(CODE_ELEMENT_CHOICE);
            this.codeElement = codeElement;
        }

        /** 
         * Check if ActionRelation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifActionRelation() {
            return choice3Select == ACTION_RELATION_CHOICE;
        }

        /** 
         * Get the 'actionRelation' element value.
         * 
         * @return value
         */
        public AbstractActionRelationship getActionRelation() {
            return actionRelation;
        }

        /** 
         * Set the 'actionRelation' element value.
         * 
         * @param actionRelation
         */
        public void setActionRelation(AbstractActionRelationship actionRelation) {
            setChoice3Select(ACTION_RELATION_CHOICE);
            this.actionRelation = actionRelation;
        }
    }
}

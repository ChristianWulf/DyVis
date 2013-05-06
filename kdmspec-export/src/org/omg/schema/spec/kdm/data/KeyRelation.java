
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="KeyRelation">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractDataRelationship">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="to"/>
 *       &lt;xs:attribute type="xs:string" name="from"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class KeyRelation extends AbstractDataRelationship
{
    private List<Choice> choice2List = new ArrayList<Choice>();
    private String to;
    private String from;

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoice2s() {
        return choice2List;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoice2s(List<Choice> list) {
        choice2List = list;
    }

    /** 
     * Get the 'to' attribute value.
     * 
     * @return value
     */
    public String getTo() {
        return to;
    }

    /** 
     * Set the 'to' attribute value.
     * 
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /** 
     * Get the 'from' attribute value.
     * 
     * @return value
     */
    public String getFrom() {
        return from;
    }

    /** 
     * Set the 'from' attribute value.
     * 
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:UniqueKey" name="to"/>
     *   &lt;xs:element type="ns:ReferenceKey" name="from"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice2Select = -1;
        private static final int TO_CHOICE = 0;
        private static final int FROM_CHOICE = 1;
        private UniqueKey to;
        private ReferenceKey from;

        private void setChoice2Select(int choice) {
            if (choice2Select == -1) {
                choice2Select = choice;
            } else if (choice2Select != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoice2Select() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoice2Select() {
            choice2Select = -1;
        }

        /** 
         * Check if To is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTo() {
            return choice2Select == TO_CHOICE;
        }

        /** 
         * Get the 'to' element value.
         * 
         * @return value
         */
        public UniqueKey getTo() {
            return to;
        }

        /** 
         * Set the 'to' element value.
         * 
         * @param to
         */
        public void setTo(UniqueKey to) {
            setChoice2Select(TO_CHOICE);
            this.to = to;
        }

        /** 
         * Check if From is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifFrom() {
            return choice2Select == FROM_CHOICE;
        }

        /** 
         * Get the 'from' element value.
         * 
         * @return value
         */
        public ReferenceKey getFrom() {
            return from;
        }

        /** 
         * Set the 'from' element value.
         * 
         * @param from
         */
        public void setFrom(ReferenceKey from) {
            setChoice2Select(FROM_CHOICE);
            this.from = from;
        }
    }
}

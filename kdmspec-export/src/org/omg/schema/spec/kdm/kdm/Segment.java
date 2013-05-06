
package org.omg.schema.spec.kdm.kdm;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Segment">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:KDMFramework">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Segment extends KDMFramework
{
    private List<Choice> choice3List = new ArrayList<Choice>();

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
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:Segment" name="segment"/>
     *   &lt;xs:element type="ns:KDMModel" name="model"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice3Select = -1;
        private static final int SEGMENT_CHOICE = 0;
        private static final int MODEL_CHOICE = 1;
        private Segment segment;
        private KDMModel model;

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
         * Check if Segment is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifSegment() {
            return choice3Select == SEGMENT_CHOICE;
        }

        /** 
         * Get the 'segment' element value.
         * 
         * @return value
         */
        public Segment getSegment() {
            return segment;
        }

        /** 
         * Set the 'segment' element value.
         * 
         * @param segment
         */
        public void setSegment(Segment segment) {
            setChoice3Select(SEGMENT_CHOICE);
            this.segment = segment;
        }

        /** 
         * Check if Model is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifModel() {
            return choice3Select == MODEL_CHOICE;
        }

        /** 
         * Get the 'model' element value.
         * 
         * @return value
         */
        public KDMModel getModel() {
            return model;
        }

        /** 
         * Set the 'model' element value.
         * 
         * @param model
         */
        public void setModel(KDMModel model) {
            setChoice3Select(MODEL_CHOICE);
            this.model = model;
        }
    }
}

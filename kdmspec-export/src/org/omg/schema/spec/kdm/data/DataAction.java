
package org.omg.schema.spec.kdm.data;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.action.ActionElement;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataAction">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractDataElement">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="kind"/>
 *       &lt;xs:attribute type="xs:string" name="implementation"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataAction extends AbstractDataElement
{
    private List<Choice> choice3List = new ArrayList<Choice>();
    private String kind;
    private String implementation;

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
     * Get the 'implementation' attribute value.
     * 
     * @return value
     */
    public String getImplementation() {
        return implementation;
    }

    /** 
     * Set the 'implementation' attribute value.
     * 
     * @param implementation
     */
    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/data" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/action" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns1:ActionElement" name="implementation"/>
     *   &lt;xs:element type="ns:DataEvent" name="dataElement"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice3Select = -1;
        private static final int IMPLEMENTATION_CHOICE = 0;
        private static final int DATA_ELEMENT_CHOICE = 1;
        private ActionElement implementation;
        private DataEvent dataElement;

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
         * Check if Implementation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifImplementation() {
            return choice3Select == IMPLEMENTATION_CHOICE;
        }

        /** 
         * Get the 'implementation' element value.
         * 
         * @return value
         */
        public ActionElement getImplementation() {
            return implementation;
        }

        /** 
         * Set the 'implementation' element value.
         * 
         * @param implementation
         */
        public void setImplementation(ActionElement implementation) {
            setChoice3Select(IMPLEMENTATION_CHOICE);
            this.implementation = implementation;
        }

        /** 
         * Check if DataElement is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDataElement() {
            return choice3Select == DATA_ELEMENT_CHOICE;
        }

        /** 
         * Get the 'dataElement' element value.
         * 
         * @return value
         */
        public DataEvent getDataElement() {
            return dataElement;
        }

        /** 
         * Set the 'dataElement' element value.
         * 
         * @param dataElement
         */
        public void setDataElement(DataEvent dataElement) {
            setChoice3Select(DATA_ELEMENT_CHOICE);
            this.dataElement = dataElement;
        }
    }
}

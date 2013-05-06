
package org.omg.schema.spec.kdm.build;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.core.KDMEntity;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/build" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BuildResource">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractBuildElement">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *       &lt;xs:attribute type="xs:string" name="implementation"/>
 *       &lt;xs:attribute type="xs:string" name="groupedBuild"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BuildResource extends AbstractBuildElement
{
    private List<Choice> choice2List = new ArrayList<Choice>();
    private String implementation;
    private String groupedBuild;

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
     * Get the 'groupedBuild' attribute value.
     * 
     * @return value
     */
    public String getGroupedBuild() {
        return groupedBuild;
    }

    /** 
     * Set the 'groupedBuild' attribute value.
     * 
     * @param groupedBuild
     */
    public void setGroupedBuild(String groupedBuild) {
        this.groupedBuild = groupedBuild;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/core" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/build" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:KDMEntity" name="implementation"/>
     *   &lt;xs:element type="ns1:AbstractBuildElement" name="groupedBuild"/>
     *   &lt;xs:element type="ns1:AbstractBuildElement" name="buildElement"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice2Select = -1;
        private static final int IMPLEMENTATION_CHOICE = 0;
        private static final int GROUPED_BUILD_CHOICE = 1;
        private static final int BUILD_ELEMENT_CHOICE = 2;
        private KDMEntity implementation;
        private AbstractBuildElement groupedBuild;
        private AbstractBuildElement buildElement;

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
         * Check if Implementation is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifImplementation() {
            return choice2Select == IMPLEMENTATION_CHOICE;
        }

        /** 
         * Get the 'implementation' element value.
         * 
         * @return value
         */
        public KDMEntity getImplementation() {
            return implementation;
        }

        /** 
         * Set the 'implementation' element value.
         * 
         * @param implementation
         */
        public void setImplementation(KDMEntity implementation) {
            setChoice2Select(IMPLEMENTATION_CHOICE);
            this.implementation = implementation;
        }

        /** 
         * Check if GroupedBuild is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifGroupedBuild() {
            return choice2Select == GROUPED_BUILD_CHOICE;
        }

        /** 
         * Get the 'groupedBuild' element value.
         * 
         * @return value
         */
        public AbstractBuildElement getGroupedBuild() {
            return groupedBuild;
        }

        /** 
         * Set the 'groupedBuild' element value.
         * 
         * @param groupedBuild
         */
        public void setGroupedBuild(AbstractBuildElement groupedBuild) {
            setChoice2Select(GROUPED_BUILD_CHOICE);
            this.groupedBuild = groupedBuild;
        }

        /** 
         * Check if BuildElement is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifBuildElement() {
            return choice2Select == BUILD_ELEMENT_CHOICE;
        }

        /** 
         * Get the 'buildElement' element value.
         * 
         * @return value
         */
        public AbstractBuildElement getBuildElement() {
            return buildElement;
        }

        /** 
         * Set the 'buildElement' element value.
         * 
         * @param buildElement
         */
        public void setBuildElement(AbstractBuildElement buildElement) {
            setChoice2Select(BUILD_ELEMENT_CHOICE);
            this.buildElement = buildElement;
        }
    }
}

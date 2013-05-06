
package org.omg.schema.spec.kdm.platform;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/platform" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Machine">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractPlatformElement">
 *       &lt;xs:choice minOccurs="0" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Choice -->
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Machine extends AbstractPlatformElement
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
     * &lt;xs:choice xmlns:ns="http://schema.omg.org/spec/KDM/1.2/platform" xmlns:xs="http://www.w3.org/2001/XMLSchema" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:element type="ns:DeployedComponent" name="deployedComponent"/>
     *   &lt;xs:element type="ns:DeployedResource" name="deployedResource"/>
     * &lt;/xs:choice>
     * </pre>
     */
    public static class Choice
    {
        private int choice3Select = -1;
        private static final int DEPLOYED_COMPONENT_CHOICE = 0;
        private static final int DEPLOYED_RESOURCE_CHOICE = 1;
        private DeployedComponent deployedComponent;
        private DeployedResource deployedResource;

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
         * Check if DeployedComponent is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDeployedComponent() {
            return choice3Select == DEPLOYED_COMPONENT_CHOICE;
        }

        /** 
         * Get the 'deployedComponent' element value.
         * 
         * @return value
         */
        public DeployedComponent getDeployedComponent() {
            return deployedComponent;
        }

        /** 
         * Set the 'deployedComponent' element value.
         * 
         * @param deployedComponent
         */
        public void setDeployedComponent(DeployedComponent deployedComponent) {
            setChoice3Select(DEPLOYED_COMPONENT_CHOICE);
            this.deployedComponent = deployedComponent;
        }

        /** 
         * Check if DeployedResource is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifDeployedResource() {
            return choice3Select == DEPLOYED_RESOURCE_CHOICE;
        }

        /** 
         * Get the 'deployedResource' element value.
         * 
         * @return value
         */
        public DeployedResource getDeployedResource() {
            return deployedResource;
        }

        /** 
         * Set the 'deployedResource' element value.
         * 
         * @param deployedResource
         */
        public void setDeployedResource(DeployedResource deployedResource) {
            setChoice3Select(DEPLOYED_RESOURCE_CHOICE);
            this.deployedResource = deployedResource;
        }
    }
}

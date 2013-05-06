
package org.omg.schema.spec.kdm.event;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/event" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EventResource">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AbstractEventElement">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractEventElement" name="eventElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EventResource extends AbstractEventElement
{
    private List<AbstractEventElement> eventElementList = new ArrayList<AbstractEventElement>();

    /** 
     * Get the list of 'eventElement' element items.
     * 
     * @return list
     */
    public List<AbstractEventElement> getEventElements() {
        return eventElementList;
    }

    /** 
     * Set the list of 'eventElement' element items.
     * 
     * @param list
     */
    public void setEventElements(List<AbstractEventElement> list) {
        eventElementList = list;
    }
}


package org.omg.schema.spec.kdm.event;

import java.util.ArrayList;
import java.util.List;
import org.omg.schema.spec.kdm.kdm.KDMModel;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schema.omg.org/spec/KDM/1.2/event" xmlns:ns1="http://schema.omg.org/spec/KDM/1.2/kdm" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="EventModel">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:KDMModel">
 *       &lt;xs:choice>
 *         &lt;xs:element type="ns:AbstractEventElement" name="eventElement" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:choice>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class EventModel extends KDMModel
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

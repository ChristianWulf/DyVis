//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.event;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.schema.spec.kdm._1_1.event package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadsState_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "ReadsState");
    private final static QName _EventResource_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "EventResource");
    private final static QName _AbstractEventElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "AbstractEventElement");
    private final static QName _ConsumesEvent_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "ConsumesEvent");
    private final static QName _HasState_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "HasState");
    private final static QName _State_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "State");
    private final static QName _OnExit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "OnExit");
    private final static QName _Transition_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "Transition");
    private final static QName _EventModel_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "EventModel");
    private final static QName _AbstractEventRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "AbstractEventRelationship");
    private final static QName _EventAction_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "EventAction");
    private final static QName _ProducesEvent_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "ProducesEvent");
    private final static QName _InitialState_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "InitialState");
    private final static QName _Event_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "Event");
    private final static QName _EventElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "EventElement");
    private final static QName _OnEntry_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "OnEntry");
    private final static QName _NextState_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "NextState");
    private final static QName _EventRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/event", "EventRelationship");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.schema.spec.kdm._1_1.event
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProducesEvent }
     * 
     */
    public ProducesEvent createProducesEvent() {
        return new ProducesEvent();
    }

    /**
     * Create an instance of {@link NextState }
     * 
     */
    public NextState createNextState() {
        return new NextState();
    }

    /**
     * Create an instance of {@link OnEntry }
     * 
     */
    public OnEntry createOnEntry() {
        return new OnEntry();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link EventElement }
     * 
     */
    public EventElement createEventElement() {
        return new EventElement();
    }

    /**
     * Create an instance of {@link ConsumesEvent }
     * 
     */
    public ConsumesEvent createConsumesEvent() {
        return new ConsumesEvent();
    }

    /**
     * Create an instance of {@link EventAction }
     * 
     */
    public EventAction createEventAction() {
        return new EventAction();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link HasState }
     * 
     */
    public HasState createHasState() {
        return new HasState();
    }

    /**
     * Create an instance of {@link ReadsState }
     * 
     */
    public ReadsState createReadsState() {
        return new ReadsState();
    }

    /**
     * Create an instance of {@link EventModel }
     * 
     */
    public EventModel createEventModel() {
        return new EventModel();
    }

    /**
     * Create an instance of {@link EventResource }
     * 
     */
    public EventResource createEventResource() {
        return new EventResource();
    }

    /**
     * Create an instance of {@link OnExit }
     * 
     */
    public OnExit createOnExit() {
        return new OnExit();
    }

    /**
     * Create an instance of {@link InitialState }
     * 
     */
    public InitialState createInitialState() {
        return new InitialState();
    }

    /**
     * Create an instance of {@link Transition }
     * 
     */
    public Transition createTransition() {
        return new Transition();
    }

    /**
     * Create an instance of {@link EventRelationship }
     * 
     */
    public EventRelationship createEventRelationship() {
        return new EventRelationship();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "ReadsState")
    public JAXBElement<ReadsState> createReadsState(ReadsState value) {
        return new JAXBElement<ReadsState>(_ReadsState_QNAME, ReadsState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "EventResource")
    public JAXBElement<EventResource> createEventResource(EventResource value) {
        return new JAXBElement<EventResource>(_EventResource_QNAME, EventResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEventElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "AbstractEventElement")
    public JAXBElement<AbstractEventElement> createAbstractEventElement(AbstractEventElement value) {
        return new JAXBElement<AbstractEventElement>(_AbstractEventElement_QNAME, AbstractEventElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumesEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "ConsumesEvent")
    public JAXBElement<ConsumesEvent> createConsumesEvent(ConsumesEvent value) {
        return new JAXBElement<ConsumesEvent>(_ConsumesEvent_QNAME, ConsumesEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "HasState")
    public JAXBElement<HasState> createHasState(HasState value) {
        return new JAXBElement<HasState>(_HasState_QNAME, HasState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link State }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "State")
    public JAXBElement<State> createState(State value) {
        return new JAXBElement<State>(_State_QNAME, State.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnExit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "OnExit")
    public JAXBElement<OnExit> createOnExit(OnExit value) {
        return new JAXBElement<OnExit>(_OnExit_QNAME, OnExit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "Transition")
    public JAXBElement<Transition> createTransition(Transition value) {
        return new JAXBElement<Transition>(_Transition_QNAME, Transition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "EventModel")
    public JAXBElement<EventModel> createEventModel(EventModel value) {
        return new JAXBElement<EventModel>(_EventModel_QNAME, EventModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEventRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "AbstractEventRelationship")
    public JAXBElement<AbstractEventRelationship> createAbstractEventRelationship(AbstractEventRelationship value) {
        return new JAXBElement<AbstractEventRelationship>(_AbstractEventRelationship_QNAME, AbstractEventRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "EventAction")
    public JAXBElement<EventAction> createEventAction(EventAction value) {
        return new JAXBElement<EventAction>(_EventAction_QNAME, EventAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProducesEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "ProducesEvent")
    public JAXBElement<ProducesEvent> createProducesEvent(ProducesEvent value) {
        return new JAXBElement<ProducesEvent>(_ProducesEvent_QNAME, ProducesEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitialState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "InitialState")
    public JAXBElement<InitialState> createInitialState(InitialState value) {
        return new JAXBElement<InitialState>(_InitialState_QNAME, InitialState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "Event")
    public JAXBElement<Event> createEvent(Event value) {
        return new JAXBElement<Event>(_Event_QNAME, Event.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "EventElement")
    public JAXBElement<EventElement> createEventElement(EventElement value) {
        return new JAXBElement<EventElement>(_EventElement_QNAME, EventElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "OnEntry")
    public JAXBElement<OnEntry> createOnEntry(OnEntry value) {
        return new JAXBElement<OnEntry>(_OnEntry_QNAME, OnEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NextState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "NextState")
    public JAXBElement<NextState> createNextState(NextState value) {
        return new JAXBElement<NextState>(_NextState_QNAME, NextState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/event", name = "EventRelationship")
    public JAXBElement<EventRelationship> createEventRelationship(EventRelationship value) {
        return new JAXBElement<EventRelationship>(_EventRelationship_QNAME, EventRelationship.class, null, value);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.action;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.schema.spec.kdm._1_1.action package. 
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

    private final static QName _GuardedFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "GuardedFlow");
    private final static QName _AbstractActionRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "AbstractActionRelationship");
    private final static QName _ActionElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "ActionElement");
    private final static QName _FalseFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "FalseFlow");
    private final static QName _Reads_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Reads");
    private final static QName _ExceptionUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "ExceptionUnit");
    private final static QName _Dispatches_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Dispatches");
    private final static QName _ExceptionFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "ExceptionFlow");
    private final static QName _CompliesTo_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "CompliesTo");
    private final static QName _TrueFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "TrueFlow");
    private final static QName _Creates_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Creates");
    private final static QName _UsesType_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "UsesType");
    private final static QName _ActionRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "ActionRelationship");
    private final static QName _ControlFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "ControlFlow");
    private final static QName _EntryFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "EntryFlow");
    private final static QName _Calls_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Calls");
    private final static QName _Throws_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Throws");
    private final static QName _TryUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "TryUnit");
    private final static QName _CatchUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "CatchUnit");
    private final static QName _FinallyUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "FinallyUnit");
    private final static QName _Addresses_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Addresses");
    private final static QName _Flow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Flow");
    private final static QName _BlockUnit_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "BlockUnit");
    private final static QName _Writes_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "Writes");
    private final static QName _ExitFlow_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/action", "ExitFlow");
    private final static QName _ExceptionFlowTo_QNAME = new QName("", "to");
    private final static QName _ExceptionFlowFrom_QNAME = new QName("", "from");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.schema.spec.kdm._1_1.action
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calls }
     * 
     */
    public Calls createCalls() {
        return new Calls();
    }

    /**
     * Create an instance of {@link Flow }
     * 
     */
    public Flow createFlow() {
        return new Flow();
    }

    /**
     * Create an instance of {@link CatchUnit }
     * 
     */
    public CatchUnit createCatchUnit() {
        return new CatchUnit();
    }

    /**
     * Create an instance of {@link ExceptionUnit }
     * 
     */
    public ExceptionUnit createExceptionUnit() {
        return new ExceptionUnit();
    }

    /**
     * Create an instance of {@link TrueFlow }
     * 
     */
    public TrueFlow createTrueFlow() {
        return new TrueFlow();
    }

    /**
     * Create an instance of {@link ExceptionFlow }
     * 
     */
    public ExceptionFlow createExceptionFlow() {
        return new ExceptionFlow();
    }

    /**
     * Create an instance of {@link BlockUnit }
     * 
     */
    public BlockUnit createBlockUnit() {
        return new BlockUnit();
    }

    /**
     * Create an instance of {@link TryUnit }
     * 
     */
    public TryUnit createTryUnit() {
        return new TryUnit();
    }

    /**
     * Create an instance of {@link Writes }
     * 
     */
    public Writes createWrites() {
        return new Writes();
    }

    /**
     * Create an instance of {@link FinallyUnit }
     * 
     */
    public FinallyUnit createFinallyUnit() {
        return new FinallyUnit();
    }

    /**
     * Create an instance of {@link ActionElement }
     * 
     */
    public ActionElement createActionElement() {
        return new ActionElement();
    }

    /**
     * Create an instance of {@link EntryFlow }
     * 
     */
    public EntryFlow createEntryFlow() {
        return new EntryFlow();
    }

    /**
     * Create an instance of {@link Creates }
     * 
     */
    public Creates createCreates() {
        return new Creates();
    }

    /**
     * Create an instance of {@link Reads }
     * 
     */
    public Reads createReads() {
        return new Reads();
    }

    /**
     * Create an instance of {@link UsesType }
     * 
     */
    public UsesType createUsesType() {
        return new UsesType();
    }

    /**
     * Create an instance of {@link ControlFlow }
     * 
     */
    public ControlFlow createControlFlow() {
        return new ControlFlow();
    }

    /**
     * Create an instance of {@link ActionRelationship }
     * 
     */
    public ActionRelationship createActionRelationship() {
        return new ActionRelationship();
    }

    /**
     * Create an instance of {@link Throws }
     * 
     */
    public Throws createThrows() {
        return new Throws();
    }

    /**
     * Create an instance of {@link CompliesTo }
     * 
     */
    public CompliesTo createCompliesTo() {
        return new CompliesTo();
    }

    /**
     * Create an instance of {@link Dispatches }
     * 
     */
    public Dispatches createDispatches() {
        return new Dispatches();
    }

    /**
     * Create an instance of {@link FalseFlow }
     * 
     */
    public FalseFlow createFalseFlow() {
        return new FalseFlow();
    }

    /**
     * Create an instance of {@link ExitFlow }
     * 
     */
    public ExitFlow createExitFlow() {
        return new ExitFlow();
    }

    /**
     * Create an instance of {@link Addresses }
     * 
     */
    public Addresses createAddresses() {
        return new Addresses();
    }

    /**
     * Create an instance of {@link GuardedFlow }
     * 
     */
    public GuardedFlow createGuardedFlow() {
        return new GuardedFlow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardedFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "GuardedFlow")
    public JAXBElement<GuardedFlow> createGuardedFlow(GuardedFlow value) {
        return new JAXBElement<GuardedFlow>(_GuardedFlow_QNAME, GuardedFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractActionRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "AbstractActionRelationship")
    public JAXBElement<AbstractActionRelationship> createAbstractActionRelationship(AbstractActionRelationship value) {
        return new JAXBElement<AbstractActionRelationship>(_AbstractActionRelationship_QNAME, AbstractActionRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "ActionElement")
    public JAXBElement<ActionElement> createActionElement(ActionElement value) {
        return new JAXBElement<ActionElement>(_ActionElement_QNAME, ActionElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FalseFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "FalseFlow")
    public JAXBElement<FalseFlow> createFalseFlow(FalseFlow value) {
        return new JAXBElement<FalseFlow>(_FalseFlow_QNAME, FalseFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Reads")
    public JAXBElement<Reads> createReads(Reads value) {
        return new JAXBElement<Reads>(_Reads_QNAME, Reads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "ExceptionUnit")
    public JAXBElement<ExceptionUnit> createExceptionUnit(ExceptionUnit value) {
        return new JAXBElement<ExceptionUnit>(_ExceptionUnit_QNAME, ExceptionUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dispatches }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Dispatches")
    public JAXBElement<Dispatches> createDispatches(Dispatches value) {
        return new JAXBElement<Dispatches>(_Dispatches_QNAME, Dispatches.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "ExceptionFlow")
    public JAXBElement<ExceptionFlow> createExceptionFlow(ExceptionFlow value) {
        return new JAXBElement<ExceptionFlow>(_ExceptionFlow_QNAME, ExceptionFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompliesTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "CompliesTo")
    public JAXBElement<CompliesTo> createCompliesTo(CompliesTo value) {
        return new JAXBElement<CompliesTo>(_CompliesTo_QNAME, CompliesTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrueFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "TrueFlow")
    public JAXBElement<TrueFlow> createTrueFlow(TrueFlow value) {
        return new JAXBElement<TrueFlow>(_TrueFlow_QNAME, TrueFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Creates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Creates")
    public JAXBElement<Creates> createCreates(Creates value) {
        return new JAXBElement<Creates>(_Creates_QNAME, Creates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "UsesType")
    public JAXBElement<UsesType> createUsesType(UsesType value) {
        return new JAXBElement<UsesType>(_UsesType_QNAME, UsesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "ActionRelationship")
    public JAXBElement<ActionRelationship> createActionRelationship(ActionRelationship value) {
        return new JAXBElement<ActionRelationship>(_ActionRelationship_QNAME, ActionRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "ControlFlow")
    public JAXBElement<ControlFlow> createControlFlow(ControlFlow value) {
        return new JAXBElement<ControlFlow>(_ControlFlow_QNAME, ControlFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "EntryFlow")
    public JAXBElement<EntryFlow> createEntryFlow(EntryFlow value) {
        return new JAXBElement<EntryFlow>(_EntryFlow_QNAME, EntryFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calls }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Calls")
    public JAXBElement<Calls> createCalls(Calls value) {
        return new JAXBElement<Calls>(_Calls_QNAME, Calls.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Throws }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Throws")
    public JAXBElement<Throws> createThrows(Throws value) {
        return new JAXBElement<Throws>(_Throws_QNAME, Throws.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TryUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "TryUnit")
    public JAXBElement<TryUnit> createTryUnit(TryUnit value) {
        return new JAXBElement<TryUnit>(_TryUnit_QNAME, TryUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatchUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "CatchUnit")
    public JAXBElement<CatchUnit> createCatchUnit(CatchUnit value) {
        return new JAXBElement<CatchUnit>(_CatchUnit_QNAME, CatchUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinallyUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "FinallyUnit")
    public JAXBElement<FinallyUnit> createFinallyUnit(FinallyUnit value) {
        return new JAXBElement<FinallyUnit>(_FinallyUnit_QNAME, FinallyUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addresses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Addresses")
    public JAXBElement<Addresses> createAddresses(Addresses value) {
        return new JAXBElement<Addresses>(_Addresses_QNAME, Addresses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Flow")
    public JAXBElement<Flow> createFlow(Flow value) {
        return new JAXBElement<Flow>(_Flow_QNAME, Flow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "BlockUnit")
    public JAXBElement<BlockUnit> createBlockUnit(BlockUnit value) {
        return new JAXBElement<BlockUnit>(_BlockUnit_QNAME, BlockUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Writes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "Writes")
    public JAXBElement<Writes> createWrites(Writes value) {
        return new JAXBElement<Writes>(_Writes_QNAME, Writes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitFlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/action", name = "ExitFlow")
    public JAXBElement<ExitFlow> createExitFlow(ExitFlow value) {
        return new JAXBElement<ExitFlow>(_ExitFlow_QNAME, ExitFlow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "to", scope = ExceptionFlow.class)
    public JAXBElement<ActionElement> createExceptionFlowTo(ActionElement value) {
        return new JAXBElement<ActionElement>(_ExceptionFlowTo_QNAME, ActionElement.class, ExceptionFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "from", scope = ExceptionFlow.class)
    public JAXBElement<ActionElement> createExceptionFlowFrom(ActionElement value) {
        return new JAXBElement<ActionElement>(_ExceptionFlowFrom_QNAME, ActionElement.class, ExceptionFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "to", scope = ControlFlow.class)
    public JAXBElement<ActionElement> createControlFlowTo(ActionElement value) {
        return new JAXBElement<ActionElement>(_ExceptionFlowTo_QNAME, ActionElement.class, ControlFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "from", scope = ControlFlow.class)
    public JAXBElement<ActionElement> createControlFlowFrom(ActionElement value) {
        return new JAXBElement<ActionElement>(_ExceptionFlowFrom_QNAME, ActionElement.class, ControlFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "to", scope = ExitFlow.class)
    public JAXBElement<ActionElement> createExitFlowTo(ActionElement value) {
        return new JAXBElement<ActionElement>(_ExceptionFlowTo_QNAME, ActionElement.class, ExitFlow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "from", scope = ExitFlow.class)
    public JAXBElement<ActionElement> createExitFlowFrom(ActionElement value) {
        return new JAXBElement<ActionElement>(_ExceptionFlowFrom_QNAME, ActionElement.class, ExitFlow.class, value);
    }

}
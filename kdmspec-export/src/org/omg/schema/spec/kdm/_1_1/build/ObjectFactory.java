//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.build;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.omg.schema.spec.kdm._1_1.core.KDMEntity;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.schema.spec.kdm._1_1.build package. 
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

    private final static QName _Supplier_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "Supplier");
    private final static QName _Consumes_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "Consumes");
    private final static QName _BuildStep_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildStep");
    private final static QName _Produces_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "Produces");
    private final static QName _DescribedBy_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "DescribedBy");
    private final static QName _Tool_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "Tool");
    private final static QName _BuildResource_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildResource");
    private final static QName _BuildComponent_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildComponent");
    private final static QName _BuildRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildRelationship");
    private final static QName _SupportedBy_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "SupportedBy");
    private final static QName _LinksTo_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "LinksTo");
    private final static QName _BuildProduct_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildProduct");
    private final static QName _BuildModel_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildModel");
    private final static QName _SuppliedBy_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "SuppliedBy");
    private final static QName _BuildElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildElement");
    private final static QName _SymbolicLink_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "SymbolicLink");
    private final static QName _BuildDescription_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "BuildDescription");
    private final static QName _AbstractBuildRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "AbstractBuildRelationship");
    private final static QName _AbstractBuildElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "AbstractBuildElement");
    private final static QName _Library_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/build", "Library");
    private final static QName _BuildResourceGroupedBuild_QNAME = new QName("", "groupedBuild");
    private final static QName _BuildResourceBuildElement_QNAME = new QName("", "buildElement");
    private final static QName _BuildResourceImplementation_QNAME = new QName("", "implementation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.schema.spec.kdm._1_1.build
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Produces }
     * 
     */
    public Produces createProduces() {
        return new Produces();
    }

    /**
     * Create an instance of {@link DescribedBy }
     * 
     */
    public DescribedBy createDescribedBy() {
        return new DescribedBy();
    }

    /**
     * Create an instance of {@link BuildElement }
     * 
     */
    public BuildElement createBuildElement() {
        return new BuildElement();
    }

    /**
     * Create an instance of {@link BuildResource }
     * 
     */
    public BuildResource createBuildResource() {
        return new BuildResource();
    }

    /**
     * Create an instance of {@link LinksTo }
     * 
     */
    public LinksTo createLinksTo() {
        return new LinksTo();
    }

    /**
     * Create an instance of {@link SymbolicLink }
     * 
     */
    public SymbolicLink createSymbolicLink() {
        return new SymbolicLink();
    }

    /**
     * Create an instance of {@link BuildProduct }
     * 
     */
    public BuildProduct createBuildProduct() {
        return new BuildProduct();
    }

    /**
     * Create an instance of {@link BuildComponent }
     * 
     */
    public BuildComponent createBuildComponent() {
        return new BuildComponent();
    }

    /**
     * Create an instance of {@link BuildDescription }
     * 
     */
    public BuildDescription createBuildDescription() {
        return new BuildDescription();
    }

    /**
     * Create an instance of {@link BuildStep }
     * 
     */
    public BuildStep createBuildStep() {
        return new BuildStep();
    }

    /**
     * Create an instance of {@link BuildModel }
     * 
     */
    public BuildModel createBuildModel() {
        return new BuildModel();
    }

    /**
     * Create an instance of {@link SupportedBy }
     * 
     */
    public SupportedBy createSupportedBy() {
        return new SupportedBy();
    }

    /**
     * Create an instance of {@link Supplier }
     * 
     */
    public Supplier createSupplier() {
        return new Supplier();
    }

    /**
     * Create an instance of {@link Tool }
     * 
     */
    public Tool createTool() {
        return new Tool();
    }

    /**
     * Create an instance of {@link Consumes }
     * 
     */
    public Consumes createConsumes() {
        return new Consumes();
    }

    /**
     * Create an instance of {@link SuppliedBy }
     * 
     */
    public SuppliedBy createSuppliedBy() {
        return new SuppliedBy();
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link BuildRelationship }
     * 
     */
    public BuildRelationship createBuildRelationship() {
        return new BuildRelationship();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "Supplier")
    public JAXBElement<Supplier> createSupplier(Supplier value) {
        return new JAXBElement<Supplier>(_Supplier_QNAME, Supplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consumes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "Consumes")
    public JAXBElement<Consumes> createConsumes(Consumes value) {
        return new JAXBElement<Consumes>(_Consumes_QNAME, Consumes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildStep")
    public JAXBElement<BuildStep> createBuildStep(BuildStep value) {
        return new JAXBElement<BuildStep>(_BuildStep_QNAME, BuildStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "Produces")
    public JAXBElement<Produces> createProduces(Produces value) {
        return new JAXBElement<Produces>(_Produces_QNAME, Produces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescribedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "DescribedBy")
    public JAXBElement<DescribedBy> createDescribedBy(DescribedBy value) {
        return new JAXBElement<DescribedBy>(_DescribedBy_QNAME, DescribedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tool }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "Tool")
    public JAXBElement<Tool> createTool(Tool value) {
        return new JAXBElement<Tool>(_Tool_QNAME, Tool.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildResource")
    public JAXBElement<BuildResource> createBuildResource(BuildResource value) {
        return new JAXBElement<BuildResource>(_BuildResource_QNAME, BuildResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildComponent")
    public JAXBElement<BuildComponent> createBuildComponent(BuildComponent value) {
        return new JAXBElement<BuildComponent>(_BuildComponent_QNAME, BuildComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildRelationship")
    public JAXBElement<BuildRelationship> createBuildRelationship(BuildRelationship value) {
        return new JAXBElement<BuildRelationship>(_BuildRelationship_QNAME, BuildRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "SupportedBy")
    public JAXBElement<SupportedBy> createSupportedBy(SupportedBy value) {
        return new JAXBElement<SupportedBy>(_SupportedBy_QNAME, SupportedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinksTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "LinksTo")
    public JAXBElement<LinksTo> createLinksTo(LinksTo value) {
        return new JAXBElement<LinksTo>(_LinksTo_QNAME, LinksTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildProduct")
    public JAXBElement<BuildProduct> createBuildProduct(BuildProduct value) {
        return new JAXBElement<BuildProduct>(_BuildProduct_QNAME, BuildProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildModel")
    public JAXBElement<BuildModel> createBuildModel(BuildModel value) {
        return new JAXBElement<BuildModel>(_BuildModel_QNAME, BuildModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuppliedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "SuppliedBy")
    public JAXBElement<SuppliedBy> createSuppliedBy(SuppliedBy value) {
        return new JAXBElement<SuppliedBy>(_SuppliedBy_QNAME, SuppliedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildElement")
    public JAXBElement<BuildElement> createBuildElement(BuildElement value) {
        return new JAXBElement<BuildElement>(_BuildElement_QNAME, BuildElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolicLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "SymbolicLink")
    public JAXBElement<SymbolicLink> createSymbolicLink(SymbolicLink value) {
        return new JAXBElement<SymbolicLink>(_SymbolicLink_QNAME, SymbolicLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "BuildDescription")
    public JAXBElement<BuildDescription> createBuildDescription(BuildDescription value) {
        return new JAXBElement<BuildDescription>(_BuildDescription_QNAME, BuildDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractBuildRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "AbstractBuildRelationship")
    public JAXBElement<AbstractBuildRelationship> createAbstractBuildRelationship(AbstractBuildRelationship value) {
        return new JAXBElement<AbstractBuildRelationship>(_AbstractBuildRelationship_QNAME, AbstractBuildRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractBuildElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "AbstractBuildElement")
    public JAXBElement<AbstractBuildElement> createAbstractBuildElement(AbstractBuildElement value) {
        return new JAXBElement<AbstractBuildElement>(_AbstractBuildElement_QNAME, AbstractBuildElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Library }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/build", name = "Library")
    public JAXBElement<Library> createLibrary(Library value) {
        return new JAXBElement<Library>(_Library_QNAME, Library.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractBuildElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "groupedBuild", scope = BuildResource.class)
    public JAXBElement<AbstractBuildElement> createBuildResourceGroupedBuild(AbstractBuildElement value) {
        return new JAXBElement<AbstractBuildElement>(_BuildResourceGroupedBuild_QNAME, AbstractBuildElement.class, BuildResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractBuildElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "buildElement", scope = BuildResource.class)
    public JAXBElement<AbstractBuildElement> createBuildResourceBuildElement(AbstractBuildElement value) {
        return new JAXBElement<AbstractBuildElement>(_BuildResourceBuildElement_QNAME, AbstractBuildElement.class, BuildResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KDMEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "implementation", scope = BuildResource.class)
    public JAXBElement<KDMEntity> createBuildResourceImplementation(KDMEntity value) {
        return new JAXBElement<KDMEntity>(_BuildResourceImplementation_QNAME, KDMEntity.class, BuildResource.class, value);
    }

}
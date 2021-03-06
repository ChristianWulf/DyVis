//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.10.28 at 06:26:00 PM MEZ 
//


package org.omg.schema.spec.kdm._1_1.source;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.schema.spec.kdm._1_1.source package. 
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

    private final static QName _AbstractInventoryRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "AbstractInventoryRelationship");
    private final static QName _InventoryModel_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "InventoryModel");
    private final static QName _SourceFile_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "SourceFile");
    private final static QName _ExecutableFile_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "ExecutableFile");
    private final static QName _AbstractInventoryElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "AbstractInventoryElement");
    private final static QName _InventoryRelationship_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "InventoryRelationship");
    private final static QName _InventoryElement_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "InventoryElement");
    private final static QName _InventoryItem_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "InventoryItem");
    private final static QName _SourceRef_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "SourceRef");
    private final static QName _Project_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "Project");
    private final static QName _BinaryFile_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "BinaryFile");
    private final static QName _Image_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "Image");
    private final static QName _InventoryContainer_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "InventoryContainer");
    private final static QName _SourceRegion_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "SourceRegion");
    private final static QName _DependsOn_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "DependsOn");
    private final static QName _ResourceDescription_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "ResourceDescription");
    private final static QName _Directory_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "Directory");
    private final static QName _Configuration_QNAME = new QName("http://schema.omg.org/spec/KDM/1.1/source", "Configuration");
    private final static QName _DependsOnTo_QNAME = new QName("", "to");
    private final static QName _DependsOnFrom_QNAME = new QName("", "from");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.schema.spec.kdm._1_1.source
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Directory }
     * 
     */
    public Directory createDirectory() {
        return new Directory();
    }

    /**
     * Create an instance of {@link InventoryRelationship }
     * 
     */
    public InventoryRelationship createInventoryRelationship() {
        return new InventoryRelationship();
    }

    /**
     * Create an instance of {@link SourceFile }
     * 
     */
    public SourceFile createSourceFile() {
        return new SourceFile();
    }

    /**
     * Create an instance of {@link InventoryElement }
     * 
     */
    public InventoryElement createInventoryElement() {
        return new InventoryElement();
    }

    /**
     * Create an instance of {@link ExecutableFile }
     * 
     */
    public ExecutableFile createExecutableFile() {
        return new ExecutableFile();
    }

    /**
     * Create an instance of {@link InventoryItem }
     * 
     */
    public InventoryItem createInventoryItem() {
        return new InventoryItem();
    }

    /**
     * Create an instance of {@link InventoryModel }
     * 
     */
    public InventoryModel createInventoryModel() {
        return new InventoryModel();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link SourceRegion }
     * 
     */
    public SourceRegion createSourceRegion() {
        return new SourceRegion();
    }

    /**
     * Create an instance of {@link BinaryFile }
     * 
     */
    public BinaryFile createBinaryFile() {
        return new BinaryFile();
    }

    /**
     * Create an instance of {@link SourceRef }
     * 
     */
    public SourceRef createSourceRef() {
        return new SourceRef();
    }

    /**
     * Create an instance of {@link InventoryContainer }
     * 
     */
    public InventoryContainer createInventoryContainer() {
        return new InventoryContainer();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link DependsOn }
     * 
     */
    public DependsOn createDependsOn() {
        return new DependsOn();
    }

    /**
     * Create an instance of {@link ResourceDescription }
     * 
     */
    public ResourceDescription createResourceDescription() {
        return new ResourceDescription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractInventoryRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "AbstractInventoryRelationship")
    public JAXBElement<AbstractInventoryRelationship> createAbstractInventoryRelationship(AbstractInventoryRelationship value) {
        return new JAXBElement<AbstractInventoryRelationship>(_AbstractInventoryRelationship_QNAME, AbstractInventoryRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "InventoryModel")
    public JAXBElement<InventoryModel> createInventoryModel(InventoryModel value) {
        return new JAXBElement<InventoryModel>(_InventoryModel_QNAME, InventoryModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "SourceFile")
    public JAXBElement<SourceFile> createSourceFile(SourceFile value) {
        return new JAXBElement<SourceFile>(_SourceFile_QNAME, SourceFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutableFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "ExecutableFile")
    public JAXBElement<ExecutableFile> createExecutableFile(ExecutableFile value) {
        return new JAXBElement<ExecutableFile>(_ExecutableFile_QNAME, ExecutableFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractInventoryElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "AbstractInventoryElement")
    public JAXBElement<AbstractInventoryElement> createAbstractInventoryElement(AbstractInventoryElement value) {
        return new JAXBElement<AbstractInventoryElement>(_AbstractInventoryElement_QNAME, AbstractInventoryElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "InventoryRelationship")
    public JAXBElement<InventoryRelationship> createInventoryRelationship(InventoryRelationship value) {
        return new JAXBElement<InventoryRelationship>(_InventoryRelationship_QNAME, InventoryRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "InventoryElement")
    public JAXBElement<InventoryElement> createInventoryElement(InventoryElement value) {
        return new JAXBElement<InventoryElement>(_InventoryElement_QNAME, InventoryElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "InventoryItem")
    public JAXBElement<InventoryItem> createInventoryItem(InventoryItem value) {
        return new JAXBElement<InventoryItem>(_InventoryItem_QNAME, InventoryItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "SourceRef")
    public JAXBElement<SourceRef> createSourceRef(SourceRef value) {
        return new JAXBElement<SourceRef>(_SourceRef_QNAME, SourceRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "Project")
    public JAXBElement<Project> createProject(Project value) {
        return new JAXBElement<Project>(_Project_QNAME, Project.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "BinaryFile")
    public JAXBElement<BinaryFile> createBinaryFile(BinaryFile value) {
        return new JAXBElement<BinaryFile>(_BinaryFile_QNAME, BinaryFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "Image")
    public JAXBElement<Image> createImage(Image value) {
        return new JAXBElement<Image>(_Image_QNAME, Image.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "InventoryContainer")
    public JAXBElement<InventoryContainer> createInventoryContainer(InventoryContainer value) {
        return new JAXBElement<InventoryContainer>(_InventoryContainer_QNAME, InventoryContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "SourceRegion")
    public JAXBElement<SourceRegion> createSourceRegion(SourceRegion value) {
        return new JAXBElement<SourceRegion>(_SourceRegion_QNAME, SourceRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DependsOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "DependsOn")
    public JAXBElement<DependsOn> createDependsOn(DependsOn value) {
        return new JAXBElement<DependsOn>(_DependsOn_QNAME, DependsOn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "ResourceDescription")
    public JAXBElement<ResourceDescription> createResourceDescription(ResourceDescription value) {
        return new JAXBElement<ResourceDescription>(_ResourceDescription_QNAME, ResourceDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Directory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "Directory")
    public JAXBElement<Directory> createDirectory(Directory value) {
        return new JAXBElement<Directory>(_Directory_QNAME, Directory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.omg.org/spec/KDM/1.1/source", name = "Configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractInventoryElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "to", scope = DependsOn.class)
    public JAXBElement<AbstractInventoryElement> createDependsOnTo(AbstractInventoryElement value) {
        return new JAXBElement<AbstractInventoryElement>(_DependsOnTo_QNAME, AbstractInventoryElement.class, DependsOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractInventoryElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "from", scope = DependsOn.class)
    public JAXBElement<AbstractInventoryElement> createDependsOnFrom(AbstractInventoryElement value) {
        return new JAXBElement<AbstractInventoryElement>(_DependsOnFrom_QNAME, AbstractInventoryElement.class, DependsOn.class, value);
    }

}

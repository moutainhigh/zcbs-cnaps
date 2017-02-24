//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:54:49 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.batchcollectioncharges;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zcbspay.platform.channel.beps.bean.batchcollectioncharges package. 
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

    private final static QName _Document_QNAME = new QName("urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zcbspay.platform.channel.beps.bean.batchcollectioncharges
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link DbtrAgt1 }
     * 
     */
    public DbtrAgt1 createDbtrAgt1() {
        return new DbtrAgt1();
    }

    /**
     * Create an instance of {@link GroupHeader1 }
     * 
     */
    public GroupHeader1 createGroupHeader1() {
        return new GroupHeader1();
    }

    /**
     * Create an instance of {@link Othr1 }
     * 
     */
    public Othr1 createOthr1() {
        return new Othr1();
    }

    /**
     * Create an instance of {@link DbtrDtls1 }
     * 
     */
    public DbtrDtls1 createDbtrDtls1() {
        return new DbtrDtls1();
    }

    /**
     * Create an instance of {@link DbtrCdtr1 }
     * 
     */
    public DbtrCdtr1 createDbtrCdtr1() {
        return new DbtrCdtr1();
    }

    /**
     * Create an instance of {@link PmtTpInf1 }
     * 
     */
    public PmtTpInf1 createPmtTpInf1() {
        return new PmtTpInf1();
    }

    /**
     * Create an instance of {@link ActiveCurrencyAndAmount }
     * 
     */
    public ActiveCurrencyAndAmount createActiveCurrencyAndAmount() {
        return new ActiveCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link FIId1 }
     * 
     */
    public FIId1 createFIId1() {
        return new FIId1();
    }

    /**
     * Create an instance of {@link Purp1 }
     * 
     */
    public Purp1 createPurp1() {
        return new Purp1();
    }

    /**
     * Create an instance of {@link Id1 }
     * 
     */
    public Id1 createId1() {
        return new Id1();
    }

    /**
     * Create an instance of {@link BrnchId1 }
     * 
     */
    public BrnchId1 createBrnchId1() {
        return new BrnchId1();
    }

    /**
     * Create an instance of {@link InstgPty1 }
     * 
     */
    public InstgPty1 createInstgPty1() {
        return new InstgPty1();
    }

    /**
     * Create an instance of {@link ClrSysMmbId1 }
     * 
     */
    public ClrSysMmbId1 createClrSysMmbId1() {
        return new ClrSysMmbId1();
    }

    /**
     * Create an instance of {@link CtgyPurp1 }
     * 
     */
    public CtgyPurp1 createCtgyPurp1() {
        return new CtgyPurp1();
    }

    /**
     * Create an instance of {@link BtchColltnChrgsV01 }
     * 
     */
    public BtchColltnChrgsV01 createBtchColltnChrgsV01() {
        return new BtchColltnChrgsV01();
    }

    /**
     * Create an instance of {@link InstdPty1 }
     * 
     */
    public InstdPty1 createInstdPty1() {
        return new InstdPty1();
    }

    /**
     * Create an instance of {@link DbtrCdtrAcct1 }
     * 
     */
    public DbtrCdtrAcct1 createDbtrCdtrAcct1() {
        return new DbtrCdtrAcct1();
    }

    /**
     * Create an instance of {@link CdtrAgt1 }
     * 
     */
    public CdtrAgt1 createCdtrAgt1() {
        return new CdtrAgt1();
    }

    /**
     * Create an instance of {@link BtchColltnChrgsInf1 }
     * 
     */
    public BtchColltnChrgsInf1 createBtchColltnChrgsInf1() {
        return new BtchColltnChrgsInf1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
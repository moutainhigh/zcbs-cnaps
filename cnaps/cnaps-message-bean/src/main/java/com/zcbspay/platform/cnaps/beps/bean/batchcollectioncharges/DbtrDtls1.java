//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:54:49 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.batchcollectioncharges;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DbtrDtls1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DbtrDtls1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}Purp1"/>
 *         &lt;element name="TxId" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}Max16NumericText"/>
 *         &lt;element name="Dbtr" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}DbtrCdtr1"/>
 *         &lt;element name="DbtrAcct" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}DbtrCdtrAcct1"/>
 *         &lt;element name="BrnchId" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}Max14Text"/>
 *         &lt;element name="Amt" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}ActiveCurrencyAndAmount"/>
 *         &lt;element name="EndToEndId" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="ChckFlg" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}ChckFlgCode1"/>
 *         &lt;element name="AddtlInf" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.380.001.01}Max256Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DbtrDtls1", propOrder = {
    "purp",
    "txId",
    "dbtr",
    "dbtrAcct",
    "brnchId",
    "amt",
    "endToEndId",
    "chckFlg",
    "addtlInf"
})
public class DbtrDtls1 {

    @XmlElement(name = "Purp", required = true)
    protected Purp1 purp;
    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Dbtr", required = true)
    protected DbtrCdtr1 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected DbtrCdtrAcct1 dbtrAcct;
    @XmlElement(name = "BrnchId", required = true)
    protected String brnchId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "ChckFlg", required = true)
    protected ChckFlgCode1 chckFlg;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purp1 }
     *     
     */
    public Purp1 getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purp1 }
     *     
     */
    public void setPurp(Purp1 value) {
        this.purp = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link DbtrCdtr1 }
     *     
     */
    public DbtrCdtr1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbtrCdtr1 }
     *     
     */
    public void setDbtr(DbtrCdtr1 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DbtrCdtrAcct1 }
     *     
     */
    public DbtrCdtrAcct1 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbtrCdtrAcct1 }
     *     
     */
    public void setDbtrAcct(DbtrCdtrAcct1 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnchId(String value) {
        this.brnchId = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    /**
     * Gets the value of the chckFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ChckFlgCode1 }
     *     
     */
    public ChckFlgCode1 getChckFlg() {
        return chckFlg;
    }

    /**
     * Sets the value of the chckFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChckFlgCode1 }
     *     
     */
    public void setChckFlg(ChckFlgCode1 value) {
        this.chckFlg = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}

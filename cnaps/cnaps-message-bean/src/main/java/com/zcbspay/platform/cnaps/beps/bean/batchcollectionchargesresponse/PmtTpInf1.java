//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 04:55:00 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.batchcollectionchargesresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtTpInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtTpInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CtgyPurp" type="{urn:cnaps:std:beps:2010:tech:xsd:beps.381.001.01}CtgyPurp1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtTpInf1", propOrder = {
    "ctgyPurp"
})
public class PmtTpInf1 {

    @XmlElement(name = "CtgyPurp", required = true)
    protected CtgyPurp1 ctgyPurp;

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CtgyPurp1 }
     *     
     */
    public CtgyPurp1 getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtgyPurp1 }
     *     
     */
    public void setCtgyPurp(CtgyPurp1 value) {
        this.ctgyPurp = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.21 at 05:06:38 PM CST 
//


package com.zcbspay.platform.cnaps.beps.bean.CustomerPaymentCancellationResponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementMethod1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDA"/>
 *     &lt;enumeration value="INGA"/>
 *     &lt;enumeration value="COVE"/>
 *     &lt;enumeration value="CLRG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlementMethod1Code")
@XmlEnum
public enum SettlementMethod1Code {

    INDA,
    INGA,
    COVE,
    CLRG;

    public String value() {
        return name();
    }

    public static SettlementMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}

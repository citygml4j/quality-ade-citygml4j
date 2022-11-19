//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GE_R_TOO_FEW_POINTSPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_R_TOO_FEW_POINTSPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_R_TOO_FEW_POINTS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_R_TOO_FEW_POINTSPropertyType", propOrder = {
    "ge_R_TOO_FEW_POINTS"
})
public class RingTooFewPointsPropertyType {

    @XmlElement(name = "GE_R_TOO_FEW_POINTS", required = true)
    protected RingTooFewPointsType ge_R_TOO_FEW_POINTS;

    /**
     * Ruft den Wert der ge_R_TOO_FEW_POINTS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RingTooFewPointsType }
     *     
     */
    public RingTooFewPointsType getGE_R_TOO_FEW_POINTS() {
        return ge_R_TOO_FEW_POINTS;
    }

    /**
     * Legt den Wert der ge_R_TOO_FEW_POINTS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RingTooFewPointsType }
     *     
     */
    public void setGE_R_TOO_FEW_POINTS(RingTooFewPointsType value) {
        this.ge_R_TOO_FEW_POINTS = value;
    }

    public boolean isSetGE_R_TOO_FEW_POINTS() {
        return (this.ge_R_TOO_FEW_POINTS!= null);
    }

}

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
 * <p>Java-Klasse für GE_R_SELF_INTERSECTIONPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_R_SELF_INTERSECTIONPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_R_SELF_INTERSECTION"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_R_SELF_INTERSECTIONPropertyType", propOrder = {
    "ge_R_SELF_INTERSECTION"
})
public class RingSelfIntersectionPropertyType {

    @XmlElement(name = "GE_R_SELF_INTERSECTION", required = true)
    protected RingSelfIntersectionType ge_R_SELF_INTERSECTION;

    /**
     * Ruft den Wert der ge_R_SELF_INTERSECTION-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RingSelfIntersectionType }
     *     
     */
    public RingSelfIntersectionType getGE_R_SELF_INTERSECTION() {
        return ge_R_SELF_INTERSECTION;
    }

    /**
     * Legt den Wert der ge_R_SELF_INTERSECTION-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RingSelfIntersectionType }
     *     
     */
    public void setGE_R_SELF_INTERSECTION(RingSelfIntersectionType value) {
        this.ge_R_SELF_INTERSECTION = value;
    }

    public boolean isSetGE_R_SELF_INTERSECTION() {
        return (this.ge_R_SELF_INTERSECTION!= null);
    }

}

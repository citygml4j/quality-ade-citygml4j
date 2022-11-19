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
 * <p>Java-Klasse für GE_P_INNER_RINGS_NESTEDPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_P_INNER_RINGS_NESTEDPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_P_INNER_RINGS_NESTED"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_P_INNER_RINGS_NESTEDPropertyType", propOrder = {
    "ge_P_INNER_RINGS_NESTED"
})
public class PolygonInnerRingsNestedPropertyType {

    @XmlElement(name = "GE_P_INNER_RINGS_NESTED", required = true)
    protected PolygonInnerRingsNestedType ge_P_INNER_RINGS_NESTED;

    /**
     * Ruft den Wert der ge_P_INNER_RINGS_NESTED-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolygonInnerRingsNestedType }
     *     
     */
    public PolygonInnerRingsNestedType getGE_P_INNER_RINGS_NESTED() {
        return ge_P_INNER_RINGS_NESTED;
    }

    /**
     * Legt den Wert der ge_P_INNER_RINGS_NESTED-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonInnerRingsNestedType }
     *     
     */
    public void setGE_P_INNER_RINGS_NESTED(PolygonInnerRingsNestedType value) {
        this.ge_P_INNER_RINGS_NESTED = value;
    }

    public boolean isSetGE_P_INNER_RINGS_NESTED() {
        return (this.ge_P_INNER_RINGS_NESTED!= null);
    }

}

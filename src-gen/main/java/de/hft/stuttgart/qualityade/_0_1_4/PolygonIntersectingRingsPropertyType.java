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
 * <p>Java-Klasse für GE_P_INTERSECTING_RINGSPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_P_INTERSECTING_RINGSPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_P_INTERSECTING_RINGS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_P_INTERSECTING_RINGSPropertyType", propOrder = {
    "ge_P_INTERSECTING_RINGS"
})
public class PolygonIntersectingRingsPropertyType {

    @XmlElement(name = "GE_P_INTERSECTING_RINGS", required = true)
    protected PolygonIntersectingRingsType ge_P_INTERSECTING_RINGS;

    /**
     * Ruft den Wert der ge_P_INTERSECTING_RINGS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolygonIntersectingRingsType }
     *     
     */
    public PolygonIntersectingRingsType getGE_P_INTERSECTING_RINGS() {
        return ge_P_INTERSECTING_RINGS;
    }

    /**
     * Legt den Wert der ge_P_INTERSECTING_RINGS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonIntersectingRingsType }
     *     
     */
    public void setGE_P_INTERSECTING_RINGS(PolygonIntersectingRingsType value) {
        this.ge_P_INTERSECTING_RINGS = value;
    }

    public boolean isSetGE_P_INTERSECTING_RINGS() {
        return (this.ge_P_INTERSECTING_RINGS!= null);
    }

}

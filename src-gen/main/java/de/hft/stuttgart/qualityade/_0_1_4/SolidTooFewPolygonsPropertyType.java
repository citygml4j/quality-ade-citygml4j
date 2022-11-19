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
 * <p>Java-Klasse für GE_S_TOO_FEW_POLYGONSPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_S_TOO_FEW_POLYGONSPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_S_TOO_FEW_POLYGONS"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_S_TOO_FEW_POLYGONSPropertyType", propOrder = {
    "ge_S_TOO_FEW_POLYGONS"
})
public class SolidTooFewPolygonsPropertyType {

    @XmlElement(name = "GE_S_TOO_FEW_POLYGONS", required = true)
    protected SolidTooFewPolygonsType ge_S_TOO_FEW_POLYGONS;

    /**
     * Ruft den Wert der ge_S_TOO_FEW_POLYGONS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SolidTooFewPolygonsType }
     *     
     */
    public SolidTooFewPolygonsType getGE_S_TOO_FEW_POLYGONS() {
        return ge_S_TOO_FEW_POLYGONS;
    }

    /**
     * Legt den Wert der ge_S_TOO_FEW_POLYGONS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidTooFewPolygonsType }
     *     
     */
    public void setGE_S_TOO_FEW_POLYGONS(SolidTooFewPolygonsType value) {
        this.ge_S_TOO_FEW_POLYGONS = value;
    }

    public boolean isSetGE_S_TOO_FEW_POLYGONS() {
        return (this.ge_S_TOO_FEW_POLYGONS!= null);
    }

}

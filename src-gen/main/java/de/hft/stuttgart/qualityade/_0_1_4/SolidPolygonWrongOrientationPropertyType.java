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
 * <p>Java-Klasse für GE_S_POLYGON_WRONG_ORIENTATIONPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_S_POLYGON_WRONG_ORIENTATIONPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_S_POLYGON_WRONG_ORIENTATION"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_S_POLYGON_WRONG_ORIENTATIONPropertyType", propOrder = {
    "ge_S_POLYGON_WRONG_ORIENTATION"
})
public class SolidPolygonWrongOrientationPropertyType {

    @XmlElement(name = "GE_S_POLYGON_WRONG_ORIENTATION", required = true)
    protected SolidPolygonWrongOrientationType ge_S_POLYGON_WRONG_ORIENTATION;

    /**
     * Ruft den Wert der ge_S_POLYGON_WRONG_ORIENTATION-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SolidPolygonWrongOrientationType }
     *     
     */
    public SolidPolygonWrongOrientationType getGE_S_POLYGON_WRONG_ORIENTATION() {
        return ge_S_POLYGON_WRONG_ORIENTATION;
    }

    /**
     * Legt den Wert der ge_S_POLYGON_WRONG_ORIENTATION-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPolygonWrongOrientationType }
     *     
     */
    public void setGE_S_POLYGON_WRONG_ORIENTATION(SolidPolygonWrongOrientationType value) {
        this.ge_S_POLYGON_WRONG_ORIENTATION = value;
    }

    public boolean isSetGE_S_POLYGON_WRONG_ORIENTATION() {
        return (this.ge_S_POLYGON_WRONG_ORIENTATION!= null);
    }

}

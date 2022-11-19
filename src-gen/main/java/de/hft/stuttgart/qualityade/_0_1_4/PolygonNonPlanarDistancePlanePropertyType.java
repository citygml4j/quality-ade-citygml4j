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
 * <p>Java-Klasse für GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANEPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANEPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANEPropertyType", propOrder = {
    "ge_P_NON_PLANAR_POLYGON_DISTANCE_PLANE"
})
public class PolygonNonPlanarDistancePlanePropertyType {

    @XmlElement(name = "GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE", required = true)
    protected PolygonNonPlanarDistancePlaneType ge_P_NON_PLANAR_POLYGON_DISTANCE_PLANE;

    /**
     * Ruft den Wert der ge_P_NON_PLANAR_POLYGON_DISTANCE_PLANE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolygonNonPlanarDistancePlaneType }
     *     
     */
    public PolygonNonPlanarDistancePlaneType getGE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE() {
        return ge_P_NON_PLANAR_POLYGON_DISTANCE_PLANE;
    }

    /**
     * Legt den Wert der ge_P_NON_PLANAR_POLYGON_DISTANCE_PLANE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonNonPlanarDistancePlaneType }
     *     
     */
    public void setGE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE(PolygonNonPlanarDistancePlaneType value) {
        this.ge_P_NON_PLANAR_POLYGON_DISTANCE_PLANE = value;
    }

    public boolean isSetGE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE() {
        return (this.ge_P_NON_PLANAR_POLYGON_DISTANCE_PLANE!= null);
    }

}

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractPolygonErrorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractPolygonErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractGeometryErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="polygonId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPolygonErrorType", propOrder = {
    "polygonId"
})
@XmlSeeAlso({
    PolygonHoleOutsideType.class,
    PolygonInnerRingsNestedType.class,
    PolygonInteriorDisconnectedType.class,
    PolygonIntersectingRingsType.class,
    PolygonNonPlanarDistancePlaneType.class,
    PolygonNonPlanarNormalsDeviationType.class,
    PolygonOrientationRingsSameType.class
})
public abstract class AbstractPolygonErrorType
    extends AbstractGeometryErrorType
{

    @XmlElement(required = true)
    protected String polygonId;

    /**
     * Ruft den Wert der polygonId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolygonId() {
        return polygonId;
    }

    /**
     * Legt den Wert der polygonId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolygonId(String value) {
        this.polygonId = value;
    }

    public boolean isSetPolygonId() {
        return (this.polygonId!= null);
    }

}

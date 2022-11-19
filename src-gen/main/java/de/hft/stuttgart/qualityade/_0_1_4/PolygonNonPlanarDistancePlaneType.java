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
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.LengthType;


/**
 * <p>Java-Klasse für GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANEType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractPolygonErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distance" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="vertex" type="{http://www.opengis.net/gml}DirectPositionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANEType", propOrder = {
    "distance",
    "vertex"
})
public class PolygonNonPlanarDistancePlaneType
    extends AbstractPolygonErrorType
{

    @XmlElement(required = true)
    protected LengthType distance;
    @XmlElement(required = true)
    protected DirectPositionType vertex;

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setDistance(LengthType value) {
        this.distance = value;
    }

    public boolean isSetDistance() {
        return (this.distance!= null);
    }

    /**
     * Ruft den Wert der vertex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getVertex() {
        return vertex;
    }

    /**
     * Legt den Wert der vertex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setVertex(DirectPositionType value) {
        this.vertex = value;
    }

    public boolean isSetVertex() {
        return (this.vertex!= null);
    }

}

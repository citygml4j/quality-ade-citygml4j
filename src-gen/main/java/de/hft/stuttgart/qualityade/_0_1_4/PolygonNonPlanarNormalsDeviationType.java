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
import net.opengis.gml.AngleType;


/**
 * <p>Java-Klasse für GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATIONType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractPolygonErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviation" type="{http://www.opengis.net/gml}AngleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATIONType", propOrder = {
    "deviation"
})
public class PolygonNonPlanarNormalsDeviationType
    extends AbstractPolygonErrorType
{

    @XmlElement(required = true)
    protected AngleType deviation;

    /**
     * Ruft den Wert der deviation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDeviation() {
        return deviation;
    }

    /**
     * Legt den Wert der deviation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDeviation(AngleType value) {
        this.deviation = value;
    }

    public boolean isSetDeviation() {
        return (this.deviation!= null);
    }

}

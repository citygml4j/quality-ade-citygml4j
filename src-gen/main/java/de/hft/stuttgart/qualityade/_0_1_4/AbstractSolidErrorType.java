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
 * <p>Java-Klasse für AbstractSolidErrorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractSolidErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractGeometryErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSolidErrorType", propOrder = {
    "geometryId"
})
@XmlSeeAlso({
    SolidAllPolygonsWrongOrientationType.class,
    SolidMultipleConnectedComponentsType.class,
    SolidNonManifoldEdgeType.class,
    SolidNonManifoldVertexType.class,
    SolidNotClosedType.class,
    SolidPolygonWrongOrientationType.class,
    SolidSelfIntersectionType.class,
    SolidTooFewPolygonsType.class
})
public abstract class AbstractSolidErrorType
    extends AbstractGeometryErrorType
{

    @XmlElement(required = true)
    protected String geometryId;

    /**
     * Ruft den Wert der geometryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryId() {
        return geometryId;
    }

    /**
     * Legt den Wert der geometryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryId(String value) {
        this.geometryId = value;
    }

    public boolean isSetGeometryId() {
        return (this.geometryId!= null);
    }

}

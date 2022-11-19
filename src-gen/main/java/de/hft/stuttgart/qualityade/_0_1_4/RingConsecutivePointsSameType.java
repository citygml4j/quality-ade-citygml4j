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


/**
 * <p>Java-Klasse für GE_R_CONSECUTIVE_POINTS_SAMEType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_R_CONSECUTIVE_POINTS_SAMEType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractRingErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vertex1" type="{http://www.opengis.net/gml}DirectPositionType"/&gt;
 *         &lt;element name="vertex2" type="{http://www.opengis.net/gml}DirectPositionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_R_CONSECUTIVE_POINTS_SAMEType", propOrder = {
    "vertex1",
    "vertex2"
})
public class RingConsecutivePointsSameType
    extends AbstractRingErrorType
{

    @XmlElement(required = true)
    protected DirectPositionType vertex1;
    @XmlElement(required = true)
    protected DirectPositionType vertex2;

    /**
     * Ruft den Wert der vertex1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getVertex1() {
        return vertex1;
    }

    /**
     * Legt den Wert der vertex1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setVertex1(DirectPositionType value) {
        this.vertex1 = value;
    }

    public boolean isSetVertex1() {
        return (this.vertex1 != null);
    }

    /**
     * Ruft den Wert der vertex2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getVertex2() {
        return vertex2;
    }

    /**
     * Legt den Wert der vertex2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setVertex2(DirectPositionType value) {
        this.vertex2 = value;
    }

    public boolean isSetVertex2() {
        return (this.vertex2 != null);
    }

}

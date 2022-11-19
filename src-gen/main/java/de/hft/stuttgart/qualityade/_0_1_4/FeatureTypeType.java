//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FeatureTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUILDING"/&gt;
 *     &lt;enumeration value="TRANSPORTATION"/&gt;
 *     &lt;enumeration value="VEGETATION"/&gt;
 *     &lt;enumeration value="BRIDGE"/&gt;
 *     &lt;enumeration value="WATER"/&gt;
 *     &lt;enumeration value="LAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FeatureTypeType")
@XmlEnum
public enum FeatureTypeType {

    BUILDING,
    TRANSPORTATION,
    VEGETATION,
    BRIDGE,
    WATER,
    LAND;

    public String value() {
        return name();
    }

    public static FeatureTypeType fromValue(String v) {
        return valueOf(v);
    }

}

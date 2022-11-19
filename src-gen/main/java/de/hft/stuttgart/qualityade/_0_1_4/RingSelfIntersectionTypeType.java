//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RingSelfIntersectionTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RingSelfIntersectionTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EDGE_INTERSECTION"/&gt;
 *     &lt;enumeration value="VERTEX_TOUCHES_EDGE"/&gt;
 *     &lt;enumeration value="DUPLICATE_POINT"/&gt;
 *     &lt;enumeration value="DEGENERATED_RING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RingSelfIntersectionTypeType")
@XmlEnum
public enum RingSelfIntersectionTypeType {

    @XmlEnumValue("EDGE_INTERSECTION")
    EDGE___INTERSECTION("EDGE_INTERSECTION"),
    @XmlEnumValue("VERTEX_TOUCHES_EDGE")
    VERTEX___TOUCHES___EDGE("VERTEX_TOUCHES_EDGE"),
    @XmlEnumValue("DUPLICATE_POINT")
    DUPLICATE___POINT("DUPLICATE_POINT"),
    @XmlEnumValue("DEGENERATED_RING")
    DEGENERATED___RING("DEGENERATED_RING");
    private final String value;

    RingSelfIntersectionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RingSelfIntersectionTypeType fromValue(String v) {
        for (RingSelfIntersectionTypeType c: RingSelfIntersectionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java-Klasse für ErrorTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GE_R_TOO_FEW_POINTS"/&gt;
 *     &lt;enumeration value="GE_R_NOT_CLOSED"/&gt;
 *     &lt;enumeration value="GE_R_CONSECUTIVE_POINTS_SAME"/&gt;
 *     &lt;enumeration value="GE_R_SELF_INTERSECTION"/&gt;
 *     &lt;enumeration value="GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE"/&gt;
 *     &lt;enumeration value="GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATION"/&gt;
 *     &lt;enumeration value="GE_P_INTERIOR_DISCONNECTED"/&gt;
 *     &lt;enumeration value="GE_P_INTERSECTING_RINGS"/&gt;
 *     &lt;enumeration value="GE_P_HOLE_OUTSIDE"/&gt;
 *     &lt;enumeration value="GE_P_ORIENTATION_RINGS_SAME"/&gt;
 *     &lt;enumeration value="GE_P_INNER_RINGS_NESTED"/&gt;
 *     &lt;enumeration value="GE_S_TOO_FEW_POLYGONS"/&gt;
 *     &lt;enumeration value="GE_S_NOT_CLOSED"/&gt;
 *     &lt;enumeration value="GE_S_NON_MANIFOLD_EDGE"/&gt;
 *     &lt;enumeration value="GE_S_POLYGON_WRONG_ORIENTATION"/&gt;
 *     &lt;enumeration value="GE_S_ALL_POLYGONS_WRONG_ORIENTATION"/&gt;
 *     &lt;enumeration value="GE_S_NON_MANIFOLD_VERTEX"/&gt;
 *     &lt;enumeration value="GE_S_SELF_INTERSECTION"/&gt;
 *     &lt;enumeration value="GE_S_MULTIPLE_CONNECTED_COMPONENTS"/&gt;
 *     &lt;enumeration value="SE_ATTRIBUTE_WRONG_VALUE"/&gt;
 *     &lt;enumeration value="SE_ATTRIBUTE_MISSING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorTypeType")
@XmlEnum
public enum ErrorTypeType {

    @XmlEnumValue("GE_R_TOO_FEW_POINTS")
    GE___R___TOO___FEW___POINTS("GE_R_TOO_FEW_POINTS"),
    @XmlEnumValue("GE_R_NOT_CLOSED")
    GE___R___NOT___CLOSED("GE_R_NOT_CLOSED"),
    @XmlEnumValue("GE_R_CONSECUTIVE_POINTS_SAME")
    GE___R___CONSECUTIVE___POINTS___SAME("GE_R_CONSECUTIVE_POINTS_SAME"),
    @XmlEnumValue("GE_R_SELF_INTERSECTION")
    GE___R___SELF___INTERSECTION("GE_R_SELF_INTERSECTION"),
    @XmlEnumValue("GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE")
    GE___P___NON___PLANAR___POLYGON___DISTANCE___PLANE("GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE"),
    @XmlEnumValue("GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATION")
    GE___P___NON___PLANAR___POLYGON___NORMALS___DEVIATION("GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATION"),
    @XmlEnumValue("GE_P_INTERIOR_DISCONNECTED")
    GE___P___INTERIOR___DISCONNECTED("GE_P_INTERIOR_DISCONNECTED"),
    @XmlEnumValue("GE_P_INTERSECTING_RINGS")
    GE___P___INTERSECTING___RINGS("GE_P_INTERSECTING_RINGS"),
    @XmlEnumValue("GE_P_HOLE_OUTSIDE")
    GE___P___HOLE___OUTSIDE("GE_P_HOLE_OUTSIDE"),
    @XmlEnumValue("GE_P_ORIENTATION_RINGS_SAME")
    GE___P___ORIENTATION___RINGS___SAME("GE_P_ORIENTATION_RINGS_SAME"),
    @XmlEnumValue("GE_P_INNER_RINGS_NESTED")
    GE___P___INNER___RINGS___NESTED("GE_P_INNER_RINGS_NESTED"),
    @XmlEnumValue("GE_S_TOO_FEW_POLYGONS")
    GE___S___TOO___FEW___POLYGONS("GE_S_TOO_FEW_POLYGONS"),
    @XmlEnumValue("GE_S_NOT_CLOSED")
    GE___S___NOT___CLOSED("GE_S_NOT_CLOSED"),
    @XmlEnumValue("GE_S_NON_MANIFOLD_EDGE")
    GE___S___NON___MANIFOLD___EDGE("GE_S_NON_MANIFOLD_EDGE"),
    @XmlEnumValue("GE_S_POLYGON_WRONG_ORIENTATION")
    GE___S___POLYGON___WRONG___ORIENTATION("GE_S_POLYGON_WRONG_ORIENTATION"),
    @XmlEnumValue("GE_S_ALL_POLYGONS_WRONG_ORIENTATION")
    GE___S___ALL___POLYGONS___WRONG___ORIENTATION("GE_S_ALL_POLYGONS_WRONG_ORIENTATION"),
    @XmlEnumValue("GE_S_NON_MANIFOLD_VERTEX")
    GE___S___NON___MANIFOLD___VERTEX("GE_S_NON_MANIFOLD_VERTEX"),
    @XmlEnumValue("GE_S_SELF_INTERSECTION")
    GE___S___SELF___INTERSECTION("GE_S_SELF_INTERSECTION"),
    @XmlEnumValue("GE_S_MULTIPLE_CONNECTED_COMPONENTS")
    GE___S___MULTIPLE___CONNECTED___COMPONENTS("GE_S_MULTIPLE_CONNECTED_COMPONENTS"),
    @XmlEnumValue("SE_ATTRIBUTE_WRONG_VALUE")
    SE___ATTRIBUTE___WRONG___VALUE("SE_ATTRIBUTE_WRONG_VALUE"),
    @XmlEnumValue("SE_ATTRIBUTE_MISSING")
    SE___ATTRIBUTE___MISSING("SE_ATTRIBUTE_MISSING");
    private final String value;

    ErrorTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorTypeType fromValue(String v) {
        for (ErrorTypeType c: ErrorTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

/*
 * Copyright 2021 Hochschule für Technik Stuttgart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml4j.ade.quality.model;

import java.util.Locale;

public enum ErrorType {
    GE_R_TOO_FEW_POINTS,
    GE_R_NOT_CLOSED,
    GE_R_CONSECUTIVE_POINTS_SAME,
    GE_R_SELF_INTERSECTION,
    GE_P_NON_PLANAR_POLYGON_DISTANCE_PLANE,
    GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATION,
    GE_P_INTERIOR_DISCONNECTED,
    GE_P_INTERSECTING_RINGS,
    GE_P_HOLE_OUTSIDE,
    GE_P_ORIENTATION_RINGS_SAME,
    GE_P_INNER_RINGS_NESTED,
    GE_S_TOO_FEW_POLYGONS,
    GE_S_NOT_CLOSED,
    GE_S_NON_MANIFOLD_EDGE,
    GE_S_POLYGON_WRONG_ORIENTATION,
    GE_S_ALL_POLYGONS_WRONG_ORIENTATION,
    GE_S_NON_MANIFOLD_VERTEX,
    GE_S_SELF_INTERSECTION,
    GE_S_MULTIPLE_CONNECTED_COMPONENTS,
    SE_ATTRIBUTE_WRONG_VALUE,
    SE_ATTRIBUTE_MISSING;

    public static ErrorType fromValue(String value) {
        if (value != null) {
            for (ErrorType constant : ErrorType.values()) {
                if (constant.name().toLowerCase(Locale.ROOT).equals(value.toLowerCase(Locale.ROOT))) {
                    return constant;
                }
            }
        }

        return null;
    }
}

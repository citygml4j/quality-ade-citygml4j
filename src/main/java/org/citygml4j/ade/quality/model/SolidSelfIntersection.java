/*
 * quality-ade-citygml4j - Quality ADE module for citygml4j
 * https://github.com/citygml4j/quality-ade-citygml4j
 *
 * quality-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class SolidSelfIntersection extends AbstractSolidError {
    private String polygonId1;
    private String polygonId2;

    public SolidSelfIntersection() {
    }

    public SolidSelfIntersection(String geometryId, String polygonId1, String polygonId2) {
        super(geometryId);
        setPolygonId1(polygonId1);
        setPolygonId2(polygonId2);
    }

    public String getPolygonId1() {
        return polygonId1;
    }

    public void setPolygonId1(String polygonId1) {
        this.polygonId1 = polygonId1;
    }

    public String getPolygonId2() {
        return polygonId2;
    }

    public void setPolygonId2(String polygonId2) {
        this.polygonId2 = polygonId2;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_S_SELF_INTERSECTION;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SolidSelfIntersection copy = target == null ?
                new SolidSelfIntersection() :
                (SolidSelfIntersection) target;

        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SolidSelfIntersection(), copyBuilder);
    }
}

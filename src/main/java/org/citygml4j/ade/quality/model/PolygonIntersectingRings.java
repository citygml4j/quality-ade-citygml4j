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

public class PolygonIntersectingRings extends AbstractPolygonError {
    private String linearRingId1;
    private String linearRingId2;

    public PolygonIntersectingRings() {
    }

    public PolygonIntersectingRings(String polygonId, String linearRingId1, String linearRingId2) {
        super(polygonId);
        setLinearRingId1(linearRingId1);
        setLinearRingId2(linearRingId2);
    }

    public String getLinearRingId1() {
        return linearRingId1;
    }

    public void setLinearRingId1(String linearRingId1) {
        this.linearRingId1 = linearRingId1;
    }

    public String getLinearRingId2() {
        return linearRingId2;
    }

    public void setLinearRingId2(String linearRingId2) {
        this.linearRingId2 = linearRingId2;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_P_INTERSECTING_RINGS;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PolygonIntersectingRings copy = target == null ?
                new PolygonIntersectingRings() :
                (PolygonIntersectingRings) target;

        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PolygonIntersectingRings(), copyBuilder);
    }
}

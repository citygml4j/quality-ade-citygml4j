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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class PolygonInnerRingsNested extends AbstractPolygonError {
    private String linearRingId1;
    private String linearRingId2;

    public PolygonInnerRingsNested() {
    }

    public PolygonInnerRingsNested(String polygonId, String linearRingId1, String linearRingId2) {
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
        return ErrorType.GE_P_INNER_RINGS_NESTED;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PolygonInnerRingsNested copy = target == null ?
                new PolygonInnerRingsNested() :
                (PolygonInnerRingsNested) target;

        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PolygonInnerRingsNested(), copyBuilder);
    }
}

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
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.geometry.primitives.DirectPosition;

public class RingConsecutivePointsSame extends AbstractRingError {
    private DirectPosition vertex1;
    private DirectPosition vertex2;

    public RingConsecutivePointsSame() {
    }

    public RingConsecutivePointsSame(String linearRingId, DirectPosition vertex1, DirectPosition vertex2) {
        super(linearRingId);
        setVertex1(vertex1);
        setVertex2(vertex2);
    }

    public DirectPosition getVertex1() {
        return vertex1;
    }

    public void setVertex1(DirectPosition vertex1) {
        this.vertex1 = ModelObjects.setParent(vertex1, this);
    }

    public DirectPosition getVertex2() {
        return vertex2;
    }

    public void setVertex2(DirectPosition vertex2) {
        this.vertex2 = ModelObjects.setParent(vertex2, this);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_R_CONSECUTIVE_POINTS_SAME;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RingConsecutivePointsSame copy = target == null ?
                new RingConsecutivePointsSame() :
                (RingConsecutivePointsSame) target;

        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RingConsecutivePointsSame(), copyBuilder);
    }
}

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

public class SemanticAttributeWrongValue extends AbstractSemanticError {
    private String attributeName;
    private String childId;
    private boolean generic;

    public SemanticAttributeWrongValue() {
    }

    public SemanticAttributeWrongValue(String attributeName, String childId) {
        setAttributeName(attributeName);
        setChildId(childId);
    }

    public SemanticAttributeWrongValue(String attributeName, String childId, boolean generic) {
        this(attributeName, childId);
        setGeneric(generic);
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public boolean isGeneric() {
        return generic;
    }

    public void setGeneric(boolean generic) {
        this.generic = generic;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.SE_ATTRIBUTE_WRONG_VALUE;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SemanticAttributeWrongValue copy = target == null ?
                new SemanticAttributeWrongValue() :
                (SemanticAttributeWrongValue) target;

        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SemanticAttributeWrongValue(), copyBuilder);
    }
}

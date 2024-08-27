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

package org.citygml4j.ade.quality.walker;

import org.citygml4j.ade.quality.model.Validation;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.gml.feature.AbstractFeature;

public class GMLWalker implements ADEWalker<org.citygml4j.util.walker.GMLWalker> {
    private org.citygml4j.util.walker.GMLWalker walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.GMLWalker walker) {
        this.walker = walker;
    }

    public void visit(Validation validation) {
        walker.visit((AbstractFeature) validation);
    }
}

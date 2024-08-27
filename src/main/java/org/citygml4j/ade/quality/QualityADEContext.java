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

package org.citygml4j.ade.quality;

import org.citygml4j.ade.quality.bind.QualityADEMarshaller;
import org.citygml4j.ade.quality.bind.QualityADEUnmarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEContext;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.util.walker.FeatureFunctionWalker;
import org.citygml4j.util.walker.FeatureWalker;
import org.citygml4j.util.walker.GMLFunctionWalker;
import org.citygml4j.util.walker.GMLWalker;

import java.util.Collections;
import java.util.List;

public class QualityADEContext implements ADEContext {

    @Override
    public List<ADEModule> getADEModules() {
        return Collections.singletonList(QualityADEModule.v0_1_4);
    }

    @Override
    public List<String> getModelPackageNames() {
        return Collections.singletonList("org.citygml4j.ade.quality.model");
    }

    @Override
    public ADEMarshaller createADEMarshaller() {
        return new QualityADEMarshaller();
    }

    @Override
    public ADEUnmarshaller createADEUnmarshaller() {
        return new QualityADEUnmarshaller();
    }

    @Override
    public ADEWalker<FeatureWalker> createDefaultFeatureWalker() {
        return new org.citygml4j.ade.quality.walker.FeatureWalker();
    }

    @Override
    public ADEWalker<GMLWalker> createDefaultGMLWalker() {
        return new org.citygml4j.ade.quality.walker.GMLWalker();
    }

    @Override
    public <T> ADEWalker<FeatureFunctionWalker<T>> createDefaultFeatureFunctionWalker() {
        return new org.citygml4j.ade.quality.walker.FeatureFunctionWalker<>();
    }

    @Override
    public <T> ADEWalker<GMLFunctionWalker<T>> createDefaultGMLFunctionWalker() {
        return new org.citygml4j.ade.quality.walker.GMLFunctionWalker<>();
    }
}

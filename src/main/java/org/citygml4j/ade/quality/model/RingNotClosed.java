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

public class RingNotClosed extends AbstractRingError {

    public RingNotClosed() {
    }

    public RingNotClosed(String linearRingId) {
        super(linearRingId);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_R_NOT_CLOSED;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RingNotClosed copy = target == null ? new RingNotClosed() : (RingNotClosed) target;
        return super.copyTo(copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RingNotClosed(), copyBuilder);
    }
}

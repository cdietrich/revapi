/*
 * Copyright 2014 Lukas Krejci
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
 * limitations under the License
 */

package org.revapi.java.checks.classes;

import java.util.EnumSet;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

import org.revapi.java.checks.common.ModifierChanged;
import org.revapi.java.spi.Code;

/**
 * @author Lukas Krejci
 * @since 0.1
 */
public final class NoLongerAbstract extends ModifierChanged {
    public NoLongerAbstract() {
        super(false, Code.CLASS_NO_LONGER_ABSTRACT, Modifier.ABSTRACT);
    }

    @Override
    public EnumSet<Type> getInterest() {
        return EnumSet.of(Type.CLASS);
    }

    @Override
    protected void doVisitClass(TypeElement oldType, TypeElement newType) {
        super.doVisit(oldType, newType);
    }
}

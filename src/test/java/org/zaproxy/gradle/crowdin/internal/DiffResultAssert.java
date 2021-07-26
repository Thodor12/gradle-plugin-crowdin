/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2021 The ZAP Development Team
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
package org.zaproxy.gradle.crowdin.internal;

import java.util.Objects;
import org.assertj.core.api.AbstractObjectAssert;

/** {@link DiffResult} specific assertions - Generated by CustomAssertionGenerator. */
public class DiffResultAssert<T1, T2>
        extends AbstractObjectAssert<DiffResultAssert<T1, T2>, DiffResult<T1, T2>> {

    /**
     * Creates a new <code>{@link DiffResultAssert}</code> to make assertions on actual DiffResult.
     *
     * @param actual the DiffResult we want to make assertions on.
     */
    public DiffResultAssert(DiffResult<T1, T2> actual) {
        super(actual, DiffResultAssert.class);
    }

    /**
     * An entry point for DiffResultAssert to follow AssertJ standard <code>assertThat()</code>
     * statements.<br>
     * With a static import, one can write directly: <code>assertThat(myDiffResult)</code> and get
     * specific assertion with code completion.
     *
     * @param actual the DiffResult we want to make assertions on.
     * @return a new <code>{@link DiffResultAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static <T1, T2> DiffResultAssert<T1, T2> assertThat(DiffResult<T1, T2> actual) {
        return new DiffResultAssert<>(actual);
    }

    public DiffResultAssert<T1, T2> hasRightData(T1 data) {
        isNotNull();
        VfsNodeAssert.assertThat(actual.getRight()).hasData(data);
        return this;
    }

    public DiffResultAssert<T1, T2> hasLeftData(T2 data) {
        isNotNull();
        VfsNodeAssert.assertThat(actual.getLeft()).hasData(data);
        return this;
    }

    /**
     * Verifies that the actual DiffResult's right is equal to the given one.
     *
     * @param right the given right to compare the actual DiffResult's right to.
     * @return this assertion object.
     * @throws AssertionError - if the actual DiffResult's right is not equal to the given one.
     */
    public DiffResultAssert<T1, T2> hasRight(VfsNode<T1> right) {
        // check that actual DiffResult we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage =
                "\nExpecting right of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        VfsNode<T1> actualRight = actual.getRight();
        if (!Objects.deepEquals(actualRight, right)) {
            failWithMessage(assertjErrorMessage, actual, right, actualRight);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual DiffResult's left is equal to the given one.
     *
     * @param left the given left to compare the actual DiffResult's left to.
     * @return this assertion object.
     * @throws AssertionError - if the actual DiffResult's left is not equal to the given one.
     */
    public DiffResultAssert<T1, T2> hasLeft(VfsNode<T2> left) {
        // check that actual DiffResult we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage =
                "\nExpecting left of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        VfsNode<T2> actualLeft = actual.getLeft();
        if (!Objects.deepEquals(actualLeft, left)) {
            failWithMessage(assertjErrorMessage, actual, left, actualLeft);
        }

        // return the current assertion for method chaining
        return this;
    }

    /**
     * Verifies that the actual DiffResult's state is equal to the given one.
     *
     * @param state the given state to compare the actual DiffResult's state to.
     * @return this assertion object.
     * @throws AssertionError - if the actual DiffResult's state is not equal to the given one.
     */
    public DiffResultAssert<T1, T2> hasState(DiffResult.State state) {
        // check that actual DiffResult we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage =
                "\nExpecting state of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        DiffResult.State actualState = actual.getState();
        if (!Objects.deepEquals(actualState, state)) {
            failWithMessage(assertjErrorMessage, actual, state, actualState);
        }

        // return the current assertion for method chaining
        return this;
    }
}
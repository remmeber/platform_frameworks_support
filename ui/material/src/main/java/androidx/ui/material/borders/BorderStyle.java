/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.material.borders;


/** The style of line to draw for a [BorderSide] in a [Border]. */
// TODO("Andrey: Migrate to Kotlin when enums will be supported by IR")
public enum BorderStyle {
    /** Skip the border. */
    None,

    /** Draw the border as a solid line. */
    Solid

    // if you add more, think about how they will lerp
}
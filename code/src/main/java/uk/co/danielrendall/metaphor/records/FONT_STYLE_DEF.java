/*
 * Copyright 2012 Daniel Rendall
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

package uk.co.danielrendall.metaphor.records;

import uk.co.danielrendall.metaphor.Record;
import uk.co.danielrendall.metaphor.RecordVisitor;

/**
 * @author Daniel Rendall
 */
public class FONT_STYLE_DEF extends Record {
    private final int fontDefIndex;
    private final int charStyle;

    public FONT_STYLE_DEF(int fontDefIndex, int charStyle) {
        this.fontDefIndex = fontDefIndex;
        this.charStyle = charStyle;
    }

    @Override
    public void accept(RecordVisitor visitor) {
        visitor.visit(this);
    }

    public int getFontDefIndex() {
        return fontDefIndex;
    }

    public int getCharStyle() {
        return charStyle;
    }
}

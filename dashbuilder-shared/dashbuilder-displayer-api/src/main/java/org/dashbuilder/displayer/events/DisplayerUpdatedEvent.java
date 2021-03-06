/**
 * Copyright (C) 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.displayer.events;

import org.dashbuilder.displayer.DisplayerSettings;
import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class DisplayerUpdatedEvent {

    private DisplayerSettings originalSettings;
    private DisplayerSettings modifiedSettings;

    public DisplayerUpdatedEvent() {
    }

    public DisplayerUpdatedEvent(DisplayerSettings originalSettings, DisplayerSettings modifiedSettings) {
        this.originalSettings = originalSettings;
        this.modifiedSettings = modifiedSettings;
    }

    public DisplayerSettings getOriginalSettings() {
        return originalSettings;
    }

    public void setOriginalSettings(DisplayerSettings originalSettings) {
        this.originalSettings = originalSettings;
    }

    public DisplayerSettings getModifiedSettings() {
        return modifiedSettings;
    }

    public void setModifiedSettings(DisplayerSettings modifiedSettings) {
        this.modifiedSettings = modifiedSettings;
    }
}
/*
 * Copyright 2020 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.data.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The project settings.
 */
@ApiModel(description = "The project settings.")
@JsonPropertyOrder({
        ProjectSettings.JSON_PROPERTY_ACCESS_RESTRICTIONS,
        ProjectSettings.JSON_PROPERTY_AUDIT_EVENTS
})
public class ProjectSettings {

    public static final String JSON_PROPERTY_ACCESS_RESTRICTIONS = "access_restrictions";
    private SettingsGroupAccessRestrictions accessRestrictions;

    public static final String JSON_PROPERTY_AUDIT_EVENTS = "audit_events";
    private SettingsGroupAuditEvents auditEvents;

    public ProjectSettings accessRestrictions(SettingsGroupAccessRestrictions accessRestrictions) {
        this.accessRestrictions = accessRestrictions;
        return this;
    }

    /**
     * Get accessRestrictions
     * @return accessRestrictions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ACCESS_RESTRICTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public SettingsGroupAccessRestrictions getAccessRestrictions() {
        return accessRestrictions;
    }

    public void setAccessRestrictions(SettingsGroupAccessRestrictions accessRestrictions) {
        this.accessRestrictions = accessRestrictions;
    }

    public ProjectSettings auditEvents(SettingsGroupAuditEvents auditEvents) {
        this.auditEvents = auditEvents;
        return this;
    }

    /**
     * Get auditEvents
     * @return auditEvents
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_AUDIT_EVENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public SettingsGroupAuditEvents getAuditEvents() {
        return auditEvents;
    }

    public void setAuditEvents(SettingsGroupAuditEvents auditEvents) {
        this.auditEvents = auditEvents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectSettings projectSettings = (ProjectSettings)o;
        return Objects.equals(this.accessRestrictions,
                projectSettings.accessRestrictions) &&
                Objects.equals(this.auditEvents, projectSettings.auditEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessRestrictions, auditEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectSettings {\n");
        sb.append("    accessRestrictions: ")
                .append(toIndentedString(accessRestrictions))
                .append("\n");
        sb.append("    auditEvents: ")
                .append(toIndentedString(auditEvents))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
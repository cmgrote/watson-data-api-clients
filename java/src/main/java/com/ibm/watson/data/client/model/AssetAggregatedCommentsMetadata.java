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
import java.util.Objects;

/**
 * AssetAggregatedCommentsMetadata
 */
public class AssetAggregatedCommentsMetadata {

    private String dayOfEvent;
    private String timeZoneOffset;

    public AssetAggregatedCommentsMetadata dayOfEvent(String dayOfEvent) {
        this.dayOfEvent = dayOfEvent;
        return this;
    }

    /**
     * Get dayOfEvent
     * @return dayOfEvent
     **/
    @javax.annotation.Nullable
    @JsonProperty("day_of_event")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public String getDayOfEvent() { return dayOfEvent; }
    public void setDayOfEvent(String dayOfEvent) { this.dayOfEvent = dayOfEvent; }

    public AssetAggregatedCommentsMetadata timeZoneOffset(String timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
        return this;
    }

    /**
     * Get timeZoneOffset
     * @return timeZoneOffset
     **/
    @javax.annotation.Nullable
    @JsonProperty("time_zone_offset")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public String getTimeZoneOffset() { return timeZoneOffset; }
    public void setTimeZoneOffset(String timeZoneOffset) { this.timeZoneOffset = timeZoneOffset; }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        AssetAggregatedCommentsMetadata assetAggregatedCommentsMetadata = (AssetAggregatedCommentsMetadata)o;
        return Objects.equals(this.dayOfEvent, assetAggregatedCommentsMetadata.dayOfEvent) &&
                Objects.equals(this.timeZoneOffset, assetAggregatedCommentsMetadata.timeZoneOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfEvent, timeZoneOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetAggregatedCommentsMetadata {\n");
        sb.append("    dayOfEvent: ").append(toIndentedString(dayOfEvent)).append("\n");
        sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }

}

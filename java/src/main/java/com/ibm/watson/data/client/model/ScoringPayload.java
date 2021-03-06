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

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.watson.data.client.model.enums.ScoringType;

import java.util.ArrayList;
import java.util.List;

/**
 * The payload for scoring. 
 */
public class ScoringPayload extends InputDataArray {

    private ScoringType type;
    private List<List<Object>> targets = null;

    public ScoringPayload type(ScoringType type) {
        this.type = type;
        return this;
    }

    /**
     * If specified, the &#x60;values&#x60; represents the ground truth data (the label information) for the input data provided. This infotmation will be used for computing machine learning metrics.
     * @return type
     **/
    @javax.annotation.Nullable
    @JsonProperty("type")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public ScoringType getType() { return type; }
    public void setType(ScoringType type) { this.type = type; }

    public ScoringPayload targets(List<List<Object>> targets) {
        this.targets = targets;
        return this;
    }

    public ScoringPayload addTargetsItem(List<Object> targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    /**
     * Used when performing evaluation. This contains the ground truths for the input data.
     * @return targets
     **/
    @javax.annotation.Nullable
    @JsonProperty("targets")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public List<List<Object>> getTargets() { return targets; }
    public void setTargets(List<List<Object>> targets) { this.targets = targets; }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        ScoringPayload scoringPayload = (ScoringPayload) o;
        return super.equals(o) &&
                Objects.equals(this.type, scoringPayload.type) &&
                Objects.equals(this.targets, scoringPayload.targets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, targets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScoringPayload {\n");
        super.toString(sb);
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}

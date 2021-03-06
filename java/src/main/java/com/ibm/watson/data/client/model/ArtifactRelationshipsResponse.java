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

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Artifact relationship response
 */
public class ArtifactRelationshipsResponse {

    private List<ArtifactRelationships> artifacts = null;

    public ArtifactRelationshipsResponse artifacts(List<ArtifactRelationships> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ArtifactRelationshipsResponse addArtifactsItem(ArtifactRelationships artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    /**
     * List of artifact relationships.
     * @return artifacts
     **/
    @javax.annotation.Nullable
    @JsonProperty("artifacts")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    public List<ArtifactRelationships> getArtifacts() { return artifacts; }
    public void setArtifacts(List<ArtifactRelationships> artifacts) { this.artifacts = artifacts; }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        ArtifactRelationshipsResponse that = (ArtifactRelationshipsResponse) o;
        return Objects.equals(this.artifacts, that.artifacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifacts);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactRelationshipsResponse {\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }

}

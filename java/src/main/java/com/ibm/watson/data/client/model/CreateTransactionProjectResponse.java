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
 * Description of create transactional project API response body.
 */
@ApiModel(description = "Description of create transactional project API response body.")
@JsonPropertyOrder({CreateTransactionProjectResponse.JSON_PROPERTY_LOCATION})
public class CreateTransactionProjectResponse {

    public static final String JSON_PROPERTY_LOCATION = "location";
    private String location;

    public CreateTransactionProjectResponse location(String location) {
        this.location = location;
        return this;
    }

    /**
     * API to access the newly created project.
     * @return location
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "API to access the newly created project.")
    @JsonProperty(JSON_PROPERTY_LOCATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) { this.location = location; }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransactionProjectResponse createTransactionProjectResponse =
                (CreateTransactionProjectResponse)o;
        return Objects.equals(this.location,
                createTransactionProjectResponse.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransactionProjectResponse {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
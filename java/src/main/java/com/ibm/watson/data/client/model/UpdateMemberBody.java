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
import com.ibm.watson.data.client.model.enums.MemberState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * A project member to update.
 */
@ApiModel(description = "A project member to update.")
@JsonPropertyOrder({
        UpdateMemberBody.JSON_PROPERTY_ID,
        UpdateMemberBody.JSON_PROPERTY_ROLE,
        UpdateMemberBody.JSON_PROPERTY_STATE,
        UpdateMemberBody.JSON_PROPERTY_USER_NAME
})
public class UpdateMemberBody {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_ROLE = "role";
    private String role;

    public static final String JSON_PROPERTY_STATE = "state";
    private MemberState state = MemberState.ACTIVE;

    public static final String JSON_PROPERTY_USER_NAME = "user_name";
    private String userName;

    public UpdateMemberBody id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The IAM ID of the project member. This field is required for project
     *members with the &#39;ACTIVE&#39; state.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
            example = "IBMid-55000353XF",
            value = "The IAM ID of the project member. This field is required for project members with the 'ACTIVE' state.")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }

    public UpdateMemberBody role(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get role
     * @return role
     **/
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getRole() {
        return role;
    }

    public void setRole(String role) { this.role = role; }

    public UpdateMemberBody state(MemberState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public MemberState getState() {
        return state;
    }

    public void setState(MemberState state) { this.state = state; }

    public UpdateMemberBody userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The username of the project member. If the member type is
     *&#39;service&#39;, then the &#39;user_name&#39; and &#39;id&#39; fields must
     *match.
     * @return userName
     **/
    @ApiModelProperty(
            example = "zapp.brannigan@ibm.com", required = true,
            value = "The username of the project member. If the member type is 'service', then the 'user_name' and 'id' fields must match.")
    @JsonProperty(JSON_PROPERTY_USER_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) { this.userName = userName; }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMemberBody updateMemberBody = (UpdateMemberBody)o;
        return Objects.equals(this.id, updateMemberBody.id) &&
                Objects.equals(this.role, updateMemberBody.role) &&
                Objects.equals(this.state, updateMemberBody.state) &&
                Objects.equals(this.userName, updateMemberBody.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role, state, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMemberBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
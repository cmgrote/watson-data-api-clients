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
 * JobRunPostBody
 */
public class JobRunPostBody {

    private JobRunPostBodyJobRun jobRun;

    public JobRunPostBody jobRun(JobRunPostBodyJobRun jobRun) {
        this.jobRun = jobRun;
        return this;
    }

    /**
     * Get jobRun
     * @return jobRun
     **/
    @JsonProperty("job_run")
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public JobRunPostBodyJobRun getJobRun() { return jobRun; }
    public void setJobRun(JobRunPostBodyJobRun jobRun) { this.jobRun = jobRun; }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        JobRunPostBody jobRunPostBody = (JobRunPostBody)o;
        return Objects.equals(this.jobRun, jobRunPostBody.jobRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobRunPostBody {\n");
        sb.append("    jobRun: ").append(toIndentedString(jobRun)).append("\n");
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

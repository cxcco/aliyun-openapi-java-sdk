/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.model.v20150630;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.batchcompute.transform.v20150630.UpdateJobRequestMarshaller;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class UpdateJobRequest extends RoaAcsRequest<UpdateJobResponse> {

    public UpdateJobRequest() {
        super("BatchCompute", "2015-06-30", "PutJob");
        setUriPattern("/jobs/[ResourceName]/Priority");
        setMethod(MethodType.PUT);
        setContentType(FormatType.RAW);
    }
    public UpdateJobRequest(String jobId, int priority) {
        super("BatchCompute", "2015-06-30", "PutJob");
        setUriPattern("/jobs/[ResourceName]/Priority");
        setMethod(MethodType.PUT);
        setContentType(FormatType.RAW);

        setJobId(jobId);
        setPriority(priority);
    }


    private String jobId;

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
        putPathParameter("ResourceName", jobId);
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
        UpdateJobRequestMarshaller.marshall(this);
    }

    private int priority;


    @Override
    public Class<UpdateJobResponse> getResponseClass() {
        return UpdateJobResponse.class;
    }

}

/*
 * ============LICENSE_START===================================================
 * Copyright (c) 2018 Amdocs
 * ============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=====================================================
 */

package org.onap.pomba.common.datatypes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Service {

    @Expose
    @SerializedName("uuid")
    private String uuid;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("modelVersionID")
    private String modelVersionID;
    @Expose
    @SerializedName("modelInvariantUUID")
    private String modelInvariantUUID;
    @Expose
    @SerializedName("dataQuality")
    private DataQuality dataQuality = DataQuality.ok();
    @Expose
    @SerializedName("attributeList")
    private List<Attribute> attributeList = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public DataQuality getDataQuality() {
        return dataQuality;
    }
    public void setDataQuality(DataQuality dataQuality) {
        this.dataQuality = dataQuality;
    }
    public List<Attribute> getAttributes() {
        return attributeList;
    }
    public void setAttributes(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }
    public String getModelVersionID() { return modelVersionID; }
    public void setModelVersionID(String modelVersionID) { this.modelVersionID = modelVersionID; }

    public String getModelInvariantUUID() {
        return modelInvariantUUID;
    }

    public void setModelInvariantUUID(String modelInvariantUUID) {
        this.modelInvariantUUID = modelInvariantUUID;
    }

}

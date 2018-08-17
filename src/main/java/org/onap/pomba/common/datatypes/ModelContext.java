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

public class ModelContext {

    @Expose
    @SerializedName("service")
    private Service service;
    @Expose
    @SerializedName("dataQuality")
    private DataQuality dataQuality = new DataQuality();
    @Expose
    @SerializedName("attributeList")
    private List<Attribute> attributeList = new ArrayList<>();
    @Expose
    @SerializedName("vfList")
    private List<VF> vfList = new ArrayList<>();

    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    public DataQuality getDataQuality() {
        return dataQuality;
    }
    public void setDataQuality(DataQuality dataQuality) {
        this.dataQuality = dataQuality;
    }
    public List<Attribute> getAttribute() {
        return attributeList;
    }
    public void setAttribute(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }
    public void addAttribute(Attribute attribute) {
        this.attributeList.add(attribute);
    }
    public List<VF> getVf() {
        return vfList;
    }
    public void setVf(List<VF> vfList) {
        this.vfList = vfList;
    }
    public void addVf(VF vf) {
        this.vfList.add(vf);
    }
}

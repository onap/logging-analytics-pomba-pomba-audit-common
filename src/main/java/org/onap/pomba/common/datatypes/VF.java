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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VF {

    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("type")
    private String type;
    @Expose
    @SerializedName("invariantUUID")
    private String invariantUuid;
    @Expose
    @SerializedName("uuid")
    private String uuid;
    @Expose
    @SerializedName("nfNamingCode")
    private String nfNamingCode;
    @Expose
    @SerializedName("dataQuality")
    private DataQuality dataQuality = new DataQuality();
    @Expose
    @SerializedName("attributeList")
    private List<Attribute> attributeList = new ArrayList<>();
    @Expose
    @SerializedName("vfModuleList")
    private List<VFModule> vfModules = new ArrayList<>();
    @Expose
    @SerializedName("vnfcList")
    private List<VNFC> vnfcs = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getInvariantUuid() {
        return invariantUuid;
    }
    public void setInvariantUuid(String invariantUuid) {
        this.invariantUuid = invariantUuid;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getNfNamingCode() {
        return nfNamingCode;
    }
    public void setNfNamingCode(String nfNamingCode) {
        this.nfNamingCode = nfNamingCode;
    }
    public List<VFModule> getVfModules() {
        return vfModules;
    }
    public void setVfModules(List<VFModule> vfModules) {
        this.vfModules = vfModules;
    }
    public void addVfModule(VFModule vfModule) {
        this.vfModules.add(vfModule);
    }
    public List<VNFC> getVnfcs() {
        return vnfcs;
    }
    public void setVnfcs(List<VNFC> vnfc) {
        this.vnfcs = vnfc;
    }
    public void addVnfc(VNFC vnfc) {
        this.vnfcs.add(vnfc);
    }
    public List<Attribute> getAttributes() {
        return attributeList;
    }
    public void setAttributes(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }
    public void addAttribute(Attribute attribute) {
        this.attributeList.add(attribute);
    }
    public DataQuality getDataQuality() {
        return dataQuality;
    }
    public void setDataQuality(DataQuality dataQuality) {
        this.dataQuality = dataQuality;
    }
}

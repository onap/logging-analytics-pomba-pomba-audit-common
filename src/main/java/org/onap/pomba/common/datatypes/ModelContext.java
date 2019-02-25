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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(value="ModelContext")
public class ModelContext {

    @Expose
    @SerializedName("service")
    private Service service;
    @Expose
    @SerializedName("dataQuality")
    private DataQuality dataQuality = DataQuality.ok();
    @Expose
    @SerializedName("attributeList")
    private List<Attribute> attributeList = new ArrayList<>();
    @Expose
    @SerializedName("vnfList")
    private List<VNF> vnfList = new ArrayList<>();
    @Expose
    @SerializedName("pnfList")
    private List<PNF> pnfList = new ArrayList<>();
    @Expose
    @SerializedName("networkList")
    private List<Network> networkList = new ArrayList<>();
    @Expose
    @SerializedName("logicalLinkList")
    private List<LogicalLink> logicalLinkList = new ArrayList<>();


    @ApiModelProperty(value = "Service object of the model")
    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }
    @ApiModelProperty(value = "Data Quality indicator")
    public DataQuality getDataQuality() {
        return dataQuality;
    }
    public void setDataQuality(DataQuality dataQuality) {
        this.dataQuality = dataQuality;
    }
    @ApiModelProperty(value = "List of attributes")
    public List<Attribute> getAttributes() {
        return attributeList;
    }
    public void setAttributes(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }
    public void addAttribute(Attribute attribute) {
        this.attributeList.add(attribute);
    }
    @ApiModelProperty(value = "List of VNF associated with the service instance")
    public List<VNF> getVnfs() {
        return vnfList;
    }
    public void setVnfs(List<VNF> vfList) {
        this.vnfList = vfList;
    }
    public void addVf(VNF vf) {
        this.vnfList.add(vf);
    }
    @ApiModelProperty(value = "List of PNF associated with the service instance")
    public List<PNF> getPnfs() {
        return pnfList;
    }
    public void setPnfs(List<PNF> pnfList) {
        this.pnfList = pnfList;
    }
    public void addPnf(PNF pnf) {
        this.pnfList.add(pnf);
    }

    @ApiModelProperty(value = "List of Logical-link associated with the service instance")
    public List<LogicalLink> getLogicalLinkList() {
        return logicalLinkList;
    }

    public void setLogicalLinkList(List<LogicalLink> logicalLinkList) {
        this.logicalLinkList = logicalLinkList;
    }

    @ApiModelProperty(value = "List of networks associated with the service instance")
    public List<Network> getNetworkList() { return networkList; }
    public void setNetworkList(List<Network> networkList) { this.networkList = networkList; }
    public void addNetwork(Network network) {
        this.networkList.add(network);
    }

}

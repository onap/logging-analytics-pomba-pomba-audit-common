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

public class Attribute {
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("value")
    private String value;
    @Expose
    @SerializedName("data-quality")
    private DataQuality dataQuality = new DataQuality();

    public enum Value {
        adminState,
        ipAddress,
        hostName,
        lockedBoolean,
        macAddress,
        networkType,
        networkTechnology,
        physicalNetworkName,
        sharedNetworkBoolean,
        networkRole,
        routerExternalBoolean
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(Value value) {
        this.value = value.toString();
    }
    public DataQuality getDataQuality() {
        return dataQuality;
    }
    public void setDataQuality(DataQuality dataQuality) {
        this.dataQuality = dataQuality;
    }

}

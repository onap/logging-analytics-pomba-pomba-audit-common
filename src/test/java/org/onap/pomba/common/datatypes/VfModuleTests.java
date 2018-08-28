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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import org.onap.pomba.common.datatypes.Attribute.Name;
import org.onap.pomba.common.datatypes.DataQuality.Status;

public class VfModuleTests {
    @Test
    public void testVFModule() {
        VFModule aVFModule = new VFModule();
        aVFModule.setName("Name");
        aVFModule.setInvariantUuid("Invariant Uuid");
        aVFModule.setUuid("Uuid");
        aVFModule.setNfNamingCode("Nf Naming Code");
        aVFModule.setMaxInstances(10);
        aVFModule.setMinInstances(1);
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        aVFModule.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Name.hostName);
        aVFModule.addAttribute(attribute);
        assertTrue("VFModule Name doesn't match", aVFModule.getName().equals("Name"));
        assertTrue("VFModule Invariant Uuid doesn't match", aVFModule.getInvariantUuid().equals("Invariant Uuid"));
        assertTrue("VFModule Uuid doesn't match", aVFModule.getUuid().equals("Uuid"));
        assertTrue("VFModule Nf Naming Code doesn't match", aVFModule.getNfNamingCode().equals("Nf Naming Code"));
        assertEquals(aVFModule.getMaxInstances(), 10);
        assertEquals(aVFModule.getMinInstances(), 1);
        assertTrue("VFModule data quality status doesn't match", aVFModule.getDataQuality().getStatus().equals(Status.error));
        assertTrue("VFModule data quality error text doesn't match", aVFModule.getDataQuality().getErrorText().equals("Test"));
        assertTrue("VFModule attribute name doesn't match", aVFModule.getAttributes().get(0).getName().equals(Name.hostName));
        List<Attribute> attributeList = aVFModule.getAttributes();
        aVFModule.setAttributes(attributeList);
        assertEquals(aVFModule.getAttributes().size(), 1);
        VM vm = new VM();
        vm.setName("VM");
        aVFModule.addVm(vm);
        assertTrue("VFModule vm name doesn't match", aVFModule.getVms().get(0).getName().equals("VM"));
        List<VM> vmList = aVFModule.getVms();
        aVFModule.setVms(vmList);
        assertEquals(aVFModule.getVms().size(), 1);
        Network network = new Network();
        network.setName("Network");
        aVFModule.addNetwork(network);
        assertTrue("VFModule network name doesn't match", aVFModule.getNetworks().get(0).getName().equals("Network"));
        List<Network> networkList = aVFModule.getNetworks();
        aVFModule.setNetworks(networkList);
        assertEquals(aVFModule.getNetworks().size(), 1);


    }
}

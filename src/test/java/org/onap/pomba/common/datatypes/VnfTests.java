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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.onap.pomba.common.datatypes.Attribute.Name;
import org.onap.pomba.common.datatypes.DataQuality.Status;

public class VnfTests {
    @Test
    public void testVF() {
        VNF aVF = new VNF();
        aVF.setName("VF name");
        aVF.setType("Type");
        aVF.setModelInvariantUUID("Invariant Uuid");
        aVF.setUuid("Uuid");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        aVF.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Name.hostName);
        aVF.addAttribute(attribute);
        assertTrue("VF name doesn't match", aVF.getName().equals("VF name"));
        assertTrue("VF Type doesn't match", aVF.getType().equals("Type"));
        assertTrue("VF Invariant Uuid doesn't match", aVF.getModelInvariantUUID().equals("Invariant Uuid"));
        assertTrue("VF Uuid doesn't match", aVF.getUuid().equals("Uuid"));
        assertTrue("VF data quality status doesn't match", aVF.getDataQuality().getStatus().equals(Status.error));
        assertTrue("VF data quality error text doesn't match", aVF.getDataQuality().getErrorText().equals("Test"));
        assertTrue("VF attribute name doesn't match", aVF.getAttributes().get(0).getName().equals(Name.hostName));
        List<Attribute> attributeList = aVF.getAttributes();
        aVF.setAttributes(attributeList);
        assertEquals(aVF.getAttributes().size(), 1);
    }

    @Test
    public void testSetVFModuleList() {
        VNF aVF = new VNF();
        List<VFModule> vfModuleList = new ArrayList<VFModule>();
        assertEquals(vfModuleList.size(), 0);
        VFModule vfModule = new VFModule();
        vfModule.setModelInvariantUUID("Invariant Uuid");
        vfModule.setMaxInstances(10);
        vfModule.setMinInstances(1);
        vfModule.setUuid("Uuid");
        vfModuleList.add(vfModule);
        aVF.setVfModules(vfModuleList);
        assertEquals(vfModuleList.size(), 1);
    }

    @Test
    public void testAddVfModule() {
        VNF aVF = new VNF();
        List<VFModule> vfModuleList = new ArrayList<VFModule>();
        assertEquals(vfModuleList.size(), 0);
        VFModule vfModule = new VFModule();
        vfModule.setModelInvariantUUID("Invariant Uuid");
        vfModule.setMaxInstances(10);
        vfModule.setMinInstances(1);
        vfModule.setUuid("Uuid");
        vfModuleList.add(vfModule);
        aVF.addVfModule(vfModule);
        assertEquals(vfModuleList.size(), 1);
    }

    @Test
    public void testGetVfModules() {
        VNF aVF = new VNF();
        List<VFModule> vfModuleList = new ArrayList<VFModule>();
        assertEquals(vfModuleList.size(), 0);
        VFModule vfModule = new VFModule();
        vfModule.setModelInvariantUUID("Invariant Uuid");
        vfModule.setMaxInstances(10);
        vfModule.setMinInstances(1);
        vfModule.setUuid("Uuid");
        vfModuleList.add(vfModule);
        aVF.addVfModule(vfModule);
        List<VFModule> resultVFModules = aVF.getVfModules();
        assertTrue("VF Modules doesn't match",
                ((VFModule) resultVFModules.get(0)).getModelInvariantUUID().equals("Invariant Uuid"));
    }

    @Test
    public void testSetVnfc() {
        VNF aVF = new VNF();
        List<VNFC> vnfcList = new ArrayList<VNFC>();
        assertEquals(vnfcList.size(), 0);
        VNFC aVNFC = new VNFC();
        aVNFC.setName("VNFC name");
        vnfcList.add(aVNFC);
        aVF.setVnfcs(vnfcList);
        assertTrue("VNFC list item doesn't match", aVF.getVnfcs().get(0).getName().equals("VNFC name"));
    }

    @Test
    public void testAddVnfc() {
        VNF aVF = new VNF();
        assertEquals(aVF.getVnfcs().size(), 0);
        VNFC aVNFC = new VNFC();
        aVNFC.setName("VNFC name");
        aVF.addVnfc(aVNFC);
        assertTrue("VNFC list item doesn't match", aVF.getVnfcs().get(0).getName().equals("VNFC name"));
    }
}

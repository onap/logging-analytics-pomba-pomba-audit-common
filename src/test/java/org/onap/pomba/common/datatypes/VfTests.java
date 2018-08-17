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
import org.onap.pomba.common.datatypes.DataQuality.Status;

public class VfTests {
    @Test
    public void testVF() {
        VF aVF = new VF();
        aVF.setName("VF name");
        aVF.setType("Type");
        aVF.setInvariantUuid("Invariant Uuid");
        aVF.setUuid("Uuid");
        aVF.setNfNamingCode("NF Naming Code");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        aVF.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName("Attribute");
        aVF.addAttribute(attribute);
        assertTrue("VF name doesn't match", aVF.getName().equals("VF name"));
        assertTrue("VF Type doesn't match", aVF.getType().equals("Type"));
        assertTrue("VF Invariant Uuid doesn't match", aVF.getInvariantUuid().equals("Invariant Uuid"));
        assertTrue("VF Uuid doesn't match", aVF.getUuid().equals("Uuid"));
        assertTrue("VF NF Naming Code doesn't match", aVF.getNfNamingCode().equals("NF Naming Code"));
        assertTrue("VF data quality status doesn't match", aVF.getDataQuality().getStatus().equals(Status.error));
        assertTrue("VF data quality error text doesn't match", aVF.getDataQuality().getErrorText().equals("Test"));
        assertTrue("VF attribute name doesn't match", aVF.getAttribute().get(0).getName().equals("Attribute"));
        List<Attribute> attributeList = aVF.getAttribute();
        aVF.setAttribute(attributeList);
        assertEquals(aVF.getAttribute().size(), 1);
    }

    @Test
    public void testSetVFModuleList() {
        VF aVF = new VF();
        List<VFModule> vfModuleList = new ArrayList<VFModule>();
        assertEquals(vfModuleList.size(), 0);
        VFModule vfModule = new VFModule();
        vfModule.setInvariantUuid("Invariant Uuid");
        vfModule.setMaxInstances(10);
        vfModule.setMinInstances(1);
        vfModule.setUuid("Uuid");
        vfModuleList.add(vfModule);
        aVF.setVfModules(vfModuleList);
        assertEquals(vfModuleList.size(), 1);
    }

    @Test
    public void testAddVfModule() {
        VF aVF = new VF();
        List<VFModule> vfModuleList = new ArrayList<VFModule>();
        assertEquals(vfModuleList.size(), 0);
        VFModule vfModule = new VFModule();
        vfModule.setInvariantUuid("Invariant Uuid");
        vfModule.setMaxInstances(10);
        vfModule.setMinInstances(1);
        vfModule.setUuid("Uuid");
        vfModuleList.add(vfModule);
        aVF.addVfModule(vfModule);
        assertEquals(vfModuleList.size(), 1);
    }

    @Test
    public void testGetVfModules() {
        VF aVF = new VF();
        List<VFModule> vfModuleList = new ArrayList<VFModule>();
        assertEquals(vfModuleList.size(), 0);
        VFModule vfModule = new VFModule();
        vfModule.setInvariantUuid("Invariant Uuid");
        vfModule.setMaxInstances(10);
        vfModule.setMinInstances(1);
        vfModule.setUuid("Uuid");
        vfModuleList.add(vfModule);
        aVF.addVfModule(vfModule);
        List<VFModule> resultVFModules = aVF.getVfModules();
        assertTrue("VF Modules doesn't match",
                ((VFModule) resultVFModules.get(0)).getInvariantUuid().equals("Invariant Uuid"));
    }

    @Test
    public void testSetVnfc() {
        VF aVF = new VF();
        List<VNFC> vnfcList = new ArrayList<VNFC>();
        assertEquals(vnfcList.size(), 0);
        VNFC aVNFC = new VNFC();
        aVNFC.setName("VNFC name");
        vnfcList.add(aVNFC);
        aVF.setVnfc(vnfcList);
        assertTrue("VNFC list item doesn't match", aVF.getVnfc().get(0).getName().equals("VNFC name"));
    }

    @Test
    public void testAddVnfc() {
        VF aVF = new VF();
        assertEquals(aVF.getVnfc().size(), 0);
        VNFC aVNFC = new VNFC();
        aVNFC.setName("VNFC name");
        aVF.addVnfc(aVNFC);
        assertTrue("VNFC list item doesn't match", aVF.getVnfc().get(0).getName().equals("VNFC name"));
    }
}

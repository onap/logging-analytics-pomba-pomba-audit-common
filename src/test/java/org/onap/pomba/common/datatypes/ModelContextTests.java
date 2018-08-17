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

public class ModelContextTests {
    @Test
    public void testSetService() {
        ModelContext modelContext = new ModelContext();
        Service aService = new Service();
        aService.setName("Service Name");
        modelContext.setService(aService);
        assertTrue("ModelContext service name doesn't match",
                modelContext.getService().getName().equals("Service Name"));
    }

    @Test
    public void testSetVf() {
        ModelContext modelContext = new ModelContext();
        List<VF> vfList = new ArrayList<VF>();
        VF aVF = new VF();
        aVF.setName("VF name");
        vfList.add(aVF);
        modelContext.setVf(vfList);
        assertEquals(modelContext.getVf().size(), 1);
    }

    @Test
    public void testAddVf() {
        ModelContext modelContext = new ModelContext();
        VF aVF = new VF();
        aVF.setName("VF name");
        modelContext.addVf(aVF);
        assertEquals(modelContext.getVf().size(), 1);
        assertTrue("ModelContext VF name doesn't match", modelContext.getVf().get(0).getName().equals("VF name"));
    }

}

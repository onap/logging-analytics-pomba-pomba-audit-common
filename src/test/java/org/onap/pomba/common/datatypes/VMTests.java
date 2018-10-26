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

public class VMTests {
    @Test
    public void testVM() {
        VM aVM = new VM();
        aVM.setName("VM name");
        aVM.setUuid("Uuid");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        aVM.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Name.hostName);
        aVM.addAttribute(attribute);
        assertTrue("VM name doesn't match", aVM.getName().equals("VM name"));
        assertTrue("VM uuid doesn't match", aVM.getUuid().equals("Uuid"));
        assertTrue("VM data quality status doesn't match", aVM.getDataQuality().getStatus().equals(Status.error));
        assertTrue("VM data quality error text doesn't match", aVM.getDataQuality().getErrorText().equals("Test"));
        assertTrue("VM attribute name doesn't match", aVM.getAttributes().get(0).getName().equals(Name.hostName));
        List<Attribute> attributeList = aVM.getAttributes();
        aVM.setAttributes(attributeList);
        assertEquals(aVM.getAttributes().size(), 1);
    }

}

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

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PhysicalLinkTests {

    @Test
    public void testPhysicalLink() {
        PhysicalLink aPhysicalLink = new PhysicalLink();
        aPhysicalLink.setName("PhysicalLink name");
        aPhysicalLink.setUuid("Uuid");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(DataQuality.Status.error);
        dataQuality.setErrorText("Test");
        aPhysicalLink.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Attribute.Name.hostName);
        aPhysicalLink.addAttribute(attribute);
        assertTrue("PhysicalLink name doesn't match", aPhysicalLink.getName().equals("PhysicalLink name"));
        assertTrue("PhysicalLink uuid doesn't match", aPhysicalLink.getUuid().equals("Uuid"));
        assertTrue("PhysicalLink data quality status doesn't match", aPhysicalLink.getDataQuality().getStatus().equals(DataQuality.Status.error));
        assertTrue("PhysicalLink data quality error text doesn't match", aPhysicalLink.getDataQuality().getErrorText().equals("Test"));
        assertTrue("PhysicalLink attribute name doesn't match", aPhysicalLink.getAttributes().get(0).getName().equals(Attribute.Name.hostName));
        assertEquals(aPhysicalLink.getAttributes().size(), 1);
    }
}



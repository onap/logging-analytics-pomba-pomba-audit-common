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

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PserverTests {

    @Test
    public void testPserver() {
        Pserver aPserver = new Pserver();
        aPserver.setName("Pserver name");
        aPserver.setUuid("Uuid");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(DataQuality.Status.error);
        dataQuality.setErrorText("Test");
        aPserver.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Attribute.Name.hostName);
        aPserver.addAttribute(attribute);
        assertTrue("Pserver name doesn't match", aPserver.getName().equals("Pserver name"));
        assertTrue("Pserver uuid doesn't match", aPserver.getUuid().equals("Uuid"));
        assertTrue("Pserver data quality status doesn't match", aPserver.getDataQuality().getStatus().equals(DataQuality.Status.error));
        assertTrue("Pserver data quality error text doesn't match", aPserver.getDataQuality().getErrorText().equals("Test"));
        assertTrue("Pserver attribute name doesn't match", aPserver.getAttributes().get(0).getName().equals(Attribute.Name.hostName));
        List<Attribute> attributeList = aPserver.getAttributes();
        assertEquals(aPserver.getAttributes().size(), 1);
    }
}

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

public class PInterfaceTests {

    @Test
    public void testPInterface() {
        PInterface aPinterface = new PInterface();
        aPinterface.setName("Pinterface name");
        aPinterface.setUuid("Uuid");
        Port aPort = new Port();
        aPort.setName("port name");
        aPinterface.setPort(aPort);
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(DataQuality.Status.error);
        dataQuality.setErrorText("Test");
        aPinterface.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Attribute.Name.hostName);
        aPinterface.addAttribute(attribute);
        assertTrue("PInterface name doesn't match", aPinterface.getName().equals("Pinterface name"));
        assertTrue("PInterface uuid doesn't match", aPinterface.getUuid().equals("Uuid"));
        assertTrue("PInterface port name doesn't match", aPinterface.getPort().getName().equals("port name"));
        assertTrue("PInterface data quality status doesn't match", aPinterface.getDataQuality().getStatus().equals(DataQuality.Status.error));
        assertTrue("PInterface data quality error text doesn't match", aPinterface.getDataQuality().getErrorText().equals("Test"));
        assertTrue("PInterface attribute name doesn't match", aPinterface.getAttributes().get(0).getName().equals(Attribute.Name.hostName));
        assertEquals(aPinterface.getAttributes().size(), 1);
    }
}


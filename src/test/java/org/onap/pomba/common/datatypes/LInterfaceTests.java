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

public class LInterfaceTests {

    @Test
    public void testLInterface() {
        LInterface aLinterface = new LInterface();
        aLinterface.setName("LInterface name");
        aLinterface.setUuid("Uuid");
        Port aPort = new Port();
        aPort.setName("port name");
        aLinterface.setPort(aPort);
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(DataQuality.Status.error);
        dataQuality.setErrorText("Test");
        aLinterface.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Attribute.Name.hostName);
        aLinterface.addAttribute(attribute);
        assertTrue("LInterface name doesn't match", aLinterface.getName().equals("LInterface name"));
        assertTrue("LInterface uuid doesn't match", aLinterface.getUuid().equals("Uuid"));
        assertTrue("LInterface port name doesn't match", aLinterface.getPort().getName().equals("port name"));
        assertTrue("LInterface data quality status doesn't match", aLinterface.getDataQuality().getStatus().equals(DataQuality.Status.error));
        assertTrue("LInterface data quality error text doesn't match", aLinterface.getDataQuality().getErrorText().equals("Test"));
        assertTrue("LInterface attribute name doesn't match", aLinterface.getAttributes().get(0).getName().equals(Attribute.Name.hostName));
        assertEquals(aLinterface.getAttributes().size(), 1);
    }
}


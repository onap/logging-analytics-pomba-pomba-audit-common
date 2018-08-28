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

public class NetworkTests {
    @Test
    public void testNetwork() {
        Network aNetwork = new Network();
        aNetwork.setName("Network name");
        aNetwork.setInvariantUuid("Invariant Uuid");
        aNetwork.setUuid("Uuid");
        aNetwork.setNfcNamingCode("NFC Naming Code");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        aNetwork.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Name.hostName);
        aNetwork.addAttribute(attribute);
        assertTrue("Network name doesn't match", aNetwork.getName().equals("Network name"));
        assertTrue("Network invariant uuid doesn't match", aNetwork.getInvariantUuid().equals("Invariant Uuid"));
        assertTrue("Network NFC Naming Code doesn't match", aNetwork.getNfcNamingCode().equals("NFC Naming Code"));
        assertTrue("Network uuid doesn't match", aNetwork.getUuid().equals("Uuid"));
        assertTrue("Network data quality status doesn't match", aNetwork.getDataQuality().getStatus().equals(Status.error));
        assertTrue("Network data quality error text doesn't match", aNetwork.getDataQuality().getErrorText().equals("Test"));
        assertTrue("Network attribute name doesn't match", aNetwork.getAttributes().get(0).getName().equals(Name.hostName));
        List<Attribute> attributeList = aNetwork.getAttributes();
        aNetwork.setAttributes(attributeList);
        assertEquals(aNetwork.getAttributes().size(), 1);
    }

}

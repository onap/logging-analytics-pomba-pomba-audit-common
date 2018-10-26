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

public class PNFTests {

    @Test
    public void testPNF() {
        PNF aPNF = new PNF();
        aPNF.setName("PNF name");
        aPNF.setUuid("Uuid");
        aPNF.setModelVersionID("a-123456");
        aPNF.setModelInvariantUUID("b-12345");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(DataQuality.Status.error);
        dataQuality.setErrorText("Test");
        aPNF.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Attribute.Name.hostName);
        aPNF.addAttribute(attribute);
        assertTrue("PNF name doesn't match", aPNF.getName().equals("PNF name"));
        assertTrue("PNF uuid doesn't match", aPNF.getUuid().equals("Uuid"));
        assertTrue("PNF model version id  doesn't match", aPNF.getModelVersionID().equals("a-123456"));
        assertTrue("PNF model invariant uuid  doesn't match", aPNF.getModelInvariantUUID().equals("b-12345"));
        assertTrue("PNF data quality status doesn't match", aPNF.getDataQuality().getStatus().equals(DataQuality.Status.error));
        assertTrue("PNF data quality error text doesn't match", aPNF.getDataQuality().getErrorText().equals("Test"));
        assertTrue("PNF attribute name doesn't match", aPNF.getAttributes().get(0).getName().equals(Attribute.Name.hostName));
        assertEquals(aPNF.getAttributes().size(), 1);
    }
}

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

public class VnfcTests {
    @Test
    public void testVNFC() {
        VNFC aVNFC = new VNFC();
        aVNFC.setName("VNFC name");
        aVNFC.setInvariantUuid("Invariant Uuid");
        aVNFC.setUuid("Uuid");
        aVNFC.setType("Type");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        aVNFC.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Name.hostName);
        aVNFC.addAttribute(attribute);
        assertTrue("VNFC name doesn't match", aVNFC.getName().equals("VNFC name"));
        assertTrue("VNFC invariant uuid doesn't match", aVNFC.getInvariantUuid().equals("Invariant Uuid"));
        assertTrue("VNFC uuid doesn't match", aVNFC.getUuid().equals("Uuid"));
        assertTrue("VNFC type doesn't match", aVNFC.getType().equals("Type"));
        assertTrue("VNFC data quality status doesn't match", aVNFC.getDataQuality().getStatus().equals(Status.error));
        assertTrue("VNFC data quality error text doesn't match", aVNFC.getDataQuality().getErrorText().equals("Test"));
        assertTrue("VNFC attribute name doesn't match", aVNFC.getAttributes().get(0).getName().equals(Name.hostName));
        List<Attribute> attributeList = aVNFC.getAttributes();
        aVNFC.setAttributes(attributeList);
        assertEquals(aVNFC.getAttributes().size(), 1);
    }
}

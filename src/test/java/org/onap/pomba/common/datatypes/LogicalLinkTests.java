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

public class LogicalLinkTests {

    @Test
    public void testLogicalLink() {
        LogicalLink aLogicalLink = new LogicalLink();
        aLogicalLink.setName("LogicalLink name");
        aLogicalLink.setUuid("Uuid");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(DataQuality.Status.error);
        dataQuality.setErrorText("Test");
        aLogicalLink.setDataQuality(dataQuality);
        Attribute attribute = new Attribute();
        attribute.setName(Attribute.Name.hostName);
        aLogicalLink.addAttribute(attribute);
        assertTrue("LogicalLink name doesn't match", aLogicalLink.getName().equals("LogicalLink name"));
        assertTrue("LogicalLink uuid doesn't match", aLogicalLink.getUuid().equals("Uuid"));
        assertTrue("LogicalLink data quality status doesn't match", aLogicalLink.getDataQuality().getStatus().equals(DataQuality.Status.error));
        assertTrue("LogicalLink data quality error text doesn't match", aLogicalLink.getDataQuality().getErrorText().equals("Test"));
        assertTrue("LogicalLink attribute name doesn't match", aLogicalLink.getAttributes().get(0).getName().equals(Attribute.Name.hostName));
        assertEquals(aLogicalLink.getAttributes().size(), 1);
    }
}




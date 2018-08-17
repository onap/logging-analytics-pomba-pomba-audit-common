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

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.onap.pomba.common.datatypes.Attribute.Value;
import org.onap.pomba.common.datatypes.DataQuality.Status;

public class AttributeTests {
    @Test
    public void testAttribute() {
        Attribute attribute = new Attribute();
        attribute.setName("Attribute");
        attribute.setValue(Value.adminState);
        assertTrue("Attribute name doesn't match", attribute.getName().equals("Attribute"));
        assertTrue("Attribute value doesn't match", attribute.getValue().equals(Value.adminState));
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        attribute.setDataQuality(dataQuality);
        assertTrue("Attribute data quality status doesn't match", attribute.getDataQuality().getStatus().equals(Status.error));
        assertTrue("Attribute data quality error text doesn't match", attribute.getDataQuality().getErrorText().equals("Test"));
    }

}

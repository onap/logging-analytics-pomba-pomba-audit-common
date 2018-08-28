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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.onap.pomba.common.datatypes.DataQuality.Status;

public class DataQualityTests {
    @Test
    public void testDataQuality() {
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.ok);
        assertTrue("DataQuality status doesn't match", dataQuality.getStatus().equals(Status.ok));
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        assertTrue("DataQuality status doesn't match", dataQuality.getStatus().equals(Status.error));
        assertTrue("DataQuality error text doesn't match", dataQuality.getErrorText().equals("Test"));
    }

    @Test
    public void dataQualityHelpers() {
        DataQuality dataQuality = DataQuality.ok();
        assertEquals(DataQuality.Status.ok, dataQuality.getStatus());
        assertNull(dataQuality.getErrorText());

        dataQuality = DataQuality.error("test");
        assertEquals(DataQuality.Status.error, dataQuality.getStatus());
        assertEquals("test", dataQuality.getErrorText());
        assertTrue(dataQuality.toString().contains("test"));
    }
}

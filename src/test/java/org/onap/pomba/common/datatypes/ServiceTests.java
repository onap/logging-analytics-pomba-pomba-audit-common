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

public class ServiceTests {
    @Test
    public void testService() {
        Service aService = new Service();
        aService.setName("new service");
        aService.setModelInvariantUUID("Invariant Uuid");
        aService.setUuid("Uuid");
        DataQuality dataQuality = new DataQuality();
        dataQuality.setStatus(Status.error);
        dataQuality.setErrorText("Test");
        aService.setDataQuality(dataQuality);
        assertTrue("Service Name doesn't match", aService.getName().equals("new service"));
        assertTrue("Invariant Uuid doesn't match", aService.getModelInvariantUUID().equals("Invariant Uuid"));
        assertTrue("Uuid doesn't match", aService.getUuid().equals("Uuid"));
        assertTrue("Service data quality status doesn't match", aService.getDataQuality().getStatus().equals(Status.error));
        assertTrue("Service data quality error text doesn't match", aService.getDataQuality().getErrorText().equals("Test"));
    }
}

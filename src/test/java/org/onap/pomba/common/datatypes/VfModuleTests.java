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

import org.junit.Test;

public class VfModuleTests {
	@Test
	public void testVFModule() {
		VFModule aVFModule = new VFModule();
		aVFModule.setInvariantUuid("Invariant Uuid");
		aVFModule.setUuid("Uuid");
		aVFModule.setMaxInstances(10);
		aVFModule.setMinInstances(1);

		assertTrue("VFModule Invariant Uuid doesn't match", aVFModule.getInvariantUuid().equals("Invariant Uuid"));
		assertTrue("VFModule Uuid doesn't match", aVFModule.getUuid().equals("Uuid"));
		assertEquals(aVFModule.getMaxInstances(), 10);
		assertEquals(aVFModule.getMinInstances(), 1);
	}
}

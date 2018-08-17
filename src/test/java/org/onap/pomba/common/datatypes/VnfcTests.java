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

public class VnfcTests {
    @Test
    public void testVNFC() {
        VNFC aVNFC = new VNFC();
        aVNFC.setName("VNFC name");
        aVNFC.setInvariantUuid("Invariant Uuid");
        aVNFC.setUuid("Uuid");
        aVNFC.setNfcNamingCode("NFC Naming Code");
        assertTrue("VNFC name doesn't match", aVNFC.getName().equals("VNFC name"));
        assertTrue("VNFC invariant uuid doesn't match", aVNFC.getInvariantUuid().equals("Invariant Uuid"));
        assertTrue("VNFC NFC Naming Code doesn't match", aVNFC.getNfcNamingCode().equals("NFC Naming Code"));
        assertTrue("VNFC uuid doesn't match", aVNFC.getUuid().equals("Uuid"));
    }
}

/*
 * =========================================================================
 * Copyright 2019 T-Mobile USA, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * See the LICENSE file for additional language around disclaimer of warranties.
 * Trademark Disclaimer: Neither the name of “T-Mobile, USA” nor the names of
 * its contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 * ===========================================================================
 */

package com.tmobile.ct.tep.qapi.tvaultclient.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CredentialsTest {

    private Credentials credentials;
    private static String username = "user1";
    private static String password = "pass1";

    @Before
    public void setUp() throws Exception {
        credentials = new Credentials(username,password);
    }

    @Test
    public void getUsername() {
        Assert.assertEquals(username,credentials.getUsername());
        credentials.setUsername("other");
        Assert.assertNotEquals(username,credentials.getUsername());
    }

    @Test
    public void getPassword() {
        Assert.assertEquals(password,credentials.getPassword());
        credentials.setPassword("other");
        Assert.assertNotEquals(password,credentials.getPassword());
    }
}

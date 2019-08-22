package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class LoggedExampleTest {
    private LoggedExample logged;

    @Before
    public void setUp() {
        logged = PowerMock.createNiceMock(LoggedExample.class);
    }

    @After
    public void tearDown() {
        PowerMock.verify(logged);
    }

    @Test
    public void dummyTest() {

    }
}
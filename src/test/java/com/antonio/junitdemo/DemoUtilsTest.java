package com.antonio.junitdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();
        assertEquals(2, demoUtils.add(1, 1), "1+1 must be 2");
        assertNotEquals(4, demoUtils.add(1, 2), "1+2 must not be 4");

    }

    @Test
    void testCheckNullWithNull() {
        DemoUtils demoUtils = new DemoUtils();
        assertNull(demoUtils.checkNull(null), "Should return null when input is null");
    }

}

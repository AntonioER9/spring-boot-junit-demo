package com.antonio.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach(){
        System.out.println("@AfterEach executes after the execution of each test method");
        System.out.println();
    }

//    @BeforeAll
//    static void setupBeforeEachClass(){
//        System.out.println("@BeforeAll executes before all the test methods");
//    }

//    @AfterAll
//    static void tearDownAfterAll(){
//        System.out.println("@AfterAll executes after all the test methods");
//    }

    @Test
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");
        assertEquals(2, demoUtils.add(1, 1), "1+1 must be 2");
        assertNotEquals(4, demoUtils.add(1, 2), "1+2 must not be 4");

    }

    @Test
    void testCheckNullWithNull() {
        System.out.println("Running test: testCheckNullWithNull");
        assertNull(demoUtils.checkNull(null), "Should return null when input is null");
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame() {

        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should be the same");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should be the same");
    }



}

package io.learn.annotations;

import org.testng.annotations.*;

public class ClassMethodTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Inside beforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Inside beforeMethod");
    }

    @Test
    public void testMethod() {
        System.out.println("Inside testMethod");
    }

    @Test
    public void testMethod2() {
        System.out.println("Inside testMethod2");
    }

    @Test
    public void testMethod3() {
        System.out.println("Inside testMethod3");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Inside afterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Inside afterClass");
    }
}

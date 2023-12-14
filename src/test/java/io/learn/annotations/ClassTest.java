package io.learn.annotations;

import org.testng.annotations.*;

public class ClassTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Inside beforeClass");
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

    @AfterClass
    public void afterClass() {
        System.out.println("Inside afterClass");
    }
}

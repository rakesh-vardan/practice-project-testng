package io.learn.annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest2 {

    @Test
    public void testMethod() {
        System.out.println("Inside SampleTest2 testMethod");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Inside SampleTest2 beforeTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Inside SampleTest2 beforeSuite");
    }

}

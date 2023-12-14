package io.learn.annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest1 {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Inside SampleTest1 beforeTest");
    }

    @Test
    public void testMethod() {
        System.out.println("Inside SampleTest1 testMethod");
    }
}

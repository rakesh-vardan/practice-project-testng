package io.learn.enable;

import org.testng.annotations.Test;

public class EnableDisableTest {

    @Test(description = "FirstTestMethod")
    public void test1() {
        System.out.println("test1 method will be run");
    }

    @Test(enabled = false, description = "SecondTestMethod")
    public void test2() {
        System.out.println("test2 method will not be run - excluded");
    }

    @Test(description = "ThirdTestMethod")
    public void test3() {
        System.out.println("test3 method will be run");
    }
}

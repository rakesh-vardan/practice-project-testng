package io.learn.groups;

import org.testng.annotations.Test;

public class GroupTest2 {

    @Test(groups = "SmokeTest")
    public void testMethod() {
        System.out.println("Inside GroupTest2 testMethod");
    }

    @Test
    public void testMethod2() {
        System.out.println("Inside GroupTest2 testMethod2");
    }

    @Test(groups = "SmokeTest")
    public void testMethod3() {
        System.out.println("Inside GroupTest2 testMethod2");
    }

}

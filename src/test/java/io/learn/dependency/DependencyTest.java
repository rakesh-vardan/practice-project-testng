package io.learn.dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void firstMethod() {
//        System.out.println("In First method");
        Assert.assertEquals(1, 2);
    }

    //Will be ignored as the dependant test method is failed
    @Test(dependsOnMethods = "firstMethod")
    public void secondMethod() {
        System.out.println("In Second method");
    }

    @Test
    public void thirdMethod() {
        System.out.println("In Third method");
    }
}

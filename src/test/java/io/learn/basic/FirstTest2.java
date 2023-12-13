package io.learn.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FirstTest2 {

    public void firstMethod() {
        System.out.println("In First method");
    }

    public void secondMethod() {
        Assert.assertEquals(1, 1);
    }

    public void thirdMethod() {
        Assert.assertEquals(1, 2);
    }
}

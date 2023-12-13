package io.learn.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstMethod() {
        System.out.println("In First method");
    }

    @Test
    public void secondMethod() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void thirdMethod() {
        Assert.assertEquals(1, 2);
    }
}

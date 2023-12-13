package io.learn.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void test1() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, 2);
    }
}

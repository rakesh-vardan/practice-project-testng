package io.learn.timeout;

import org.testng.annotations.Test;

public class TimerTest {

    @Test(timeOut = 2)
    public void firstMethod() throws InterruptedException {
        Thread.sleep(5000L); //halts the execution for 5 seconds
        System.out.println("In First method");
    }

    @Test
    public void secondMethod() {
        System.out.println("In Second method");
    }

    @Test
    public void thirdMethod() {
        System.out.println("In Third method");
    }
}

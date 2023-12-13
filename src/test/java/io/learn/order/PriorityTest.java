package io.learn.order;

import org.testng.annotations.Test;

public class PriorityTest {

    /*
        - Default execution is in alphabetical order of method names
        - if used `priority` attribute, lowest value would be given priority
     */

    @Test(priority = 1)
    public void b() {
        System.out.println("In method b");
    }

    @Test(priority = 2)
    public void a() {
        System.out.println("In method a");
    }

    @Test(priority = 3)
    public void c() {
        System.out.println("In method c");
    }

}

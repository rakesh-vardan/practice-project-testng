package io.learn.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test
    @Parameters({"a", "b"})
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    @Test
    @Parameters({"a", "b"})
    public void mul(int a, int b) {
        int mul = a * b;
        System.out.println("Mul is: " + mul);
    }
}

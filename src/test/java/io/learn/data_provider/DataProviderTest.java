package io.learn.data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "mathData")
    public void testMe(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " +sum);
    }

    @DataProvider(name = "mathData")
    public Object[][] testData() {
        return new Object[][] {
                { 2, 4 },
                { 4, 6 },
                { 6, 8 }
        };
    }
}

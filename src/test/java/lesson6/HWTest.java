package test.java.lesson6;

import main.java.HW.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HWTest {

    @Test(dataProvider = "dp")
    public void test1(int arr[], int expected) {
        Task1 task1 = new Task1();
        int actual = task1.min(arr);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "dp")
    public Object[][] provider() {
        return new Object[][] {
                {new int[] {1,2,3,4}, 1},
                {new int[] {1,2,-3,4}, -3}
        };
    }
}

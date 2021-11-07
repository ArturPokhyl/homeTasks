package test.java.HWremember;

import main.java.homeTasks.lesson1.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HW_task5 {
    @Test
    public void Task5Test() {
        Task5 convertString = new Task5();
        String stringToConvert = "Hello world!!!";
        String actualString = convertString.reverse(stringToConvert);
        String expectedString = "!!!dlrow olleH";
        assertEquals(actualString, expectedString);
    }
}

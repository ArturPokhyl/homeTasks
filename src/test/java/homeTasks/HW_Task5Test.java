package test.java.homeTasks;

import main.java.homeTasks.lesson1.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HW_Task5Test {

@Test
    public void task5Task1(){
        Task5 task5 = new Task5();
        String TestingString = "Hello world!!!";
        String actualString = task5.reverse(TestingString);
        String expectedString = "!!!dlrow olleH";
        assertEquals(actualString, expectedString, "Strings aren't same");
        System.out.println("actual and expected strings are th same");
    }
}

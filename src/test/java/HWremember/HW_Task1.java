package test.java.HWremember;

import main.java.homeTasks.lesson1.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HW_Task1 {

    @Test(dataProvider = "HW_Task1DP")
        public void Task1Test(int number1, int number2, int number3, int expectedNumber){
        Task1 function = new Task1();
        int actualNumber = function.min(number1, number2, number3);
        assertEquals(actualNumber, expectedNumber, String.format("actual number '%d', expected number '%d'", actualNumber, expectedNumber));


    }

    @DataProvider(name = "HW_Task1DP")
     public Object[][] provider(){
        return new Object[][]{
                {-1, 0, 2, -1},
                {0, 20, 1, 0},
                {100, 8, 87, 8},
        };
    }


}

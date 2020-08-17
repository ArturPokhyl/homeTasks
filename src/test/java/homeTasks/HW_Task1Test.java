package test.java.homeTasks;
import  main.java.homeTasks.lesson1.Task1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HW_Task1Test {

    @Test(dataProvider = "dp")
    public void task1Test(int number1, int number2, int number3, int expectedResult){
        Task1 minNumer = new Task1();
        int actualResult = minNumer.min(number1, number2, number3);

     assertEquals(actualResult, expectedResult, "Expected min numer to be "+ expectedResult);
        System.out.println("Actual Result " + actualResult + " = " + "Expected Result " + expectedResult);
    }

@DataProvider(name = "dp")
public Object[][] provider(){
    return new Object[][]{
            {1, 5, 10, 1},
            {15, 5, 10, 5},
            {15, 5, 2, 2},
    };
}
}

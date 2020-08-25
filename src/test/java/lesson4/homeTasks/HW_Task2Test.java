package test.java.lesson4.homeTasks;

import main.java.homeTasks.lesson1.Task2;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HW_Task2Test {
    Task2 matrix;
    String result;

@BeforeTest
        public void setUp(){
            matrix = new Task2();
            result = matrix.nameMatrix();
}

@Parameters({"expectedRowAmount"})
@Test
    public void task2Task1(@Optional("6") int expectedRowAmount){

        int actualRowAmount = result.split("\n").length;
        assertEquals(actualRowAmount, expectedRowAmount);

    }

@Parameters({"expectedNameInRowAmount"})
@Test
    public void task2Test2(@Optional("11")int expectedNameInRowAmount) {
        String result = matrix.nameMatrix();
        String rows[] = result.split("\n");
        for (String row: rows){

            int actualNameInRowAmount = row.split( " ").length;
            assertEquals(expectedNameInRowAmount, actualNameInRowAmount);
        }
    }

}

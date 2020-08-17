package test.java.lesson6;

import main.java.lesson4.Cat;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestCat {
    Cat cat;
    String matrixRows;

    @AfterMethod
    public void tearDown() {
        System.out.println("- After Method");
    }

    @AfterClass
    public void afterAllMethods() {
        System.out.println("- After ALL METHODS");
    }

    @BeforeClass
    public void beforeAllMethods() {
        System.out.println("- Before All Methods");
        //some action
        cat = new Cat("Vasiliy");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("- Before Method");
        matrixRows = cat.getMatrix();
    }

    /*@BeforeGroups(dependsOnGroups = "getMatrix")
    public void beforeGetMatrixTest() {
        System.out.println(" - Before Group 'getMatrix'");
        matrixRows = cat.getMatrix();
    }*/
    //@Test(dependsOnGroups = "getMatrix", dependsOnMethods = "testGetMatrixShouldReturnRows")
    /*{
        {10, 10},
        {21, 21},
        {0, 20},
        {-1, 20}
    }*/

    @Test(dataProvider = "dp")
    public void testGetAge(int ageToChange, int expectedAge) {
        System.out.printf("TEST 1 with age to change = '%d' and expected age = '%d'\n", ageToChange, expectedAge);
        Cat cat = new Cat();
        cat.setAge(ageToChange);
        int actualAge = cat.getAge();
        assertEquals(actualAge, expectedAge, String.format("Expected cat age to be '%d'", expectedAge));
    }

    @Test(dependsOnMethods = "testGetMatrixShouldReturnRowsLength")
    public void testGetMatrixShouldReturnRows() {
        System.out.println("TEST 2");
        int expectedRowAmount = 5;
        int actualRowAmount = matrixRows.split("\n").length;
        assertEquals(actualRowAmount, expectedRowAmount);
    }

    @Test(groups = "getMatrix")
    public void testGetMatrixShouldReturnRowsLength() {
        System.out.println("TEST 3");
        String rows[] = matrixRows.split("\n");
        for (String row: rows) {
            int expectedRowLength = 5;
            int actualRowLength = row.split(" ").length;
            assertEquals(expectedRowLength, actualRowLength);
        }
    }

    @Parameters({"age", "salary"})
    @Test
    public void xmlParams(@Optional("10") int age, @Optional("500") int salary) {
        System.out.printf("First: '%d', second: '%d'", age, salary);
    }

    @DataProvider(name = "dp")
    public Object[][] provider() {
        return new Object[][] {
                {-1, 20},
                {0, 20},
                {1, 1},
                {10, 10},
                {21, 21},
                {22, 20}
        };
    }

}

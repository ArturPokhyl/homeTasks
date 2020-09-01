package test.java.homeTasks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.homeTaskPages.HW_NoteBooksPage;



public class HW_lesson10 extends HW_TestBaseSetup {
    HW_NoteBooksPage hw_noteBooksPage;

    @BeforeMethod
    public void pageFactory(){
     hw_noteBooksPage = new HW_NoteBooksPage(driver);
    }


    @Test
    public void filterTest() {

      hw_noteBooksPage.open();

    }
}
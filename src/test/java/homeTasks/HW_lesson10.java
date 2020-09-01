package test.java.homeTasks;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.homeTaskPages.HW_NoteBooksPage;

import java.util.List;

import static org.testng.Assert.assertTrue;


public class HW_lesson10 extends HW_TestBaseSetup {
    HW_NoteBooksPage hw_noteBooksPage;
    String producer = "Acer";

    @BeforeMethod
    public void pageFactory() {
        hw_noteBooksPage = new HW_NoteBooksPage(driver);
    }


    @Test(dataProvider = "dp")
    public void filterTest(String producer) {
        hw_noteBooksPage.open();
        hw_noteBooksPage.clickToProducer(producer);

        List<WebElement> searchResults = hw_noteBooksPage.getSearchResults();
        for (WebElement searchResult : searchResults) {
            String searchresultText = searchResult.getText().toLowerCase();
            assertTrue(searchresultText.contains(producer.toLowerCase()));

        }
    }
    @DataProvider(name = "dp")
    public Object[][] dp() {
        return new Object[][]{
                {"Acer"}, {"Apple"}, {"Asus"}, {"Dell"}, {"Dream Machines"}, {"HP"}, {"Huawei"}, {"Lenovo"}, {"MSI"}, {"Microsoft"}, {"Razer"}, {"Xiaomi"}, {"Alien"}, {"Chuwi"}, {"Compaq"}, {"Digma"}, {"Durabook"}, {"Epic"}, {"Fujitsu"}, {"Fujitsu-siemens"}, {"Gigabyte"}, {"Google"}, {"Jumper"}, {"Mediacom"}, {"Medion"}, {"Mixzo"}, {"NuVision"}, {"Odys"}, {"Panasonic"}, {"Porsche Design"}, {"Prestigio"}, {"RCA"}, {"Teclast"}, {"Toshiba"}, {"Vinga"}, {"Yepo"}
        };

    }
}
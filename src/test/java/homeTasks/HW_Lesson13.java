package test.java.homeTasks;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.homeTaskPages.HW_NoteBooksPage;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class HW_Lesson13 extends HW_TestBaseSetup{
    HW_NoteBooksPage hw_noteBooksPage;
    @Step("Start page factory")
    @BeforeMethod
    public void pageFactory() {
        hw_noteBooksPage = new HW_NoteBooksPage(driver);
    }

    @Step("Start Test producerFilterTest")
    @Test
    public void producerFilterTest() {
        hw_noteBooksPage.open();
        String producer = producer();
        hw_noteBooksPage.clickToProducer(producer);

        List<WebElement> searchResults = hw_noteBooksPage.getSearchResults();
        for (WebElement searchResult : searchResults) {
            String searchResultText = searchResult.getText().toLowerCase();
            assertTrue(searchResultText.contains(producer.toLowerCase()));
        }

    }

    public String producer(){
        String []arr = {"Acer",
        "Apple",
        "Asus",
        "Dell",
        "Dream Machines",
        "Huawei",
        "Lenovo",
        "MSI",
        "Microsoft",
        "Razer",
        "Xiaomi",
        "Alien",
        "Chuwi",
        "Compaq",
        "Digma",
        "Durabook",
        "Epic",
        "Fujitsu",
        "Fujitsu-siemens",
        "Gigabyte",
        "Google",
        "Jumper",
        "Mediacom",
        "Medion",
        "Mixzo",
        "NuVision",
        "Odys",
        "Panasonic",
        "Porsche Design",
        "Prestigio",
        "RCA",
        "Teclast",
        "Toshiba",
        "Vinga",
        "Yepo"};
        int min = 0;
        int rand = (int)(Math.random() * ((arr.length - 1) - min + 1 )) + min;
        String producer = arr[rand];
        System.out.println(producer);
       return producer;
    }


}


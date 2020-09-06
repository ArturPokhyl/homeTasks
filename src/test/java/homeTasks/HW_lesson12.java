package test.java.homeTasks;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.homeTaskPages.HW_NoteBooksPage;

import java.util.List;

import static org.testng.Assert.assertTrue;



public class HW_lesson12  extends HW_TestBaseSetup{
    HW_NoteBooksPage hw_noteBooksPage;
    Logger logger = LogManager.getLogger(HW_NoteBooksPage.class);


    @BeforeMethod
    public void pageFactory() {
        hw_noteBooksPage = new HW_NoteBooksPage(driver);
    }


    @Test
    public void producerFilterTest(String producer) {
        hw_noteBooksPage.open();
        hw_noteBooksPage.clickToProducer(producer);

        List<WebElement> searchResults = hw_noteBooksPage.getSearchResults();
        for (WebElement searchResult : searchResults) {
            String searchresultText = searchResult.getText().toLowerCase();
            assertTrue(searchresultText.contains(producer.toLowerCase()));
        }
        /*this.logger.trace("test result");
        this.logger.debug("test result");
        this.logger.info("test result");
        this.logger.warn("test result");
        this.logger.error("test result");
        this.logger.fatal("test result");*/
    }
    // @DataProvider(name = "dp")

}

package test.java.homeTaskPages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.java.utils.PropertyLoader;

import java.util.List;

public class HW_NoteBooksPage extends HW_BasePage{
    WebDriver driver;

    By searchTab = By.xpath("//div[@class='goods-tile']");


    public HW_NoteBooksPage(WebDriver driver){
        super(driver);
        /*this.logger.trace("Page init trace");
        this.logger.debug("Page init debug");
        this.logger.info("Page init info");
        this.logger.warn("Page init warn");
        this.logger.error("Page init error");
        this.logger.fatal("Page init fatal");*/
        this.driver = driver;

       }

       public HW_NoteBooksPage open(){
           /*this.logger.trace("Page open trace");
           this.logger.debug("Page open debug");
           this.logger.info("Page open info");
           this.logger.warn("Page open warn");
           this.logger.error("Page open error");
           this.logger.fatal("Page open fatal");*/
           driver.get(PropertyLoader.loadProperty("baseurl") + "notebooks/c80004/");
        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        return this;
       }

       public HW_NoteBooksPage clickToProducer(String producer){
        /*   this.logger.trace("Page clickToProducer trace");
           this.logger.debug("Page clickToProducer debug");
           this.logger.info("Page clickToProducer info");
           this.logger.warn("Page clickToProducer warn");
           this.logger.error("Page clickToProducer error");
           this.logger.fatal("Page clickToProducer fatal");*/
        By producerXpath = By.xpath("//label[@for = '" + producer + "']");
        wait.until(ExpectedConditions.elementToBeClickable(producerXpath));
        driver.findElement(producerXpath).click();
        return this;
       }

        public List<WebElement> getSearchResults() {
       /*     this.logger.trace("Page getSearchResults trace");
            this.logger.debug("Page getSearchResults debug");
            this.logger.info("Page getSearchResults info");
            this.logger.warn("Page getSearchResults warn");
            this.logger.error("Page getSearchResults error");
            this.logger.fatal("Page getSearchResults fatal");*/
        wait.until(ExpectedConditions.elementToBeClickable(searchTab));
        List<WebElement> searchResults = driver.findElements(searchTab);
        return searchResults;
    }




}

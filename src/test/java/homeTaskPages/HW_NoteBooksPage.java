package test.java.homeTaskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HW_NoteBooksPage extends HW_BasePage{
    WebDriver driver;
    By searchTab = By.xpath("//div[@class='goods-tile']");


    public HW_NoteBooksPage(WebDriver driver){
        super(driver);
        this.driver = driver;
       }

       public HW_NoteBooksPage open(){
        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        return this;
       }

       public HW_NoteBooksPage clickToProducer(String producer){
        By producerXpath = By.xpath("//label[@for = '" + producer + "']");
        wait.until(ExpectedConditions.elementToBeClickable(producerXpath));
        driver.findElement(producerXpath).click();
        return this;
       }

        public List<WebElement> getSearchResults() {
        wait.until(ExpectedConditions.elementToBeClickable(searchTab));
        List<WebElement> searchResults = driver.findElements(searchTab);
        return searchResults;
    }




}

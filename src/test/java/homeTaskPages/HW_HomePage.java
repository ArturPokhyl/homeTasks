package test.java.homeTaskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class HW_HomePage {
    WebDriver driver;
    WebDriverWait wait;
    By searchField = By.xpath("//input[@class='search-form__input ng-pristine ng-valid ng-touched']");
    By submitBtn = By.xpath("//button[@class = 'button button_color_green button_size_medium search-form__submit']");
    By searchResults = By.xpath("//li[@class=/catalog-grid__cell  catalog-grid__cell_type_slim']");

    public HW_HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }

    public HW_HomePage open(){
        driver.get("https://rozetka.com.ua/");
        return this;
    }
    public List<WebElement> searchResult(String searchWord) throws InterruptedException {
        Thread.sleep(2000);
        //wait.until(ExpectedConditions.elementToBeClickable(searchField));
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(searchWord);
        driver.findElement(submitBtn).click();
        List<WebElement> searchResult = driver.findElements(searchResults);
        return searchResult;
    }

}

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
    By searchField = By.xpath("//input[@name='search']");
    By submitBtn = By.xpath("//button[@class = 'button button_color_green button_size_medium search-form__submit']");
    By searchTab = By.xpath("//div[@class='goods-tile']");


    public HW_HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }

    public HW_HomePage open(){
        driver.get("https://rozetka.com.ua/");
        return this;
    }
    public HW_HomePage search(String searchWord) {
        wait.until(ExpectedConditions.presenceOfElementLocated(searchField));
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(searchWord);
        driver.findElement(submitBtn).click();
        return this;
    }

    public List<WebElement> getSearchResults() {
        wait.until(ExpectedConditions.elementToBeClickable(searchTab));
        List<WebElement> searchResults = driver.findElements(searchTab);
        return searchResults;
    }



}

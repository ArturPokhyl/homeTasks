package test.java.homeTaskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class HW_PathToPage {
    WebDriver driver;
    WebDriverWait wait;

    public HW_PathToPage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }
    public HW_PathToPage goTo(By path) throws InterruptedException {

    wait.until(ExpectedConditions.elementToBeClickable(path));
    driver.findElement(path).click();

    Thread.sleep(5000);
    return this;
    }
    public HW_PathToPage click(By element){
        driver.findElement(element).click();
        return this;
    }

}

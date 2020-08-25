package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class QaPage {

    WebDriver driver;
    WebDriverWait wait;
    By questionsBy = By.cssSelector("[name='slider-block-active']");

    public QaPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 500);
    }

    public List<WebElement> getQuestions(){
        List<WebElement> questions = driver.findElements(questionsBy);
        wait.until(ExpectedConditions.elementToBeClickable(questions.get(0)));
        return questions;
    }
}

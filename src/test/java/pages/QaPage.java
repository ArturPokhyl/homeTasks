package test.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.utils.PropertyLoader;

import java.util.List;

public class QaPage extends BasePage {
    WebDriver driver;
    By questionsBy = By.cssSelector("[name='slider-block-active']");

    public QaPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public QaPage open() {
        logger.info("QA page was opened");
        driver.get(PropertyLoader.loadProperty("baseurl") + "faq/");
        return this;
    }

    public List<WebElement> getQuestion() {
        logger.info("Get question");
        List<WebElement> questions = driver.findElements(questionsBy);
        wait.until(ExpectedConditions.elementToBeClickable(questions.get(0)));
        return questions;
    }
}

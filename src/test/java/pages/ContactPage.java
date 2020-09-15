package test.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.utils.PropertyLoader;

public class ContactPage extends BasePage {
    WebDriver driver;
    By qaBtnBy = By.cssSelector("[class='m-top'] a[href$='/faq/']");

    public ContactPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Contact page open")
    @Override
    public ContactPage open() {
        System.out.println("Contact page was opened");
        driver.get(PropertyLoader.loadProperty("baseurl") + "contacts/");
        return this;
    }

    public ContactPage clickQa() {
        logger.info("Click QA");
        wait.until(ExpectedConditions.presenceOfElementLocated(qaBtnBy));
        WebElement qaBtn = driver.findElement(qaBtnBy);
        wait.until(ExpectedConditions.elementToBeClickable(qaBtnBy));
        qaBtn.click();
        return this;
    }
}

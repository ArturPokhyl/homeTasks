package test.java.pages;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.java.utils.PropertyLoader;


public class HomePage extends BasePage {
    WebDriver driver;
    By contactBtnBy = By.cssSelector("[class='header-topline__links'] a[href$='/contacts/']");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Home page open")
    public HomePage open() {
        this.logger.trace("Trace");
        this.logger.debug("Debug");
        this.logger.info("Info");
        this.logger.warn("Warn");
        this.logger.error("Error");
        this.logger.fatal("Fatal");


        this.logger.info("Home page was opened");
        logger.debug("[\n" +
                "{\n" +
                "name: 'Vova'\n" +
                "age: 20\n" +
                "}\n" +
                "]\n");
        driver.get(PropertyLoader.loadProperty("baseurl"));
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public HomePage clickContacts() {
        logger.info("Click contact page");
        //System.out.println(1/0);
        WebElement contactBtn = driver.findElement(contactBtnBy);
        wait.until(ExpectedConditions.elementToBeClickable(contactBtnBy));
        contactBtn.click();
        return this;
    }
}

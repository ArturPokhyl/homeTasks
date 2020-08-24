package test.java.lesson8;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Waits {
    WebDriver driver;
    WebDriverWait wait1;
    WebDriverWait wait;
    By goodsListBy = By.cssSelector("[class='menu-categories menu-categories_type_main']");
    By wishBy = By.cssSelector("[class='header-actions__item header-actions__item_type_wish js-app-wishlist']");
    By registerBy = By.xpath("//a[contains(text(), 'авторизуйтесь')]");
    By authEmailBy = By.cssSelector("[id='auth_email']");
    By authPassBy = By.cssSelector("[id='auth_pass']");
    By enterBy = By.cssSelector("[class$='auth-modal__submit']");
    By errorMsgBy = By.cssSelector("[class^='error-message']");
    By requireTempPass = By.cssSelector("[class*='error-message'] [class*='link-dotted']");

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 10, 500);
    }

    @Test
    public void test1() throws InterruptedException {
        String email = "a@a.a";
        driver.get("https://rozetka.com.ua/");
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(wishBy));
        actions
                .moveToElement(driver.findElement(wishBy))
                //.click(driver.findElement(registerBy))
                .perform();
        //driver.findElement(registerBy).click();
        wait.until(ExpectedConditions.elementToBeClickable(registerBy));
        driver.findElement(wishBy).findElement(registerBy).click();
        wait.until(ExpectedConditions.and(
                ExpectedConditions.elementToBeClickable(authEmailBy),
                ExpectedConditions.elementToBeClickable(authPassBy),
                ExpectedConditions.elementToBeClickable(enterBy)
        ));
        driver.findElement(authEmailBy).sendKeys(email);
        driver.findElement(authPassBy).sendKeys("1");
        driver.findElement(enterBy).click();

        wait.until(ExpectedConditions.or(
                ExpectedConditions.presenceOfElementLocated(requireTempPass),
                ExpectedConditions.presenceOfElementLocated(errorMsgBy)
        ));

        if(driver.findElement(requireTempPass).isDisplayed()) {
            driver.findElement(requireTempPass).click();
            wait.until(ExpectedConditions.and(
                    ExpectedConditions.presenceOfElementLocated(errorMsgBy),
                    ExpectedConditions.invisibilityOfElementLocated(requireTempPass)
            ));
        }

        new WebDriverWait(driver, 15).until(new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return driver.findElement(errorMsgBy).getText().contains("Пользователь с логином");
            }
        });

        //new WebDriverWait(driver, 15).until(d -> d.findElement(errorMsgBy).getText().contains("Пользователь с логином"));



        String actualErrorMsg = driver.findElement(errorMsgBy).getText();
        String expectedErrorMsg = String.format("Пользователь с логином %s не зарегистрирован", email);
        assertEquals(actualErrorMsg, expectedErrorMsg);
        /*driver
                .findElement(goodsListBy)
                .click();*/
        /*driver.navigate().refresh();
        WebElement goodsList = driver.findElement(goodsListBy);
        goodsList.click();*/
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

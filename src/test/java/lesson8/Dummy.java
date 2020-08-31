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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Dummy {
    WebDriver driver;
    WebDriverWait wait;
    By wishBy = By.cssSelector("[class='header-actions__item header-actions__item_type_wish js-app-wishlist']");

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 10, 500);

        WebElement input = driver.findElement(By.id("asasadsad"));
        String actualColor = input.getCssValue("border-color"); //#fdsffsdf //rgb(255,255,255)
    }

    @Test
    public void test1() throws InterruptedException {
        String email = "a@a.a";
        driver.get("https://rozetka.com.ua/");
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(wishBy));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

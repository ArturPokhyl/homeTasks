package test.java.homeTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.homeTaskPages.HW_HomePage;

import java.util.concurrent.TimeUnit;

public class HW_Lesson9PO {
    WebDriver driver;
    HW_HomePage hw_homePage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        hw_homePage = new HW_HomePage(driver);
    }
    @Test
    public void iphoneTest() throws InterruptedException {
        hw_homePage.open().searchResult("iphone");
        Thread.sleep(5000);

    }

    @AfterMethod
    public void teadDown(){
        driver.quit();
    }



}

package test.java.tests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import test.java.pages.ContactPage;
import test.java.pages.HomePage;
import test.java.pages.QaPage;
import test.java.utils.Screenshot;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBaseSetup {
    WebDriver driver;

    @Parameters({ "browser" })
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--disable-notifications");
        FirefoxOptions ffOptions = new FirefoxOptions();
        //driver = new ChromeDriver(options);
        try {
            //driver = new RemoteWebDriver(new URL("http://ec2-18-188-168-196.us-east-2.compute.amazonaws.com:4444/wd/hub"), options);
            if(browser.equals("chrome")) {
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), optionsChrome);
            } else if(browser.equals("ff")) {
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), ffOptions);
            }

            //driver = new RemoteWebDriver(new URL("localhost:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown(ITestContext result) {
//        Screenshot screenshot = new Screenshot(driver);
//        screenshot.makeScreenshot(result);
        result.setAttribute("driver", driver);
        performedActions();
        saveScreenshot(result);
        driver.quit();
    }


    @Attachment
    public String performedActions() {
        return "Hello I am a string";
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(ITestContext testContext) {
        WebDriver driver = (WebDriver) testContext.getAttribute("driver");
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


}

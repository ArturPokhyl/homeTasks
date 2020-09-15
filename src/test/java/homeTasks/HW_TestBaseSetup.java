package test.java.homeTasks;

import com.beust.jcommander.Parameter;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
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
import test.java.utils.Screenshot;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HW_TestBaseSetup {
    WebDriver driver;
    String chrome = "chrome";
    String firefox = "firefox";
    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(ITestContext testContext, @Optional("chrome") String browser) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        if (browser.equals(chrome)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            try {
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
            testContext.setAttribute("driver",driver);

        } else if (browser.equals(firefox)){
            FirefoxOptions options = new FirefoxOptions();
            try {
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
            testContext.setAttribute("driver",driver);
        }

    }

    @AfterMethod
    public void teadDown(ITestContext result){
        Screenshot screenshot = new Screenshot(driver);
        //screenshot.makeScreenshot(result);
        saveScreenshot(result);
        driver.quit();
    }
@Step("Make Screenshot")
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(ITestContext testContext) {
        WebDriver driver = (WebDriver) testContext.getAttribute("driver");
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}

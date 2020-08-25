package test.java.homeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class HW_Lesson8Waits {
    WebDriver driver;
    WebDriverWait wait;
    By loginLink = By.xpath("//a[@class='header-topline__user-link link-dashed']");
    By registrationLink = By.xpath("//a[@class='auth-modal__register-link']");
    By inputSurname = By.xpath("//input[@formcontrolname='surname']");
    By inputName = By.xpath("//input[@formcontrolname='name']");
    By inputUsername = By.xpath("//input[@formcontrolname='username']");
    By inputPassword = By.xpath("//input[@formcontrolname='password']");
    By submitBtn = By.xpath("//button[@class='button button_size_large button_color_green auth-modal__submit']");




    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 10, 500);
    }

    @Test
    public void allFieldsEmptyTest()  {
        String expectedSurnameField = "rgb(248, 65, 71)";
        String expectedNameField = "rgb(248, 65, 71)";
        String expectedUsernameField = "rgb(248, 65, 71)";
        String expectedPasswordField = "rgb(248, 65, 71)";


        driver.get("https://rozetka.com.ua/");
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        driver.findElement(loginLink).click();
        wait.until(ExpectedConditions.elementToBeClickable(registrationLink));
        driver.findElement(registrationLink).click();
        wait.until(ExpectedConditions.and(
                ExpectedConditions.elementToBeClickable(inputSurname),
                ExpectedConditions.elementToBeClickable(inputName),
                ExpectedConditions.elementToBeClickable(inputUsername),
                ExpectedConditions.elementToBeClickable(inputPassword)));
        driver.findElement(inputSurname).click();
        driver.findElement(inputName).click();
        driver.findElement(inputUsername).click();
        driver.findElement(inputPassword).click();
        driver.findElement(submitBtn).click();
        String actualSurnameField = driver.findElement(inputSurname).getCssValue("border-color");
        String actualNameField = driver.findElement(inputName).getCssValue("border-color");
        String actualUsernameField = driver.findElement(inputUsername).getCssValue("border-color");
        String actualPasswordField = driver.findElement(inputPassword).getCssValue("border-color");
        assertEquals(actualSurnameField, expectedSurnameField);
        System.out.println("actualSurnameField: " + actualSurnameField + " expectedSurnameField: " + expectedSurnameField);
        assertEquals(actualNameField, expectedNameField);
        System.out.println("actualNameField: " + actualNameField + " expectedNameField: " + expectedNameField);
        assertEquals(actualUsernameField, expectedUsernameField);
        System.out.println("actualUsernameField: " + actualUsernameField + " expectedUsernameField: " + expectedUsernameField);
        assertEquals(actualPasswordField, expectedPasswordField);
        System.out.println("actualPasswordField: " + actualPasswordField + " expectedPasswordField: " + expectedPasswordField);
    }

        @Test
        public void twoFieldsEmptyTest(){

            String expectedSurnameField = "rgb(210, 210, 210)";
            String expectedNameField = "rgb(210, 210, 210)";
            String expectedUsernameField = "rgb(248, 65, 71)";
            String expectedPasswordField = "rgb(248, 65, 71)";

            driver.get("https://rozetka.com.ua/");
            wait.until(ExpectedConditions.elementToBeClickable(loginLink));
            driver.findElement(loginLink).click();
            wait.until(ExpectedConditions.elementToBeClickable(registrationLink));
            driver.findElement(registrationLink).click();
            wait.until(ExpectedConditions.and(
                    ExpectedConditions.elementToBeClickable(inputSurname),
                    ExpectedConditions.elementToBeClickable(inputName),
                    ExpectedConditions.elementToBeClickable(inputUsername),
                    ExpectedConditions.elementToBeClickable(inputPassword)));
            driver.findElement(inputSurname).sendKeys("тестоваяФамилия");
            driver.findElement(inputName).sendKeys("ТестовоеИмя");
            driver.findElement(inputUsername).click();
            driver.findElement(inputPassword).click();
            driver.findElement(submitBtn).click();
            String actualSurnameField = driver.findElement(inputSurname).getCssValue("border-color");
            String actualNameField = driver.findElement(inputName).getCssValue("border-color");
            String actualUsernameField = driver.findElement(inputUsername).getCssValue("border-color");
            String actualPasswordField = driver.findElement(inputPassword).getCssValue("border-color");
            assertEquals(actualSurnameField, expectedSurnameField);
            System.out.println("actualSurnameField: " + actualSurnameField + " expectedSurnameField: " + expectedSurnameField);
            assertEquals(actualNameField, expectedNameField);
            System.out.println("actualNameField: " + actualNameField + " expectedNameField: " + expectedNameField);
            assertEquals(actualUsernameField, expectedUsernameField);
            System.out.println("actualUsernameField: " + actualUsernameField + " expectedUsernameField: " + expectedUsernameField);
            assertEquals(actualPasswordField, expectedPasswordField);
            System.out.println("actualPasswordField: " + actualPasswordField + " expectedPasswordField: " + expectedPasswordField);

        }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

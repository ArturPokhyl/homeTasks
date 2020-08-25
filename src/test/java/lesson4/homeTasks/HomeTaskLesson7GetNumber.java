package test.java.lesson4.homeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HomeTaskLesson7GetNumber {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    options.setExperimentalOption("useAutomationExtension", false);
    WebDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://rozetka.com.ua/");
        By numberLocator = By.xpath("//button[@class='header-phones__button']");

        String phoneNumber = driver.findElement(numberLocator).getText().replaceAll("[( )-]", "");
        System.out.println(phoneNumber);
        driver.quit();


}
}
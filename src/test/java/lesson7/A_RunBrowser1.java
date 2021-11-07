package test.java.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A_RunBrowser1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension",false);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://allo.ua/ru/products/notebooks/");

        By city = By.xpath("//div[@class='geo-label js-geo-label']");
        By city2 = By.cssSelector("div[class='geo-label js-geo-label']");
        Thread.sleep(5000);
        System.out.println(driver.findElement(city).getText());
        System.out.println(driver.findElement(city2).getText());

        WebElement producerInput = driver.findElement(By.xpath("//div[@class='filter__container']//input[@class='input'][1]"));
        producerInput.sendKeys("Apple");
        Thread.sleep(1000);
        producerInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        producerInput.sendKeys(Keys.DELETE);
        Thread.sleep(5000);


        driver.quit();

    }
}

package main.java.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class A_RunWebDriver {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");
        //options.addArguments("window-size=500,1200");
        //options.addArguments("--incognito");
        //options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        By city = By.xpath("//a[@class='header-cities__link link-dashed']");
        By city2 = By.cssSelector("a[class='header-cities__link link-dashed']");
        By city3 = By.partialLinkText("Київ");
            Thread.sleep(5000);


        String cityValue = driver.findElement(city).getText();
        /*WebElement cityEl = driver.findElement(city);
        String  cityValue = cityEl.getText();*/
        //String cityValue = driver.findElement(By.xpath("//a[@class='header-cities__link link-dashed']")).getText();
        System.out.println(cityValue);

        WebElement producerInput = driver.findElement(By.cssSelector("*[data-filter-name='producer'] input[name='searchline']"));
        WebElement firstGood = driver.findElement(By.xpath("(//a[@class = 'goods-tile__picture'])[1]"));
        producerInput.sendKeys("Apple");
            Thread.sleep(3000);


        //producerInput.clear();
        producerInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        producerInput.sendKeys(Keys.DELETE);

        Actions builder = new Actions(driver);
        builder
                .keyDown(Keys.CONTROL)
                .click(firstGood)
                .keyUp(Keys.CONTROL)
                .build().perform();

        for (String window: driver.getWindowHandles()) {
            driver.switchTo().window(window);

        }

        Thread.sleep(5000);

        driver.quit();
    }
}

package test.java.homeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.homeTaskPages.HW_HomePage;
import test.java.homeTaskPages.HW_PathToPage;
import test.java.homeTaskPages.HW_TestBaseSetup;

import java.util.concurrent.TimeUnit;


public class HW_lesson10 extends HW_TestBaseSetup {
    WebDriver driver;
    HW_HomePage hw_homePage;
    HW_PathToPage hw_pathToPage;

    /* By category = By.xpath("//ul[@class='menu-categories menu-categories_type_main']//a[contains(text(), 'Ноутбуки и компьютеры')]");
     By subCategory = By.xpath("//div[@class='tile-cats']//a[contains(text(), 'Ноутбуки')]");
 */
    /*@BeforeMethod
    public void pageFactory() {
        hw_homePage = new HW_HomePage(driver);
        hw_pathToPage = new HW_PathToPage(driver);
    }*/
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        hw_homePage = new HW_HomePage(driver);
        hw_pathToPage = new HW_PathToPage(driver);
    }



    @Test
    public void goToPage() throws InterruptedException {
        By categoryBtn = By.xpath("//button[@class='menu-toggler']");
        By notebookAndPkCategory = By.xpath("//ul[@class='menu-categories menu-categories_type_main']//a[contains(text(), 'Ноутбуки и компьютеры')]");
        By notebookSubCategory = By.xpath("//div[@class='tile-cats']//a[contains(text(), 'Ноутбуки')]");

        hw_homePage.open();
        hw_pathToPage.goTo(notebookAndPkCategory);
        hw_pathToPage.goTo(notebookSubCategory);

    }
    @AfterMethod
    public void teadDown(){
        driver.quit();
    }
}
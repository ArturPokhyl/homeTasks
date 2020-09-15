package test.java.tests;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.ContactPage;
import test.java.pages.HomePage;
import test.java.pages.QaPage;

import java.util.concurrent.TimeUnit;
@Epic("Epic first")
@Feature("Second feature")
public class DummyTest2 extends TestBaseSetup{
    HomePage homePage;
    ContactPage contactPage;

    @BeforeMethod
    public void pageFactory() {
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
    }

    @Description("Some detailed test description")
    @Story("Story add to the card  AAA-1")
    @Test
    public void test1(){
        homePage.open();
        contactPage.open();
    }

    @Link("hhtps://google.com")
    @Description("Some detailed test description")
    @Story("Story delete from the cart AAA-2")
    @TmsLinks({
            @TmsLink("AAA-1"),
            @TmsLink("AAA-2")
    })
    @Issues({
            @Issue("JIRA-1"),
            @Issue("JIRA-2")
    })
    @Test
    public void test2(){
        contactPage.open();
    }

}

package test.java.tests;

import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.pages.ContactPage;
import test.java.pages.HomePage;
import test.java.pages.QaPage;

import static org.testng.Assert.assertTrue;

@Epic("Epic first")
@Feature("First feature")
public class PoDummy extends TestBaseSetup{
    String expectedFontColor = "rgba(62, 119, 170, 1)";
    HomePage homePage;
    ContactPage contactPage;
    QaPage qaPage;

    @BeforeMethod
    public void pageFactory() {
        homePage = new HomePage(driver);
        contactPage = new ContactPage(driver);
        qaPage = new QaPage(driver);
    }


    @Story("BBB-1")
    @Stories({
           @Story("BBB-1-1"),
           @Story("BBB-1-2")
    })
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test1() {

//        int i = 1;
//        String a = Integer.toString(i); // "1"

        homePage
                .open();
                //.clickContacts();
        /*homePage
                .open()
                .clickContacts();
        contactPage.clickQa();
        List<WebElement> questions = qaPage.getQuestion();
        for (WebElement question : questions) {
            String actualFontColor = question.getCssValue("color");
            assertEquals(
                    actualFontColor,
                    expectedFontColor,
                    String.format("Expected blue color for questuion '%s'", question.getText())
            );
        }*/
        assertTrue(false);
    }

    public Object[][] dp() {
        return new Object[][]{
                {"Acer" }, {"Apple" }, {"Asus" }, {"Dell" }, {"Dream Machines" }, {"HP" }, {"Huawei" }, {"Lenovo" }, {"MSI" }, {"Microsoft" }, {"Razer" }, {"Xiaomi" }, {"Alien" }, {"Chuwi" }, {"Compaq" }, {"Digma" }, {"Durabook" }, {"Epic" }, {"Fujitsu" }, {"Fujitsu-siemens" }, {"Gigabyte" }, {"Google" }, {"Jumper" }, {"Mediacom" }, {"Medion" }, {"Mixzo" }, {"NuVision" }, {"Odys" }, {"Panasonic" }, {"Porsche Design" }, {"Prestigio" }, {"RCA" }, {"Teclast" }, {"Toshiba" }, {"Vinga" }, {"Yepo" }
        };
    }
}

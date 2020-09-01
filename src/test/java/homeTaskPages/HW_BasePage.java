package test.java.homeTaskPages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.pages.BasePage;

public abstract class HW_BasePage {
    protected WebDriverWait wait;
    Logger logger = LogManager.getLogger(this.getClass().getName());

    public HW_BasePage(WebDriver driver) {
        wait = new WebDriverWait(driver, 10, 500);
    }

    /*public abstract HW_BasePage open();*/
}

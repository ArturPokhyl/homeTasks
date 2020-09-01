package test.java.homeTaskPages;

import org.openqa.selenium.WebDriver;

public class HW_NoteBooksPage extends HW_BasePage{
    WebDriver driver;


    public HW_NoteBooksPage(WebDriver driver){
        super(driver);
        this.driver = driver;
       }

       public HW_NoteBooksPage open(){
        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        return this;
       }





}

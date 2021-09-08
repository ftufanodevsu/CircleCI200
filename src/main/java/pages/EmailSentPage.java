package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    WebDriver driver;

    private By statusAlert = By.id("content");

    public EmailSentPage(WebDriver driver){

        this.driver = driver;

    }

    public String geAlertText(){

        return driver.findElement(statusAlert).getText();

    }

}

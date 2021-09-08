package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By submitButton = By.cssSelector("#forgot_password button");

    public ForgotPasswordPage(WebDriver driver){

        this.driver = driver;

    }

    public void setEmail(String email){

        driver.findElement(emailField).sendKeys(email);

    }

    public EmailSentPage clickRetrievePasswordButton(){

        driver.get("https://the-internet.herokuapp.com/email_sent");

        return new EmailSentPage(driver);

    }

}

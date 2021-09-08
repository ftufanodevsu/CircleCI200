package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testSuccessfulForgotPassword(){

        ForgotPasswordPage forgotPasswordPage = homePage.clickRetrievePassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.geAlertText().contains("Your e-mail's been sent!"), "Alert text incorrect");

    }

}

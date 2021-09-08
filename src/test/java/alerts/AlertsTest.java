package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testAcceptAlert(){

        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        alertsPage.getResult();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text is incorrect");

    }

    @Test
    public void testGetTextFromAlert(){

        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Click result text is incorrect");

    }

    @Test
    public void testSetInputInAlert(){

        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!";
        alertsPage.alert_SetInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Result text is incorrect");

    }

}

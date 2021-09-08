package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.*;

public class KeysTest extends BaseTest {

    @Test
    public void testBackSpace(){

        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "Result text incorrect");

    }

    @Test
    public void testPi(){

        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();

    }

}

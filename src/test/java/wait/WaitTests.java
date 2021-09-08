package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.*;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden(){

        var loadingPage = homePage.clickDynamicLoading1();
        loadingPage.clickStart();
        String text = loadingPage.getLoadedText();
        assertEquals(text, "Hello World!", "No Hello World!");

    }

    @Test
    public void testWaitUntilPresence(){

        var loadingPage = homePage.clickDynamicLoading2();
        loadingPage.clickStart();
        String text = loadingPage.getLoadedText();
        assertEquals(text, "Hello World!", "No Hello World!");

    }

}

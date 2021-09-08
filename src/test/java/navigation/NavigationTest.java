package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigator(){

        homePage.clickDynamicLoading1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://caelumdev.com");

    }

    @Test
    public void testSwitchTab(){

        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");

    }

}

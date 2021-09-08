package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testGetTextFromContextAlert(){

        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickArea();
        String text = contextMenuPage.alert_getText();
        assertEquals(text, "You selected a context menu", "Incorrect context alert text");

    }

}

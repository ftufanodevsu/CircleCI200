package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;

import static org.testng.Assert.*;

public class NestedFramesTest extends BaseTest {

    @Test
    public void testFramesTitles(){

        var nestedFramesPage = homePage.clickNestedFrames();
        String topLeftText = nestedFramesPage.getTextFromTopLeftArea();
        String bottomText = nestedFramesPage.getTextFromBottomArea();
        assertEquals(topLeftText, "LEFT", "Not LEFT");
        assertEquals(bottomText, "BOTTOM", "Not BOTTOM");

    }

}

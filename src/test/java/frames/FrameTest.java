package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTest extends BaseTest {

    @Test
    public void testWysiwyg(){

        var wysiwygPage = homePage.clickWysiwygEditor();
        wysiwygPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "World";
        wysiwygPage.setTextArea(text1);
        wysiwygPage.decreaseIndention();
        wysiwygPage.setTextArea(text2);
        assertEquals(wysiwygPage.getTextFormEditor(), text1+text2, "Incorrect editor text");

    }

}

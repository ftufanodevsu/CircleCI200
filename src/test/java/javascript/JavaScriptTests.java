package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testScrollToTable(){

        homePage.clickLargeAndDeepDOM().scrollToTable();

    }

    @Test
    public void testScrollFifthParagraph(){

        homePage.clickInfiniteScroll().scrollToParagraph(5);

    }

}

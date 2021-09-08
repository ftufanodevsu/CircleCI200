package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testMoveSlider(){

        var sliderPage = homePage.clickHorizontalSlider();

        for (int i = 1; i <= 8; i++){

            sliderPage.moveSlider();

        }

        assertEquals(sliderPage.getResultText(),"4", "Is not in the 4th level");

    }

}

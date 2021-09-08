package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption(){

        var dropdownPage = homePage.clickDropdown();

        dropdownPage.setSelectMultipleAttribute();
        String option1 = "Option 1";
        String option2 = "Option 2";
        dropdownPage.selectDropdown(option1);
        dropdownPage.selectDropdown(option2);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 2, "Incorrect # of selections");
        assertTrue(selectedOptions.contains(option1), "Option 1 not selected");
        assertTrue(selectedOptions.contains(option2), "Option 2 not selected");

    }

}

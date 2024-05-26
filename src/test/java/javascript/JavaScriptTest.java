package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testMultipleSelection() {
        var dropDownPage = homePage.clickDropdown();
        dropDownPage.setMultipleSelection();
        String option1 = "Option 1";
        String option2 = "Option 2";
        dropDownPage.selectFromDropdown(option1);
        dropDownPage.selectFromDropdown(option2);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 2, "Incorrect number of selections");
    }
}

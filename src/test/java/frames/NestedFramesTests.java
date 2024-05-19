package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTest {

    @Test
    public void testNestedFrames() {
        var nestedFramesPage = homePage.clickNestedFrames();

        String leftFrameText = "LEFT";
        String bottomFrameText = "BOTTOM";

        assertEquals(nestedFramesPage.getTextFromLeftFrame(), leftFrameText, "Text from left frame is incorrect.");
        assertEquals(nestedFramesPage.getTextFromBottomFrame(), bottomFrameText, "Text from bottom frame is incorrect.");
    }
}

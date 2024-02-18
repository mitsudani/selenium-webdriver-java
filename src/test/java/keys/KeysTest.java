package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTest {

    @Test
    public void testBackspace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }

    @Test
    public void testHorizontalSlider() {
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.moveSlider();
        assertEquals(sliderPage.getResult(), "4");
    }
}

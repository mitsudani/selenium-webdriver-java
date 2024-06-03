package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertTrue;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManage().goBack();
        getWindowManage().refreshPage();
        getWindowManage().goForward();
        getWindowManage().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManage().switchToTab("New Window");
    }

    @Test
    public void testAssertStartButtonInNewTab() {
        var dynamicLoadingPage = homePage.clickDynamicLoading().openExample2PageInNewTab();
        getWindowManage().switchToTab(1);
        assertTrue(dynamicLoadingPage.startButtonIsVisible());
    }

}

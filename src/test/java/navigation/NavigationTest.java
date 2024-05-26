package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

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
}

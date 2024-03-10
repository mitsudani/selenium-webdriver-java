package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.triggerContextMenuAlert();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(text, "You selected a context menu", "Result text incorrect.");
    }
}

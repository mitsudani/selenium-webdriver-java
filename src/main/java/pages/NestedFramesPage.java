package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;

    private String topFrameId = "frame-top";

    private String leftFrameId = "frame-left";

    private String bottomFrameId = "frame-bottom";

    private By leftFrameBody = By.tagName("body");

    private By bottomFrameBody = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToTopFrame() { driver.switchTo().frame(topFrameId); }

    private void switchToLeftFrame() {
        driver.switchTo().frame(leftFrameId);
    }

    private void switchToBottomFrame() {
        driver.switchTo().frame(bottomFrameId);
    }

    public String getTextFromLeftFrame() {
        switchToTopFrame();
        switchToLeftFrame();
        String text = driver.findElement(leftFrameBody).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getTextFromBottomFrame() {
        switchToBottomFrame();
        String text = driver.findElement(bottomFrameBody).getText();
        driver.switchTo().defaultContent();
        return text;
    }
}

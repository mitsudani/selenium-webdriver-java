package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());

        // Print out the window handles
        System.out.println("Windows handles: ");
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switch to window: " + window);
            driver.switchTo().window(window);
            System.out.println("Current window title: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public void switchToTab(int index) {
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowStrings = new ArrayList<>(windowHandles);
        String reqWindow = windowStrings.get(index);
        driver.switchTo().window(reqWindow);
    }
}

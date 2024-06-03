package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;

    private By linkExample1 = By.linkText("Example 1: Element on page that is hidden");

    private By linkExample2 = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(linkExample2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page openExample2PageInNewTab() {
        Actions action=new Actions(driver);
        action.keyDown(Keys.CONTROL).build().perform();
        driver.findElement(linkExample2).click();
        return new DynamicLoadingExample2Page(driver);
    }
}

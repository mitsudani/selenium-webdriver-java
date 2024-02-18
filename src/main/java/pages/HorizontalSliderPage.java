package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By horizontalSlider = By.tagName("input");

    private By resultText = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider() {
        WebElement slider = driver.findElement(horizontalSlider);
        Actions actions = new Actions(driver);
        actions.moveToElement(slider).perform();
        int sliderMoves = 1;
        while (sliderMoves <= 8){
            slider.sendKeys(Keys.ARROW_RIGHT);
            sliderMoves++;
        }
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }

}

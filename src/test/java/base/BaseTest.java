package base;

// import org.openqa.selenium.By;
// import org.openqa.selenium.Dimension;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

///////// These comments are just examples for practice, this type of code must be in the main folder /////////

//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(375, 812));
//        System.out.println(driver.getTitle());

//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();

//        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContentLink.click();
//
//        WebElement menuElementLink = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElementLink.click();
//
//        List<WebElement> links = driver.findElements(By.xpath("//ul//li"));
//        System.out.println(links.size());

        driver.quit();
    }

    public static void main(String args[]) {
        BaseTest test = new BaseTest();
        test.setUp();
    }
}

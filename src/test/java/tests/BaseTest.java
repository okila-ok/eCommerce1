package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;

    public WebDriver getDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        getDriver().get("https://askomdch.com/");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
private WebDriver driver;

private WebDriverWait wait2;
private WebDriverWait wait5;

private WebDriverWait wait10;

public BasePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

protected WebDriver getDriver() {
    return driver;
}

protected WebDriverWait getWait2() {
    if (wait2 == null) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(2));
    }
    return wait2;
}

protected WebDriverWait getWait5() {
    if(wait5 == null) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(5));
    }
    return wait5;
}

protected WebDriverWait getWait10() {
    if(wait10 == null) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }
    return wait10;
}
}

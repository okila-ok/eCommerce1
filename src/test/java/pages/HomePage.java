package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text() = 'Featured Products']")
    private WebElement featuredProductsName;

    @FindBy(xpath = "//h3[text() = '25% OFF On all products']")
    private WebElement discountText;

    @FindBy(xpath = "//div[@id='ast-desktop-header']//ul//li")
    private List<WebElement> mainMenuItems;

    @FindBy(xpath = "//div[@id = 'ast-desktop-header']")
    WebElement desktopHeader;

    public String getFeaturedProductsName() {
        return featuredProductsName.getText();
    }

    public String getDiscountText() {
        return discountText.getText();
    }

    public int getMainMenuItemNumber() {
        return mainMenuItems.size();
    }

    public StorePage clickStoreLinkOnHomePage() {
        getWait5().until(ExpectedConditions.visibilityOf(desktopHeader))
                .findElement(By.xpath("//a[@href = 'https://askomdch.com/store/']")).click();
        return new StorePage(getDriver());
    }
}

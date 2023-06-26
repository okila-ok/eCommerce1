package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[text() = 'Featured Products']")
    WebElement featuredProductsName;

    @FindBy(xpath = "//h3[text() = '25% OFF On all products']")
    WebElement discountText;

    public String getFeaturedProductsName() {
        return featuredProductsName.getText();
    }

    public String getDiscountText() {
        return discountText.getText();
    }

}

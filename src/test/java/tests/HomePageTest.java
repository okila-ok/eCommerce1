package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void testVerifyFeaturedProductsName() {
        String expectedResult = "Featured Products";

        HomePage homePage = new HomePage(getDriver());
        String actualResult = homePage.getFeaturedProductsName();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testVerifyDiscountText() {
        String expectedResult = "25% OFF On all products";

        String actualResult = new HomePage(getDriver())
                .getDiscountText();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testVerifyMainMenuItemNumber() {
        int expectedResult = 8;

        int actualResult = new HomePage(getDriver())
                .getMainMenuItemNumber();

        Assert.assertEquals(actualResult, expectedResult);
    }
}

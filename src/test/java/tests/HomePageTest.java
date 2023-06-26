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

}

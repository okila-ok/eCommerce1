package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;
import pages.StorePage;

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

    @Test
    public void testVerifySearchResultsNamePresent() {
        String expectedResult = "Shoes";

        HomePage homePage = new HomePage(getDriver());
        StorePage storePage = homePage.clickStoreLinkOnHomePage();
        storePage.enterValueIntoSearchTextField(expectedResult);
        SearchResultPage searchResultPage = storePage.clickSearchButton();
        String actualResult = searchResultPage.getSearchResultText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}

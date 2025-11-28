package Enterprises;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AmazonTest extends HRMSBaseClass {

    @Test(description = "Amazon Product Price and Ratings")
    public void Price() throws InterruptedException {
        Amazon.searchBar();
        Amazon.searchButton();
        Amazon.clickOnMobile();
        Amazon.productPrice();
        Amazon.productRatings();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();   // closes entire browser
    }

    @Test(description = "Flipkart Price Ratings and Reviews")
    public void Ratings() throws InterruptedException {
        Amazon.flipkartsearchbar();
        Amazon.flipkartClickOnMobiles();
        Amazon.flipkartProductPrice();
        Amazon.flipkartProductRatingsAndReviews();
    }

    @AfterMethod
    public void closeBrowser1() {
        driver.quit();   // closes entire browser
    }

    @Test(description = "Test")
    public void RatingsTest() {
    }
}

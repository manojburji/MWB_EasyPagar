package Enterprises;

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

    @Test(description = "Flipkart Price Ratings and Reviews")
    public void Ratings() throws InterruptedException {
        Amazon.flipkartsearchbar();
        Amazon.flipkartClickOnMobiles();
        Amazon.flipkartProductPrice();
        Amazon.flipkartProductRatingsAndReviews();
    }

    @Test(description = "Test")
    public void RatingsTest() {
    }
}

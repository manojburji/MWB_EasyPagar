package EnterprisesPOM;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

    WebDriver driver;
    private WebDriverWait wait;

    public Amazon(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    //Amazon
    @FindBy(xpath = "//input[contains(@aria-label,'Search Amazon.in')]")
    WebElement SearchBar;

    @FindBy(id = "nav-search-submit-button")
    WebElement SearchButton;

    @FindBy(xpath = "//span[text()='Apple iPhone 15 (128 GB) - Black']")
    WebElement ClickOnMobile;

    @FindBy(xpath = "//span[@id=\"productTitle\"]//ancestor::div[@id=\"centerCol\"]//span[contains(@class,'a-price-whole')]")
    WebElement ProductPrice;

    @FindBy(xpath = "//span[@id=\"productTitle\"]//ancestor::div[@id=\"centerCol\"]//div[@id=\"averageCustomerReviews_feature_div\"]")
    WebElement ProductRatings;

    //Filpkart
    @FindBy(xpath = "//input[@class=\"Pke_EE\"]")
    WebElement FlipkartSearchbar;

    @FindBy(xpath = "//div[text()='Apple iPhone 16 (Black, 128 GB)']")
    WebElement FlipkartClickOnMobiles;

    @FindBy(xpath = "//span[@class=\"VU-ZEz\"]//ancestor::div[@class=\"DOjaWF gdgoEp col-8-12\"]//div[contains(@class,'Nx9bqj ')]")
    WebElement FipkartProductPrice;

    @FindBy(xpath = "//span[@class=\"VU-ZEz\"]//ancestor::div[@class=\"DOjaWF gdgoEp col-8-12\"]//div[contains(@class,'_5OesEi HDvrBb')]")
    WebElement FlipkartRatingsAndReview;

    public void searchBar() {
        SearchBar.sendKeys("iPhone");
    }

    public void searchButton() {
        SearchButton.click();
    }

    public void clickOnMobile() throws InterruptedException {
        String mainWindowID = driver.getWindowHandle();  // store main window handle

        ClickOnMobile.click();
        Thread.sleep(2000);

        Set<String> allWindowIDs = driver.getWindowHandles();

        for (String id : allWindowIDs) {
            if (!id.equals(mainWindowID)) {  // switch to the new window
                driver.switchTo().window(id);
                break;
            }
        }
    }

    public void productPrice() {
        String price = ProductPrice.getText();
        System.out.println("Product Price: " + price);
    }

    public void productRatings() {
        String ratings = ProductRatings.getText();
        System.out.println("Product Ratings: " + ratings);
    }

    //Flipkart
    public void flipkartsearchbar() {
        FlipkartSearchbar.sendKeys("iPhone", Keys.ENTER);
    }

    public void flipkartClickOnMobiles() throws InterruptedException {
        String mainWindowID = driver.getWindowHandle();

        FlipkartClickOnMobiles.click();
        Thread.sleep(2000);

        Set<String> allWindowIDs = driver.getWindowHandles();

        for (String id : allWindowIDs) {
            if (!id.equals(mainWindowID)) {
                driver.switchTo().window(id);
                break;
            }
        }
    }

    public void flipkartProductPrice() {
        String productprice = FipkartProductPrice.getText();
        System.out.println("Product Price: " + productprice);
    }

    public void flipkartProductRatingsAndReviews() {
        String productRatingsReviews = FlipkartRatingsAndReview.getText();
        System.out.println("Product Ratings and Reviews: " + productRatingsReviews);
    }

}

package Enterprises;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import EnterprisesPOM.Amazon;
import EnterprisesPOM.Holiday;
import EnterprisesPOM.LeavePolicy;
import EnterprisesPOM.LoginEnterprises;

public class HRMSBaseClass {

    public WebDriver driver;

    public HRMSBaseClass() {
        // Default constructor required if you're extending this class
    }

    public HRMSBaseClass(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  Thread.sleep(2000);
        Login = new LoginEnterprises(driver);
        Homepage = new Homepage(driver);
        Holiday = new Holiday(driver);
        LeavePolicy = new LeavePolicy(driver);
        Amazon = new Amazon(driver);

    }

    public LoginEnterprises Login;
    public Homepage Homepage;
    public Holiday Holiday;
    public LeavePolicy LeavePolicy;
    public Amazon Amazon;

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

//    @BeforeMethod
//    public void login() throws InterruptedException
//    {
//       Login.userNumber("7975666611");
//       Login.password("Test@123");
//       Login.loginButton();
//       
//    }
}

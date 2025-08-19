package EnterprisesPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginEnterprises
{
public WebDriver driver;
	
	public LoginEnterprises(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement UserNumber;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	WebElement RememberMe;
	
	@FindBy(css = "[type=\"submit\"]")
	WebElement LoginButton;
	
	
	
	public void userNumber(String Username)
	{
		UserNumber.sendKeys("7975666611");
	}
	
	public void password(String password)
	{
		Password.sendKeys("Test@123");
	}
	
	public void rememberMeCheckBox()
	{
		RememberMe.click();
	}
	
	public void loginButton() throws InterruptedException
	{
		LoginButton.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[type=\"submit\"]"))));
	}
	
}

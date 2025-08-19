package Enterprises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Homepage 
	{
		WebDriver driver;
		private WebDriverWait wait;

		public Homepage(WebDriver driver) 
		{
			this.driver = driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//label[@for=\"Dashboard\"]")
		WebElement Dashboard;
		
		@FindBy(xpath = "//label[@for='Leave']")
		WebElement LeavePolicy;
		
		@FindBy(xpath = "//label[@for=\"Holidays\"]")
		WebElement Holiday;
		
		
		
		public void dashboard()
		{
			Dashboard.click();
		}
		
		public void leavePolicy()
		{
		    WebElement leavePolicy = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@for='Leave']")));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", leavePolicy);
		}
		
		public void holiday() throws InterruptedException
		{
			Holiday.click();
		}
}

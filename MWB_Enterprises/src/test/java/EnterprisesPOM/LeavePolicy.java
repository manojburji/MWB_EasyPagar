package EnterprisesPOM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeavePolicy 
{
	WebDriver driver;
	private WebDriverWait wait;
	
	public LeavePolicy(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Policy']")
	WebElement Policy;
	
	@FindBy(css = "[class=\"flex justify-end\"]")
	WebElement AddLeaveButton;
	
	@FindBy(css = "[name=\"leaveName\"]")
	WebElement LeaveName;
	
	@FindBy(css = "[name=\"Type\"]")
	WebElement RepeatCycle;
	
	@FindBy(css = "[name=\"days\"]")
	WebElement NumberOfDays;
	
	@FindBy(css = "[name=\"Select Day\"]")
	WebElement CreditedDay;
	
	@FindBy(css = "[name=\"Select Month\"]")
	WebElement CreditedMonth;
	
	@FindBy(css = "[name=\"Select Gender\"]")
	WebElement SelectGender;
	
	@FindBy(css = "[name=\"eligibleNoOfDays\"]")
	WebElement EligibleDays;
	
	@FindBy(css = "[name=\"Approval Type\"]")
	WebElement ApprovalDays;
	
	@FindBy(css = "[name=\"Paid Type\"]")
	WebElement Paidtype;
	
	@FindBy(css = "[name=\"applyBeforeDays\"]")
	WebElement ApplyBeforeDays;
	
	@FindBy(css = "[name=\"applyAfterDays\"]")
	WebElement ApplyAfterDays;
	
	@FindBy(css = ".shadow-dropdown")
	WebElement DropdownSearchField;
	
	@FindBy(css = ".shadow-dropdown li, shadow-dropdown label")
	List<WebElement> listOptions;
	
	public void policy()
	{
		Policy.click();
	}

	public void AddLeaveButton()
	{
		AddLeaveButton.click();
	}
	
	public void leaveName()
	{
		LeaveName.sendKeys("Paid leaves");
	}
	
	public void repeatCycle()
	{
		RepeatCycle.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
		DropdownSearchField.sendKeys("Yearly");
		for(WebElement ele : listOptions)
		{
			if(ele.getText().equalsIgnoreCase("Yearly"))
			{
				ele.click();
			}
		}
	}
	
	public void numberOfDays()
	{
		NumberOfDays.sendKeys("12");
	}
	
	public void creditedDays()
	{
		CreditedDay.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
		DropdownSearchField.sendKeys("1");
		for(WebElement ele : listOptions)
		{
			if(ele.getText().equalsIgnoreCase("1"))
			{
				ele.click();
			}
		}
	}
	
	public void creditedMonth()
	{
		CreditedMonth.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
		DropdownSearchField.sendKeys("January");
		for(WebElement ele : listOptions)
		{
			if(ele.getText().equalsIgnoreCase("January"))
			{
				ele.click();
			}
		}
	}
	
	public void selectGender()
	{
		SelectGender.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
		DropdownSearchField.sendKeys("All");
		for(WebElement ele : listOptions)
		{
			if(ele.getText().equalsIgnoreCase("All"))
			{
				ele.click();
			}
		}
	}
	
	public void eligibleNumberDays()
	{
		EligibleDays.sendKeys("12");
	}
	
	public void approvalType()
	{
		ApprovalDays.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
		DropdownSearchField.sendKeys("Pre");
		for(WebElement ele : listOptions)
		{
			if(ele.getText().equalsIgnoreCase("Pre"))
			{
				ele.click();
			}
		}
	}
	
	public void paidType()
	{
		Paidtype.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
		DropdownSearchField.sendKeys("Yes");
		for(WebElement ele : listOptions)
		{
			if(ele.getText().equalsIgnoreCase("Yes"))
			{
				ele.click();
			}
		}
	}
	
	public void applyBeforeDays()
	{
		ApplyBeforeDays.sendKeys("2");
	}
	
	public void applyAfterDays()
	{
		ApplyAfterDays.sendKeys("2");
	}
	
	
	
	
	
	
	
	
	
	
}

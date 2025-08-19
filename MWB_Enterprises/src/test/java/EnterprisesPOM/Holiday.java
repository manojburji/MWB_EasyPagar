package EnterprisesPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

import java.util.*;

public class Holiday 
{
	WebDriver driver;
	private WebDriverWait wait;

	public Holiday(WebDriver driver) 
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
			
		@FindBy(xpath = "//div[@class=\"flex justify-end\"]")
		WebElement AddButton;
		
		@FindBy(xpath = "//p[text()='Organization']/..//button")
		WebElement SelectOrganization;
		
		@FindBy(css = "[name='Feature']")
		WebElement SelectBranch;
		
		@FindBy(css = "[name=\"name\"]")
		WebElement SelectName;
		
		@FindBy(xpath = "//input[@name=\"description\"]")
		WebElement HolidayDescription;
		
		@FindBy(xpath = "//p[text()='Holiday Type']/..//button")
		WebElement HolidayType;
		
		@FindBy(css = "[name = 'date']")
		WebElement DateFormat;
		
		@FindBy(xpath = "//p[text()='Duration']/..//button")
		WebElement DurationType;
		
		@FindBy(css = ".shadow-dropdown input")
		WebElement DropdownSearchfield;
		
		//Dropdown List of the Options
		@FindBy(css = ".shadow-dropdown li , .shadow-dropdown label")
		List<WebElement> listOptions;
		
		
		
		public void addButton() throws InterruptedException
		{
			AddButton.click();
			Thread.sleep(1000);
		}
		
		public void selectOrganization() throws InterruptedException
		{
			SelectOrganization.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Automation");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Automation"))
				{
					ele.click();
				}
			}
		}
		
		public void selectBranch()
		{
			SelectBranch.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Bangalore Branch");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Bangalore Branch"))
				{
					ele.click();
				}
			}
		}
		
		public void holidayName()
		{
			SelectName.sendKeys("Tuesday");
		}
		
		public void holidayDescription()
		{
			HolidayDescription.sendKeys("August 12th");
		}
		
		public void holidayType()
		{
			HolidayType.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Optional Holiday");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Optional Holiday"))
				{
					ele.click();
				}
			}
		}
		
		public void dateSelect() throws InterruptedException
		{
			DateFormat.sendKeys("11-08-2025");
			Thread.sleep(1000);
		}
		
		public void durationType()
		{
			DurationType.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Full Day");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Full Day"))
				{
					ele.click();
				}
			}
		}
		
		
		
		//Editing the Holiday
		@FindBy(xpath = "(//td[contains(@class, 'bg-tableBg')]//span[contains(@class, 'cursor-pointer')])[2]")
		WebElement ActionButton;
		
		@FindBy(css = "[type=\"button\"]")
		WebElement EditButton;
		
		@FindBy(xpath = "(//input[@type=\"text\" and contains(@class,'peer')])[1]")
		WebElement EditName;
		
		@FindBy(xpath = "(//input[@type=\"text\" and contains(@class,'peer')])[2]")
		WebElement EditDescription;
		
		@FindBy(css = "[type=\"date\"]")
		WebElement EditDate;
		
		
		
		@FindBy(xpath = "(//table//tr)[3]")
		WebElement Row;
		
		public void tapRow()
		{
			Row.click();
		}
		
		public void actionButton()
		{
			ActionButton.click();
		}
		
		public void editButton() throws InterruptedException
		{
			EditButton.click();
			Thread.sleep(2000);
		}
		
		public void editName()
		{
			EditName.click();
			EditName.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
			EditName.sendKeys("Holiday Name Edited");
		}
		
		public void editDescription()
		{
			EditDescription.click();
			EditDescription.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
			EditDescription.sendKeys("Description Name Edited");
		}
		
		public void editholidayType()
		{
			HolidayType.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Public Holiday");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Public Holiday"))
				{
					ele.click();
				}
			}
		}
		
		public void editDate()
		{
			EditDate.sendKeys("07-09-2025");
		}
		
		public void editDurationType()
		{
			DurationType.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Half Day");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Half Day"))
				{
					ele.click();
				}
			}
		}
		
		public void updateButton()
		{
			AddButton.click();
		}
		
		//Creating Holiday for Client Organization
		@FindBy(xpath = "//button[text()='Client Organization']")
		WebElement ClientOrganization;
		
		@FindBy(xpath = "//p[text()='Client']/..//button")
		WebElement SelectClient;
		
		@FindBy(css = "[name=\"Feature\"]")
		WebElement ClientBranch;
		
		@FindBy(css = "[name=\"name\"]")
		WebElement ClientHolidayName;
		
		@FindBy(css = "[name=\"description\"]")
		WebElement ClientHolidayDescription;
		
		@FindBy(xpath = "//p[text()='Holiday Type']/..//button")
		WebElement ClientHolidayType;
		
		@FindBy(css = "[name=\"date\"]")
		WebElement ClientHolidayDate;
		
		@FindBy(xpath = "//p[text()='Duration']/..//button")
		WebElement ClientHolidayDuration;
		
		public void selectClientOrganization()
		{
			ClientOrganization.click();
		}
		
		public void selectClient()
		{
			SelectClient.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Cisco");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Cisco"))
				{
					ele.click();
				}
			}
		}
		
		public void selectClientBranches()
		{
			ClientBranch.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Bangalore Branch");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Bangalore Branch"))
				{
					ele.click();
				}
			}
		}
		
		public void clientHolidayName()
		{
			ClientHolidayName.sendKeys("Ganesh Chatturthi");
		}
		
		public void clientHolidayDescription()
		{
			ClientHolidayDescription.sendKeys("Ganesh Chatturthi's Description");
		}
		
		public void clientHolidayType()
		{
			ClientHolidayType.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Optional Holiday");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Optional Holiday"))
				{
					ele.click();
				}
			}
		}
		
		public void clientHolidayDate()
		{
			ClientHolidayDate.sendKeys("26-08-2025");
		}
		
		public void clientHolidayDuration()
		{
			ClientHolidayDuration.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown input"))));
			DropdownSearchfield.sendKeys("Full Day");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Full Day"))
				{
					ele.click();
				}
			}
		}
		
		
		//Editing Holiday of Client Organization
		@FindBy(xpath = "(//td[contains(@class, 'bg-tableBg')]//span[contains(@class, 'cursor-pointer')])[1]")
		WebElement ClientActionButton;
		
		@FindBy(xpath = "//p[text()='Name']/..//input")
		WebElement EditClientName;
		
		@FindBy(xpath = "//p[text()='Description']/..//input")
		WebElement EditClientDescription;
		
		@FindBy(xpath = "//p[text()='Holiday Type']/..//button")
		WebElement EditClientHolidayType;
		
		@FindBy(css = "[type=\"date\"]")
		WebElement EditClientDate;
		
		@FindBy(xpath = "//p[text()='Duration']/..//button")
		WebElement EditClientDuration;
		
		public void clientActionButton()
		{
			ClientActionButton.click();
		}
		
		public void editClientName()
		{
			EditClientName.click();
			EditClientName.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
			EditClientName.sendKeys("Client Name Edited");
		}
		
		public void editClientDescription()
		{
			EditClientDescription.click();
			EditClientDescription.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
			EditClientDescription.sendKeys("Client Description Edited");
		}
		
		public void editClientHolidayType()
		{
			EditClientHolidayType.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Public Holiday");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Public Holiday"))
				{
					ele.click();
				}
			}
					
		}
		
		public void editClientDate()
		{
			EditClientDate.sendKeys("27-08-2025");
		}
		
		public void editClientDuration()
		{
			EditClientDuration.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Half Day");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Half Day"))
				{
					ele.click();
				}
			}
		}
		
		//Holiday Filters
		@FindBy(css = "[name=\"Select Organization\"]")
		WebElement OrganizationFilter;
		
		@FindBy(css = "[name=\"Feature\"]")
		WebElement BranchFilter;
		
		@FindBy(css = "[name=\"Year\"]")
		WebElement YearFilter;
		
		@FindBy(css = "[name=\"Month\"]")
		WebElement MonthFilter;
		
		@FindBy(css = "[name=\"Status\"]")
		WebElement StatusFilter;
		
		@FindBy(xpath = "//button[text()='Search ']")
		WebElement SearchButton;
		
		@FindBy(xpath = "//button[text()='Clear ']")
		WebElement ClearButton;
		
		@FindBy(css = "[name=\"Select Client\"]")
		WebElement 	ClientOrganizationFilter;
		
		public void organizationFilter()
		{
			OrganizationFilter.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Automation");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Automation"))
				{
					ele.click();
				}
			}
		}
		
		public void branchFilter()
		{
			BranchFilter.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Bangalore Branch");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Bangalore Branch"))
				{
					ele.click();
				}
			}
		}
		
		public void yearFilter()
		{
			YearFilter.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("2025");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("2025"))
				{
					ele.click();
				}
			}
		}
		
		public void monthFilter()
		{
			MonthFilter.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("August");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("August"))
				{
					ele.click();
				}
			}
		}
		
		public void ActiveStatusFilter()
		{
			StatusFilter.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Active");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Active"))
				{
					ele.click();
				}
			}
		}
		
		public void InactiveStatusFilter()
		{
			StatusFilter.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Inactive");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Inactive"))
				{
					ele.click();
				}
			}
		}
		
		public void searchButton()
		{
			SearchButton.click();
		}
		
		public void clearButton()
		{
			ClearButton.click();
		}
		
		public void clientOrganizationFilter()
		{
			ClientOrganizationFilter.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Cisco");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Cisco"))
				{
					ele.click();
				}
			}
		}
		
		public void clientBranchFilter()
		{
			BranchFilter.click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".shadow-dropdown"))));
			DropdownSearchfield.sendKeys("Bangalore Branch");
			for(WebElement ele : listOptions)
			{
				if(ele.getText().equalsIgnoreCase("Bangalore Branch"))
				{
					ele.click();
				}
			}
		}
		
		
		//Actions
		@FindBy(css = "[placeholder=\"Search\"]")
		WebElement Searchbar;
		
		@FindBy(xpath = "//span[text()=' Export CSV']")
		WebElement ExportCSV;
		
		@FindBy(xpath = "//span[text()='Columns']")
		WebElement Columns;
		
		@FindBy(id = "name_checkbox")
		WebElement NameCheckbox;
		
		@FindBy(id = "holidayType_checkbox")
		WebElement HolidayCheckbox;
		
		@FindBy(css = "[class=\"w-5 h-5 cursor-pointer\"]")
		WebElement CloseHeaderFilter;
		
		@FindBy(xpath = "//span[text()=' Reload']")
		WebElement ReloadButton;
		
		@FindBy(css = "[class=\"w-4 h-4 cursor-pointer text-gray-500 \"]")
		WebElement SearchbarCloseIcon;
		
		@FindBy(css = "[class=\"flex justify-center items-center gap-2\"]")
		WebElement ActiveInactiveButton;
		
		@FindBy(xpath = "//div[text()='Yes']")
		WebElement ConfirmationMessage;
		
		@FindBy(css = "[data-id=\"name\"]")
		WebElement DragElement;
		
		@FindBy(css = "[data-id=\"holidayType\"]")
		WebElement DropElement;

		
		
		public void searchbar() throws InterruptedException
		{
			Searchbar.sendKeys("Ganesh Chatturthi's Description");
			Thread.sleep(500);
		}
		
		public void exportCSV()
		{
			ExportCSV.click();
		}
		
		public void columns() 
		{
		    Columns.click();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id=\"name\"]")));
		}
		
		public void checkBox() throws InterruptedException
		{
			Thread.sleep(500);
			NameCheckbox.click();
			HolidayCheckbox.click();
		}
		
		public void closeHeaderFilter()
		{
			CloseHeaderFilter.click();
		}
		
		public void reloadButton()
		{
			ReloadButton.click();
		}
		
		public void closeSearchbar()
		{
			SearchbarCloseIcon.click();
		}
		
		public void activeInactiveButton()
		{
			ActiveInactiveButton.click();
		}
		
		public void confirmationMessage() throws InterruptedException
		{
			Thread.sleep(500);
			ConfirmationMessage.click();
		}
		
		public void dragAndDrop(WebElement source, WebElement target)
		{
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).perform();
		}
		
		public void dragAndDropElements()
		{
			dragAndDrop(DragElement, DropElement);
		}
		
	
		
		
		
		
		
		
		
}

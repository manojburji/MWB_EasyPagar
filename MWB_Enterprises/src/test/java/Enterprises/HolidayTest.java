package Enterprises;
import org.testng.annotations.Test;

public class HolidayTest extends HRMSBaseClass
{
	@Test(description = "Create Holiday")
	public void Holiday() throws InterruptedException
	{
		Homepage.holiday();
		Holiday.addButton();
		Holiday.selectOrganization();
		Holiday.selectBranch();
		Holiday.holidayName();
		Holiday.holidayDescription();
		Holiday.holidayType();
		Holiday.dateSelect();
		Holiday.durationType();
		Holiday.addButton();
		
	}
	
	@Test(description = "Edit Holiday")
	public void EditHoliday() throws InterruptedException
	{
		Homepage.holiday();
	//	Holiday.tapRow();
		Holiday.actionButton();
		Holiday.editButton();
		Holiday.editName();
		Holiday.editDescription();
		Holiday.editholidayType();
		Holiday.editDate();
		Holiday.editDurationType();
		Holiday.updateButton();
	}
	
	@Test(description = "Client Holiday creation")
	public void ClientHoliday() throws InterruptedException
	{
		Homepage.holiday();
		Holiday.addButton();
		Holiday.selectClientOrganization();
		Holiday.selectClient();
		Holiday.selectClientBranches();
		Holiday.clientHolidayName();
		Holiday.clientHolidayDescription();
		Holiday.clientHolidayType();
		Holiday.clientHolidayDate();
		Holiday.clientHolidayDuration();
		Holiday.addButton();
	}
	
	@Test(description = "Edit Client Holiday")
	public void EditClientHoliday() throws InterruptedException
	{
		Homepage.holiday();
		Holiday.selectClientOrganization();
		Holiday.clientActionButton();
		Holiday.editButton();
		Holiday.editClientName();
		Holiday.editClientDescription();
		Holiday.editClientHolidayType();
		Holiday.editClientDate();
		Holiday.editClientDuration();
		Holiday.addButton();
	}
	
	@Test(description = "Organization Filters")
	public void OrganizarionFilters() throws InterruptedException
	{
		Homepage.holiday();
		Holiday.clearButton();
		Holiday.organizationFilter();
		Holiday.branchFilter();
		Holiday.yearFilter();
		Holiday.monthFilter();
		Holiday.ActiveStatusFilter();
		Holiday.searchButton();
	}
	
	@Test(description = "Client Filters")
	public void ClientFilters() throws InterruptedException
	{
		Homepage.holiday();
		Holiday.clearButton();
		Holiday.selectClientOrganization();
		Holiday.clientOrganizationFilter();
		Holiday.clientBranchFilter();
		Holiday.yearFilter();
		Holiday.monthFilter();
		Holiday.ActiveStatusFilter();
		Holiday.searchButton();
	}
	
	@Test(description = "Holiday Actions")
	public void Actions() throws InterruptedException
	{
		Homepage.holiday();
		Holiday.clearButton();
		Holiday.exportCSV();
		Holiday.searchbar();
		Holiday.closeSearchbar();
		Holiday.columns();
		Holiday.dragAndDropElements();
		Holiday.checkBox();
		Holiday.closeHeaderFilter();
		Holiday.reloadButton();
		Holiday.activeInactiveButton();
		Holiday.confirmationMessage();
		Holiday.clearButton();
		Holiday.InactiveStatusFilter();
		Holiday.searchButton();
		Holiday.activeInactiveButton();
		Holiday.confirmationMessage();
		Holiday.clearButton();
		Holiday.ActiveStatusFilter();
		Holiday.searchButton();
	}
	
	
}

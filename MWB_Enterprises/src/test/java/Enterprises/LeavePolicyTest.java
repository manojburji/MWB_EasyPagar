package Enterprises;

import org.testng.annotations.Test;

public class LeavePolicyTest extends HRMSBaseClass
{
	@Test(description = "Creating Leave Policy")
	public void CreateLeavePolicy() throws InterruptedException
	{
		Homepage.leavePolicy();
		LeavePolicy.policy();
		TestandPush();
	}
}

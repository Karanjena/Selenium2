package AdvanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsonMethod {

	@Test
	public void createAccount() {
		Reporter.log("Account Created Successfully",true);
	}
	
	
	@Test(dependsOnMethods = "createAccount")
	public void editAccount() {
		Reporter.log("Account Editd Successfully", true);
		
	}
	
	//@Test(dependsOnMethods = {"editAccount","createAccount"})
	@Test(dependsOnMethods = "editAccount")
	public void deleteAccount() {
		Reporter.log("Account Deleted Successfully",true);
	}
	
}

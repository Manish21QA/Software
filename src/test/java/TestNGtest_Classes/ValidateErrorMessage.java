package TestNGtest_Classes;

import org.testng.annotations.Test;
import basePackage.Base;
import classes_POM.LoginPage_Upstox;
import utility_Methods.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;


public class ValidateErrorMessage extends Base{
	LoginPage_Upstox login;	
	
	
	@Test
	public void verifyErrorMessage() {
		Assert.assertEquals("Error Message not Displayed TC fail ", login.blankUserIDField());
		Reporter.log("Error Message Displayed Sucessfully ", true);
	}
	@AfterMethod
	public void beforeMethod() {
		driver.close();
	}

	@BeforeMethod
	public void afterMethod() throws IOException {
		login.enterUserID(utility_Methods.PropertyClass.readDataForProperties("blankUserID"));;
		login.enterPaswrd(utility_Methods.PropertyClass.readDataForProperties("password"));
		login.clickSignInButton();
		Wait.WaitFor(driver, 1000);
	}

	@BeforeClass
	public void OpenBroswer() throws IOException {
		LaunchBrowser();
		Reporter.log("Launching Browser " ,true);
		login=new LoginPage_Upstox(driver);
	}

}

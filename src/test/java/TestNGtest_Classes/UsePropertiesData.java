package TestNGtest_Classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Base;
import classes_POM.HomePage_Upstox;
import classes_POM.LoginPage_Upstox;
import classes_POM.PasscodePage_Upstox;
import classes_POM.TourPage_Upstox;
import utility_Methods.Wait;

public class UsePropertiesData extends Base{
	LoginPage_Upstox login;
	PasscodePage_Upstox passcode;
	TourPage_Upstox welcome;
	HomePage_Upstox home;
	String TCid="UserID_TCpass";
	
	@BeforeClass
	public void OpenBrowser() throws IOException {
		LaunchBrowser();
		Reporter.log("Launching Browser " ,true);
		login=new LoginPage_Upstox(driver);
		passcode=new PasscodePage_Upstox(driver);
		welcome=new TourPage_Upstox(driver);
		home=new HomePage_Upstox(driver);
	}
	
	@BeforeMethod
	public void LoginMethod() throws IOException {
		login.enterUserID(utility_Methods.PropertyClass.readDataForProperties("userID"));
		login.enterPaswrd(utility_Methods.PropertyClass.readDataForProperties("password"));
		Reporter.log("Enter UserID and PassWord ", true);
		login.clickSignInButton();
		Wait.WaitFor(driver, 1000);
		
		passcode.enterPasscode(utility_Methods.PropertyClass.readDataForProperties("passcode"));
		Reporter.log("Enter Passcode ", true);
		Wait.WaitFor(driver, 7000);
		
		welcome.ClickNoIamGoodButton();
		Reporter.log("Click No I am Good Button ", true);
		Wait.WaitFor(driver, 3000);
		
	}
	
	
	@Test
  public void VerifyUserName() throws IOException {
		Assert.assertEquals(home.ActualUserName(driver),utility_Methods.PropertyClass.readDataForProperties("expUserName"));
		Reporter.log("Validate Actual and Expected ", true);
		Wait.WaitFor(driver, 1000);
	}
	
	@AfterMethod
	public void logOutToUpstox() {
		home.clickLogOut();
		Wait.WaitFor(driver, 1000);
	}
	
	@AfterClass
	public void ClosedBrowser() {
		driver.close();
	}
	
}

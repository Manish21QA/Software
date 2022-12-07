package TestNGtest_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.Browser;
import classes_POM.FundsPage_Upstox;
import classes_POM.HomePage_Upstox;
import classes_POM.LoginPage_Upstox;
import classes_POM.PasscodePage_Upstox;
import classes_POM.TourPage_Upstox;
import utility_Methods.GeneralExcelMethod;
import utility_Methods.ScreenShotMethod;
import utility_Methods.Wait;

public class VerifyUserName extends Browser {

	LoginPage_Upstox login;
	PasscodePage_Upstox passcode;
	TourPage_Upstox welcomePage;
	HomePage_Upstox home;
	FundsPage_Upstox funds;
	String TCid="001";
	
	@BeforeClass
	public void OpenBrowser() {
		lauchBrowser();
		Reporter.log("Lanuching Browser....", true);
		login = new LoginPage_Upstox(driver);
		passcode = new PasscodePage_Upstox(driver);
		welcomePage= new TourPage_Upstox(driver);
		home = new HomePage_Upstox(driver);
		funds=new FundsPage_Upstox(driver);
		
	}

	@BeforeMethod
	public void LoginToUpstox() throws EncryptedDocumentException, IOException {
		login.enterUserID(GeneralExcelMethod.excel(2, 1));
		login.enterPaswrd(GeneralExcelMethod.excel(1, 1));
		
		login.clickSignInButton();
		Reporter.log("UserID and Password....",true);
		Wait.WaitFor(driver, 5000);
		
		passcode.enterPasscode(GeneralExcelMethod.excel(2, 0));
		Reporter.log("Passcode...", true);
		Wait.WaitFor(driver, 10000);
		
		welcomePage.ClickNoIamGoodButton();
		Wait.WaitFor(driver, 5000);
		
	}



	@Test
	public void validateUserName() throws EncryptedDocumentException, IOException {
		Assert.assertEquals(home.ActualUserName(driver),GeneralExcelMethod.excel(0, 0));
		Reporter.log("Validate Actual and Expected User Name ", true);
		ScreenShotMethod.scrnShot(driver, TCid);
	}

	@AfterMethod
	public void logOut() {
		Wait.WaitFor(driver, 5000);
		home.clickLogOut();
		Reporter.log("Loging Out... ", true);
	}
	
	@AfterClass
	public void closedBrowser() {
		Wait.WaitFor(driver, 5000);
		
		driver.close();
		Reporter.log("Closed Browser... ", true);
	}
}

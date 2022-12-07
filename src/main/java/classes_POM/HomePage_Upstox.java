package classes_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_Methods.ScrollingIntoViewMethod;
import utility_Methods.TakeScrenShotMethod;




public class HomePage_Upstox {
	// 1. Variable Declaration
	
		@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userName;
		
		@ FindBy(id = "funds") private WebElement funds;
		
		@ FindBy(xpath = "//div[text()='Logout']") private WebElement logOut;
		
		// 2. Variable Initialisation
		
		public HomePage_Upstox(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		// 3. Variable Usage
		public void validateUserName(WebDriver driver,String expName) throws InterruptedException, IOException {
			Thread.sleep(2000);
			ScrollingIntoViewMethod.scorllIntoView(driver, userName);
			String actualUserName = userName.getText();
			String expectedUserName = expName;
			TakeScrenShotMethod.scrnShot(driver, " actualUserName " + actualUserName);
			
			if(actualUserName.equals(expectedUserName)) {
				System.out.println("actualUserName and ExpectedUserName Match then Test Case is pass");
			
			}else {
				System.out.println("actualUserName and ExpectedUserName Not Match then Test Case is Failed");
			
			}
			
		}
		
		public String ActualUserName(WebDriver driver) {
			String actualID=userName.getText();
			ScrollingIntoViewMethod.scorllIntoView(driver, userName);
			return actualID;
			
		}
		
		public void clickOnFunds(WebDriver driver) {
			ScrollingIntoViewMethod.scorllIntoView(driver, funds);
			funds.click();
		}
		
		public void clickLogOut()  {
			userName.click();
			logOut.click();
		}

}

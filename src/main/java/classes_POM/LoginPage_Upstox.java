package classes_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Upstox {
	// 1. Variable Declaration
		@FindBy(name = "userId") private WebElement userID;
		@FindBy(name="password") private WebElement password;
		@FindBy(xpath ="//div[text()='Sign into Upstox']") private WebElement signIn;
		@FindBy(xpath="//button[@type='button']") private WebElement errorMessage;
		
		// 2. Variable Initialisation
		public LoginPage_Upstox(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		// 3. Variable Usage
		public void enterUserID(String ID) {
			userID.sendKeys(ID);
		}
		
		public boolean blankUserIDField() {
			return errorMessage.isDisplayed();
		}
		
		public boolean blankPaswrdField() {
			return errorMessage.isDisplayed();
		}
		
		
		public void enterPaswrd(String pw) {
			password.sendKeys(pw);
		}
		
		public void clickSignInButton() {
			signIn.click();
		}

}

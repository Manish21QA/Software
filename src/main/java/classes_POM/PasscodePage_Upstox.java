package classes_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage_Upstox {

	// 1. Variable Declaration 
	
	@FindBy(name="yob") private WebElement passcodeField;
	
	// 2. Variable Initialisation  
	
	public PasscodePage_Upstox(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 2. Variable Usage 
	public void enterPasscode(String yob)  {

		passcodeField.sendKeys(yob);
	}

}

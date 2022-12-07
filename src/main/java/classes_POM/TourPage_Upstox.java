package classes_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TourPage_Upstox {
	
	// 1. Variable Declaration 
	
	//@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement noIamGoodButton;
	
	@FindBy (xpath = "(//button[@type='button'])[9]") private WebElement noIamGoodButton;
	
	// 2. Variable Initialisation
	
	public TourPage_Upstox(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// 3. Variable Usage
	
	public void ClickNoIamGoodButton() {
		
		noIamGoodButton.click();
	}
	

}

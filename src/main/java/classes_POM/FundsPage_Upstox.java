package classes_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundsPage_Upstox {
	
	// 1. Variable Declaration
	
	@FindBy(xpath = "((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]") private WebElement availableBalance;

	public FundsPage_Upstox(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CheckAvailableFunds() {
		String myBalance = availableBalance.getText();
		System.out.println(" My Upstox Balance is "+myBalance);
	}
}

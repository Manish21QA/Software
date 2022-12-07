package utility_Methods;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class ScrollingIntoViewMethod {

	// 1. Variable Declaration
	
	public static void scorllIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].scrollIntoView()", element );
		
		
		
		
		
	
	}

}

package basePackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	protected static WebDriver driver;
	public void LaunchBrowser() throws IOException {
		
		
		

		System.setProperty("webdriver.chrome.driver","E:\\SoftwareTesting LecturesData\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(utility_Methods.PropertyClass.readDataForProperties("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		
		
		
		
		
	}
}



package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\SoftwareTesting LecturesData\\Selenium\\gecko\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://select.finology.in/");

	}

}

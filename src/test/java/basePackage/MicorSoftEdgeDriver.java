package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MicorSoftEdgeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\SoftwareTesting LecturesData\\Selenium\\m\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.get("https://select.finology.in/");
		driver.manage().window().maximize();
	}

}

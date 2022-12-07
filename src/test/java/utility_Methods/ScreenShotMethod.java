package utility_Methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMethod {
	
	
	public static void scrnShot(WebDriver driver, String TCid) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\SoftwareTesting LecturesData\\selenium_For_Automation\\ScreenShotMethod\\"+TCid+".jpg");
		
		FileHandler.copy(source, destination);
	}

}

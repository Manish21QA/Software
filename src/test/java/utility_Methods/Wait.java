package utility_Methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Wait {
	
	public static void WaitFor(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

}

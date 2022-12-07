package utility_Methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
	public static String readDataForProperties(String key) throws IOException {
		//create object of properties class
		Properties property=new Properties();
		
		//create object of FileInputStream and pass porperty file path
		FileInputStream myFile=new FileInputStream("C:\\Users\\Yogesh_Ashtankar\\eclipse-workspace\\FrameWork_TestNG__Final\\myProperty.properties");
		property.load(myFile);
		
		String value = property.getProperty(key);
		
		return value;
	}

}

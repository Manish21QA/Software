package utility_Methods;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GeneralExcelMethod {

	public static String excel(int row, int cell) throws EncryptedDocumentException, IOException {
		File Myfile= new File("E:\\SoftwareTesting LecturesData\\selenium_For_Automation\\Apache POI excel\\TestData.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		String value = Mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}

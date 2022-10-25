package base_utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility_Class {

	WebDriver driver;

	public Utility_Class(WebDriver driver1) {
		driver = driver1;
	}

	public String Get_Excel_Data(int row_index, int cell_index) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\aksha\\OneDrive\\Desktop\\Test Data\\Excel Sheet\\TC_Data.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Flipkart");
		Cell cell = sheet.getRow(row_index).getCell(cell_index);
		try {
			return (int) cell.getNumericCellValue() + "";
		} catch (Exception e) {
			return cell.getStringCellValue();
		}

	}

	public void Take_Screen_shot(String TC_name) {
		Date date = new Date();
		String DF = new SimpleDateFormat("ss_mm_hh_dd_MM_yyyy").format(date);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\aksha\\OneDrive\\Desktop\\Test Data\\ScreenShot\\" + DF + TC_name + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			Reporter.log("Directory Not found ", true);
		}
	}

}

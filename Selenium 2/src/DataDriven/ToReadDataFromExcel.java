package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Create Obj of FileinputStream
		FileInputStream fis = new FileInputStream("./textData/textData.xlsx");

		// create Obj of workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		// call method
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String PASSWORD = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();

		// Script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);

	}
}

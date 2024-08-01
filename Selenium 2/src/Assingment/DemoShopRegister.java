package Assingment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShopRegister {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		// Create Obj of FileinputStream
		FileInputStream fis = new FileInputStream("./textData/DemoWebShopRegisterData.xlsx");

		// create Obj of workbook
		Workbook wb = WorkbookFactory.create(fis);

		// call method
		String URL = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String FIRSTNAME = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String LASTNAME = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		String GMAIL = wb.getSheet("Sheet1").getRow(3).getCell(0).toString();
		String PASSWORD = wb.getSheet("Sheet1").getRow(4).getCell(0).toString();
		String CONFIRMPASSWORD = wb.getSheet("Sheet1").getRow(5).getCell(0).toString();

		// Script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(URL);
		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.id("Email")).sendKeys(GMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
		driver.findElement(By.id("register-button")).click();

	}

}

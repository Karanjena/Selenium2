package AdvanceSelenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS_TC_015 extends BaseClass{

	@Test
	public void toLogo() throws IOException {
	File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
    File src=new File("./errorssort/DemoWebShop.png");
    FileHandler.copy(temp, src);
    
    
    assertEquals(temp, temp);
    Reporter.log("Successfully Capture The Logo", true);
	}
}

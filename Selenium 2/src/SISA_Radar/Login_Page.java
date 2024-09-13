package SISA_Radar;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser got launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximize Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://radaruat.sisainfosec.com/");
		System.out.println("Successfully navigate the login page");
		
		//Email Id TestField
		System.out.println("Enter Your Valid Email_Id");
		String excepted_Email_Id = sc.next();
		WebElement email_Id = driver.findElement(By.xpath("//input[@id='usernameOrEmailAddress']"));
		email_Id.clear();
		email_Id.sendKeys(excepted_Email_Id);
		String actural_Email_Id = email_Id.getAttribute("value");
		if (actural_Email_Id.equals(excepted_Email_Id)) {
			System.out.println("Email Successfully accepted data");
		} else {
			System.out.println("Email Failed accept data");
		}
		
		//Password TestField
		System.out.println("Enter Your Valid Password");
		String excepted_password =sc.next();
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.clear();
		password.sendKeys(excepted_password);
		String actural_password = password.getAttribute("value");
		if (actural_password.equals(excepted_password)) {
			System.out.println("Password Successfully accepted data");
		} else {
			System.out.println("Password Failed accept data");
		}
		
		
		//Login Button
		WebElement Login = driver.findElement(By.xpath("//button[@id='LoginButton']"));
		Login.submit();
		
		String Excepted_Error_Page="Invalid user name or password";
		 String Actual_Error_Page = driver.findElement(By.xpath("//div[text()='Invalid user name or password']")).getText();
		 if(Actual_Error_Page.equals(Excepted_Error_Page)) {
			 System.out.println("Invalid UserName And Password");
			 driver.findElement(By.xpath("//button[text()='OK']")).click();
		 }else {
			 System.out.println("Successfull Login Page Execute");
		 }
		
		System.out.println("Close The Browser");
		driver.quit();
		

	}

}

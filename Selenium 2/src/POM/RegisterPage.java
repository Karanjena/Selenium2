package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="gender-male")
	private WebElement genderTextField;
	
	@FindBy(id="FirstName")
	private WebElement firstnameTextField;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextFiled;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement registerButton;

	public WebElement getGenderTextField() {
		return genderTextField;
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
}

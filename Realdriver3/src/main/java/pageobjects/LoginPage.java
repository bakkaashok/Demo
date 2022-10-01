package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="input-email")
	private WebElement emailAddressField1; 
	
	
	@FindBy(name="password")
 private	WebElement passwordField;
	
	@FindBy(css="input[value='Login']")
	private WebElement LoginButton;

 
	
	
	public WebElement emailAddressField() {
		return emailAddressField1;
	}

	public WebElement passwordField() {
		return passwordField;
}
	
	public WebElement loginButton() {
		return LoginButton;
}
}
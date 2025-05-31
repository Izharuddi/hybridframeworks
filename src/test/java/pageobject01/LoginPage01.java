package pageobject01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testcase01.BaseClass1;

public class LoginPage01 extends BasePage01 {

	WebDriver driver;
	//constructor
	
	public LoginPage01(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement count;
	
	
	public void setEmail(String Email1) {
		txtEmail.sendKeys(Email1);

	}
	public void setPassword(String Password1) {
		txtPassword.sendKeys(Password1);

	}
	public void Login1() {
		
		login.click();	
	}
	public void myaccount() {
		myaccount.click();
	}
	public void clicklogout() {
		logout.click();
	}
	public void clickcount() {
		count.click();
	}
	
	
}

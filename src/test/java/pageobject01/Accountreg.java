package pageobject01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountreg extends BasePage01 {

	WebDriver driver;
	
	public  Accountreg (WebDriver driver) {
		super(driver);
		
	}
	
	 
	 @FindBy(xpath="//input[@id='input-firstname']")
	 WebElement firstname;
	 
	 @FindBy(xpath="//input[@id='input-lastname']")
	 WebElement lastname;
	 
	 @FindBy(xpath="//input[@id='input-email']")
	 WebElement email;
	 
	 @FindBy(xpath="//input[@id='input-telephone']")
	 WebElement telephone;
	 
	 @FindBy(xpath="//input[@id='input-password']")
	 WebElement password;
	 
	 @FindBy(xpath="//input[@id='input-confirm']")
	 WebElement conpassword;
	 
	 @FindBy(xpath="//label[normalize-space()='Yes']")
	 WebElement radio;
	 
	 @FindBy(xpath="//input[@name='agree']")
	 WebElement privay;
	 
	 @FindBy(xpath="//input[@value='Continue']")
	 WebElement cont;
	 
	 public void enterfirstname(String username) {
		 firstname.sendKeys(username);
	    }
	 public void enterlastname(String lname) {
		 lastname.sendKeys(lname);
	    }
	 public void enteremail(String mail) {
		 email.sendKeys(mail);
	    }
	 public void entertelephone(String tphone) {
		 firstname.sendKeys(tphone);
	    }
	 public void enterpwd(String pwd) {
		 password.sendKeys(pwd);
	    }
	 public void enterconformpwd(String conpwd) {
		 conpassword.sendKeys(conpwd);
	    }
	 public void enterradio() {
		radio.click();
	    }
	 public void entercont() {
		 cont.click();
	    }
}

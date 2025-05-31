package pageobject01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage01 extends BasePage01{
	
	 public Homepage01(WebDriver driver) {
	        super(driver);
	    }

	    @FindBy(xpath = "//a[@title='My Account']")
	    WebElement myacc;
	    
	    @FindBy(xpath="//a[normalize-space()='Register']")
		 WebElement rege;
	    @FindBy (xpath="//a[normalize-space()='Login']")
	    WebElement loginbutton;

	    public void clickMyAccount() {
	        myacc.click();
	    }
	    public void clickreg() {
			rege.click();
		}
	    public void clicklogin() {
	    	loginbutton.click();
	    }
	    

}

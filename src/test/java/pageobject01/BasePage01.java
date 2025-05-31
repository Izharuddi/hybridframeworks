package pageobject01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage01 {
	 WebDriver driver;
		
		public BasePage01(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}


}

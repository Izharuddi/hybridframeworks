package testcase01;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;


import pageobject01.Accountreg;
import pageobject01.Homepage01;

public class Testcase1 extends BaseClass1 {
	
	/*@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}*/
	@Test(groups= {"Sanity","Regression"})
	public void actualtest() {
		
		Homepage01 hp=new Homepage01(driver);
		
		hp.clickMyAccount();
		logger.info("click on my account");
		hp.clickreg();
		logger.info("click on register");
		/*Accountreg pg=new  Accountreg(driver);
		
		pg.enterfirstname("izhar");
		pg.enterlastname("uddin");
		pg.enteremail("abcde@gmal.com");
		pg.entertelephone("1234567890");
		pg.enterpwd("izhar1234");
		pg.enterconformpwd("izhar1234");
		pg.enterradio();
		pg.entercont();*/
		
	
		Accountreg ag=new  Accountreg(driver);
		logger.info("enter all details");
		ag.enterfirstname(randomString().toUpperCase());
		ag.enterlastname(randomString().toLowerCase());
		ag.enteremail(randomalphnumeric()+"@gmail.com");
		ag.entertelephone(randomNumberic());
		
		String pass=randomvalue();
		ag.enterpwd(pass);
		ag.enterconformpwd(pass);
		ag.enterradio();
		ag.entercont();
		
		
	}
	
	/*	public String randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}
	public String randomNumberic() {
		String generatenumber=RandomStringUtils.randomNumeric(10);
		return generatenumber;
	}
	public String randomalphnumeric() {
		String generaredalphanumeric=RandomStringUtils.randomAlphanumeric(3);
		return generaredalphanumeric;
	}
	
	public String randomvalue() {
		String pass1=RandomStringUtils.randomNumeric(5);
		String pass2=RandomStringUtils.randomAlphabetic(10);
		return (pass1+"@"+pass2);
	}*/
	
	/*@AfterClass
	public void tearout() {
		driver.quit();
	}*/

}

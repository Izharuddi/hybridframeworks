package testcase01;

import org.testng.annotations.Test;

import pageobject01.Homepage01;

import pageobject01.LoginPage01;

public class TestCaseLoginpage extends BaseClass1{
	@Test(groups={"Sanity","Regression"})
	public void actualtest()  {
		
		Homepage01 hp=new Homepage01(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage01 al=new LoginPage01(driver);
		al.setEmail(p.getProperty("email"));
		al.setPassword(p.getProperty("password"));
		al.Login1();
		
	}
}

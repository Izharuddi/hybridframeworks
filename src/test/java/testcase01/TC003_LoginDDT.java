package testcase01;

import java.lang.System.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pageobject01.Homepage01;
import pageobject01.LoginPage01;
import pageobject01.MyAccountPage;
import testcase01.BaseClass1;

public class TC003_LoginDDT extends BaseClass1 {
	

		@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
		public void verify_loginDDT(String email, String password, String exp)
		{
			logger.info("**** Starting TC_003_LoginDDT *****");
			
		
		
			//Home page
				Homepage01 hp=new Homepage01(driver);
				hp.clickMyAccount();
				hp.clicklogin(); //Login link under MyAccount
					
				//Login page
				LoginPage01 lp=new LoginPage01(driver);
				lp.setEmail(email);
				lp.setPassword(password);
				lp.Login1(); //Login button
					
				//My Account Page
				MyAccountPage macc=new MyAccountPage(driver);
				boolean targetPage=macc.isMyAccountPageExists();
				
				if(exp.equalsIgnoreCase("Valid"))
				{
					if(targetPage==true)
					{
						macc.clickLogout();
						Assert.assertTrue(true);
					}
					else
					{
						Assert.assertTrue(false);
					}
				}
				
				if(exp.equalsIgnoreCase("Invalid"))
				{
					if(targetPage==true)
					{
						macc.clickLogout();
						Assert.assertTrue(false);
					}
					else
					{
						Assert.assertTrue(true);
					}
				}
			}
		}

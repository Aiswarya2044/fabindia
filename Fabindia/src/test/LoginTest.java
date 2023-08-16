package test;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends HomeTest
{ 
@Test(priority=2)
	public void logintest() throws InterruptedException 
	{
		LoginPage ob = new LoginPage(driver);
		Thread.sleep(3000);
		ob.radio();
		Thread.sleep(3000);
		ob.setvalues("aiswarya1995das@gmail.com","Aishu@2023");
		Thread.sleep(3000);
		ob.login();
		Thread.sleep(3000);
		
	}
	
}

package test;

import org.testng.annotations.Test;

import pages.LogoutPage;

public class LogoutTest extends WishlistTest
{
	@Test(priority=7)
	public void Signouttest() throws InterruptedException
	{
	LogoutPage ob = new LogoutPage(driver);
	Thread.sleep(3000);
	ob.ham();
	Thread.sleep(3000);
	ob.out();
	Thread.sleep(3000);
	}

}

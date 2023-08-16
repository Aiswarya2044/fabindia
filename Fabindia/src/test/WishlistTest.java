package test;

import org.testng.annotations.Test;

import pages.WishlistPage;

public class WishlistTest extends ShoppingTest
{
	@Test(priority=6)
	public void wishtest() throws InterruptedException
	{
		WishlistPage ob= new WishlistPage(driver);
		Thread.sleep(3000);
		ob.addquantity();
		Thread.sleep(3000);
	}
		
}


package test;

import org.testng.annotations.Test;

import pages.ShoppingPage;

public class ShoppingTest extends MenubarTest
{
@Test(priority=5)
public void shopping() throws InterruptedException
{
	ShoppingPage ob=new ShoppingPage(driver);
	ob.shopclick();
	Thread.sleep(3000);
	ob.cart();
	Thread.sleep(3000);
	ob.icon();
	Thread.sleep(3000);
	
}

}

package test;

import org.testng.annotations.Test;

import pages.MenubarPage;

public class MenubarTest extends HamburgerSelectionTest
{
	@Test(priority=4)
	 private void menuselection() throws InterruptedException 
	 {
		MenubarPage ob= new MenubarPage(driver);
		ob.Mclick();
		Thread.sleep(3000);
		ob.Kclick();
		Thread.sleep(3000);
		ob.Hclick();
		Thread.sleep(3000);
		ob.Fclick();
		Thread.sleep(3000);
		ob.Pclick();
		Thread.sleep(3000);
		ob.Foclick();
		Thread.sleep(3000);
		ob.Cclick();
		Thread.sleep(3000);
		ob.Sclick();
		Thread.sleep(3000);
		
	 }
	

}

package test;

import org.testng.annotations.Test;
import pages.HamburgerSelectionPage;

public class HamburgerSelectionTest extends LoginTest
{	
@Test(priority=3)
      private void hamselection() throws InterruptedException 
      {
      HamburgerSelectionPage ob = new HamburgerSelectionPage(driver);
      Thread.sleep(3000);
      ob.select();
      Thread.sleep(3000);
      ob.arrive();
      Thread.sleep(3000);
      ob.women();
      Thread.sleep(3000);
	  }
      }

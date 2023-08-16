package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HamburgerSelectionPage 
{	
WebDriver driver;
By hamburger= By.xpath("/html/body/app-root/cx-storefront/div[2]/div/div/div[1]/cx-page-slot/fab-ham-burger-menu/button");
By newarrivals= By.xpath("//*[@id=\"flush-headingOne\"]/button"); 
By women= By.xpath("//*[@id=\"shopByCategoryOne000\"]/li[2]");

public HamburgerSelectionPage(WebDriver driver2)
		{
			this.driver = driver2;
		}
		public void select()
		{
		  driver.findElement(hamburger).click();
		}
		public void arrive()
		{
			driver.findElement(newarrivals).click();
		}
		public void women()
		{
		driver.findElement(women).click();
	}
		
}


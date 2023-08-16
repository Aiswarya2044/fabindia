package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage 
{

	WebDriver driver;   
	By hamburger1= By.xpath("/html/body/app-root/cx-storefront/div[2]/div/div/div[1]/cx-page-slot/fab-ham-burger-menu/button");
	By logout= By.xpath("/html/body/app-root/cx-storefront/div[2]/div/div/div[1]/cx-page-slot/fab-ham-burger-menu/ng-sidebar-container/ng-sidebar/aside/div/div[2]/ul/li[18]/cx-generic-link/a");
	public LogoutPage(WebDriver driver2) 
	{
		this.driver = driver2;
	}
	public void ham()
	{
		driver.findElement(hamburger1).click();
	}
	public void out()
	{
	driver.findElement(logout).click();
	}
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By Hlog = By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[1]/fab-india-login/div/div/div/div/div[2]/div[1]/a[1]");
	
	public HomePage(WebDriver driver2) 
	{
		this.driver = driver2;
	}
	public void log()
	{
		driver.findElement(Hlog).click();	
	}

}

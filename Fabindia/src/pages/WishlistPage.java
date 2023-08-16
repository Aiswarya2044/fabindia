package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
	WebDriver driver;
	By quantityadd = By.xpath("//*[@id=\"product-list\"]/div/div[2]/div/div[2]/cx-item-counter/div/div/button[2]");


	public WishlistPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void addquantity()
	{
		driver.findElement(quantityadd).click();	
	}

}

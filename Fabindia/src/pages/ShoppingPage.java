package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingPage {
	
WebDriver driver;
By wishlist = By.xpath("/html/body/app-root/cx-storefront/div[2]/div/div/div[3]/cx-page-slot/fab-header-wish-list/a");
By addtocart = By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot/app-fab-wish-list/div[2]/div/div[1]/app-fab-product-grid-item/div/div/div[3]/app-fab-add-to-cart/form/button");
By carticon = By.xpath("/html/body/app-root/cx-storefront/div[2]/div/div/div[3]/cx-page-slot/cx-mini-cart/a");
public ShoppingPage(WebDriver driver) 
{
		this.driver = driver;
	}
	public void shopclick()
    {
    	driver.findElement(wishlist).click();
    }
	public void cart()
	{
		driver.findElement(addtocart).click();
	}
	public void icon()
	{
		driver.findElement(carticon).click();
	}

}

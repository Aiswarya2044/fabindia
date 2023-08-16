package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenubarPage 
{
	
WebDriver driver;

	By Men=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[3]/span/cx-generic-link/a");
	By Kids=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[4]/span/cx-generic-link/a");
	By Homeandliving=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[5]/span/cx-generic-link/a");
	By Furniture=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[6]/span/cx-generic-link/a");
	By Personalcare=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[7]/span/cx-generic-link/a");
	By Food=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[7]/span/cx-generic-link/a");
	By Collection=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[8]/span/cx-generic-link/a");
	By Services=By.xpath("/html/body/app-root/cx-storefront/div[3]/div/div/cx-page-slot/cx-category-navigation/cx-navigation-ui/nav[10]/span/p");
	

    public MenubarPage(WebDriver driver2) {

    this.driver = driver2;
	}
	public void Mclick()
    {
    	driver.findElement(Men).click();
    }
    public void Kclick()
    {
    	driver.findElement(Kids).click();
    }
    public void Hclick()
    {
    	driver.findElement(Homeandliving).click();
    }
    public void Fclick()
    {
    	driver.findElement(Furniture).click();
    }
    public void Pclick()
    {
    	driver.findElement(Personalcare).click();
    }
    public void Foclick()
    {
    	driver.findElement(Food).click();
    }
    public void Cclick()
    {
    	driver.findElement(Collection).click();
    }
    public void Sclick()
    {
    	driver.findElement(Services).click();
    }
    
    
}

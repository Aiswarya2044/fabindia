package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	
	By fradio = By.id("emailLoginRadio");
	By femail = By.id("logiemail");
	By fpassword = By.id("logipass");
	By flogin = By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/cx-page-slot[1]/app-fab-email-login/div/div/div/div[3]/form/div[3]");
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void radio()
	{
		driver.findElement(fradio).click();
	}
	public void setvalues(String email, String password)
	{ 
		driver.findElement(femail).sendKeys(email);
		driver.findElement(fpassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(flogin).click();
	}
}

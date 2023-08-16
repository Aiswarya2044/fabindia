package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver =new ChromeDriver();
		driver.get("https://www.fabindia.com/login");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void Hometest() throws InterruptedException
	{
		HomePage ob = new HomePage(driver);
		Thread.sleep(3000);
		ob.log();
		Thread.sleep(3000);
	}
}

package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldown {
	WebDriver driver;
	
	@Test
	public void Scrolldown()
	{
	
	System.setProperty("webdriver.chrome.driver","");
	driver=new ChromeDriver();
	driver.get("www.Amazon.in");
	driver.manage().window().maximize();

}
}
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbCreatepage;

public class Fbcreatepagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.get("http://www.facebook.com");
		
	}
	@Test
	public void test2()
	{
		FbCreatepage ob1=new FbCreatepage(driver);
		ob1.createpageclick();
		ob1.getstartedclick();
	}

}

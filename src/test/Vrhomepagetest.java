package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Vrhomepage;

public class Vrhomepagetest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(op);
		driver.get("https://www.vrlbus.in");
		
		
	}
	
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Vrhomepage ob=new Vrhomepage(driver);
		ob.setvalues("GOA","BANGALORE","07-04-2023");
	    ob.search();
		
	}

}
package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	
	
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hello123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//input[@name='email']"));
		driver.findElement(By.xpath("//input[@id='pass']"));
		
	}
	
	@After
	public void teardown()
	{
		//driver.quit();
	}

}

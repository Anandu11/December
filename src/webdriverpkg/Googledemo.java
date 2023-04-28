package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Googledemo {
	EdgeDriver driver;
	
	
	@Before
	public void setup()
	{
		 driver=new EdgeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("Books");
		search.submit();
		//driver.findElement(By.name("btnK")).click();
	
	}

}

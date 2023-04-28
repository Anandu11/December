package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerthandling {
	EdgeDriver driver;
	@Before
	public void setUp()
	{
	 driver= new EdgeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("C:/Users/ACER/OneDrive/Desktop/alerts1.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc1233");
		
	}

}


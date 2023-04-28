package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	EdgeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@Parameters("a")
	@Test
	public void test1(String a)
	{
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys(a,Keys.ENTER);
		
	}

}

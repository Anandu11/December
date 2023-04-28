package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttontext {
EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{  
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

}
	@Test
	public void Buttontext()
	{
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		String text=button.getAttribute("value");
		if(text.equals("check available"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
	}
}

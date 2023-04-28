package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	WebDriver driver;
	
	String baseurl="https://www.expedia.com/?pwaLob=wizard-flight-pwa";
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
	@Test
	public void testlogin()
	{
		
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	
	while(true)
	{
	WebElement month=driver.findElement(By.xpath("//*[@class='uitk-date-picker-menu-months-container']/div/h2"));
	String month1=month.getText();
	if(month1.equals("April 2023"))
	{
		System.out.println(month1);
		break;
	}
	else
	{
		driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button[2]")).click();
	}
	
	}
	
	List<WebElement>alldates1=driver.findElements(By.xpath("//*[@class='uitk-calendar']/div[2]/div[1]/table/tbody/tr/td/button"));
	for(WebElement dateelement:alldates1)
	{
		String date=dateelement.getAttribute("date-day");
		System.out.println(date);
		if(date.equals("18"))
		{
			//System.out.println(date);
			dateelement.click();
			System.out.println("date selected");
		}
	}		
}
	//
	//
	//
	//
}
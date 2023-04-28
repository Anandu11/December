package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Expediapgm {
EdgeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
		
    @BeforeMethod		
	public void urlloading()
	{
		driver.get("www.expedia.com");
		driver.manage().window().maximize();
		
	
		
	}
	
	@Test
	public void expediatest()
	{
		//roundTrip
		driver.findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[1]")).click();//round trip
		//depart city 
		WebElement departcity=driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button"));
        departcity.click();
        //arrival city
        WebElement arrivalcity=driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div/div/div[1]/button"));
        arrivalcity.click();
        //departure date
       WebElement departdate=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[5]/td[6]/button"));
        departdate.click();
        //return date
        WebElement returndate=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr[5]/td[4]/button"));
       returndate.click();
       //adults
       WebElement adult=driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/label/span"));
       
       //children
       
       WebElement children=driver.findElement(By.xpath("//*[@id=\"child-age-input-0-0\"]"));
       
       
       driver.close();
       
        

		
	}
	

}

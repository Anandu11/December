package webdriverpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Listcount {
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		
	}
	@Test
	public void test1()
	{
		driver.get("http://www.facebook.com");
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.print(l.size());
		for(WebElement li:l)
		{
			String link=li.getAttribute("href");
			//String linktext=li.getText();
			//System.out.println(link+"---"+linktext);
			verify(link);
		}
	}
   
	private void verify(String link)                                  //float f=3.5f;
	                                                                  //double c=(double)f;
	{
		try
		{
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection) ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("response code is 200 successfull----"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("No content");
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
			}
				
			
		}


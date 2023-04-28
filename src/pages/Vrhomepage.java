	package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;

	public class Vrhomepage {
		WebDriver driver;
		
		By fromcity=By.xpath("//*[@id=\"FromCity\"]");
		By Destination=By.xpath("//*[@id=\"ToCity\"]");
		By bookingdate=By.xpath("//*[@id=\"txtFromDate\"]");
	    By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
		
		public Vrhomepage(WebDriver driver)
		{
			this.driver=driver;
		}
		public void setvalues(String from,String to,String date)
		{
			driver.findElement(fromcity).sendKeys(from,Keys.ENTER);
			driver.findElement(Destination).sendKeys(from,Keys.ENTER);
			driver.findElement(bookingdate).clear();
			driver.findElement(bookingdate).sendKeys(date);
			driver.findElement(search).click();
	
			
		}
		public void search()
		{
			driver.findElement(search).click();
		}
		

	}


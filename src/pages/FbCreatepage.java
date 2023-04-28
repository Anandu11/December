package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbCreatepage {
	WebDriver driver;
	
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[2]/div/div[1]/img");		

	
	public FbCreatepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String click)
	{
		driver.findElement(createpage).sendKeys(click);
		driver.findElement(getstarted).sendKeys(click);
	}
	public void createpageclick()
	{
		driver.findElement(createpage).click();
}
	public void getstartedclick()
	{
		driver.findElement(getstarted).click();
	}
	
}
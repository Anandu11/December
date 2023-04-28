package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		
	}
	@Test
	public void test1()
	{
		driver.get("http://register.rediff.com/register/register.php?ForName=user_details");
	    WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	    Select day=new Select(dayelement);
	    day.selectByVisibleText("01");
	    WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	    Select month=new Select(monthelement);
	    month.selectByVisibleText("MAR");
	    WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	    Select year=new Select(yearelement);
	    year.selectByVisibleText("2005");
	}
	
	

}

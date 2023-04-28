package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {
EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{  
		driver=new EdgeDriver();
	}
	@Test
	public void fileuploadpgm() throws Exception
	{
		driver.get("http://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		
		fileupload("C:\\Users\\ACER\\OneDrive\\Desktop\\Turf4.jpg");
	}
	
	public void fileupload (String p) throws AWTException{
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
		
		Robot robot=new Robot();
	
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.delay(2000);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
		
	}
				
}

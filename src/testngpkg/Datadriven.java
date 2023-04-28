package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://www.facebook.com");
	}
	@Test
	public void datadriventest() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\ACER\\OneDrive\\Desktop\\Book2.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(f);//return workbook details	
        XSSFSheet sh=wb.getSheet("Sheet1");//return sheet details
        int rowcount=sh.getLastRowNum();//return row count
        for(int i=1;i<=rowcount;i++)
        {
        	String username=sh.getRow(i).getCell(0).getStringCellValue();//username details
        	String pswd=sh.getRow(i).getCell(1).getStringCellValue();
        	System.out.println("username="+username+"password="+pswd);
        	driver.findElement(By.name("email")).clear();
        	driver.findElement(By.name("email")).sendKeys(username);
        	driver.findElement(By.name("pass")).clear();
        	driver.findElement(By.name("pass")).sendKeys(pswd);
        	driver.findElement(By.name("login")).click();
        	
        	
        	
        }
        
		
	}

}

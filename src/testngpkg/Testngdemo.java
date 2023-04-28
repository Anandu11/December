package testngpkg;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	//@beforetest
	//@beforemethod
	//@beforeclass
	//@test
	//@aftermethod
	EdgeDriver driver;
	
	//@BeforeTest
	//public void setup()
	//{
		//driver=new EdgeDriver();
	//}
	//@BeforeMethod
	//public void urlloading()
	//{
		//driver.get("http://www.google.com");
	//}
	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("test2");
	}
	@Test(groups= {"regression"})
	public void test4()
	{
		System.out.println("test2");
	}
	@Test(groups= {"sanity"})
	public void test5()
	{
		System.out.println("test2");
	}
	
	
	
	
	
	
	//@AfterMethod
	//public void aftmthd()
	//{
		//System.out.println("aftermethod");
	//}
	//@AfterTest
	//public void browserquit()
	//{
		//driver.quit();
	//}

}

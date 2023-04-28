package webdriverpkg;


import org.openqa.selenium.chrome.ChromeDriver;


public class Firstscript {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//browser open
		driver.get("https://www.google.com");//URL loading
		String actualtitle=driver.getTitle();//actual title of the application
		System.out.println(actualtitle);
		String exp="google";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}

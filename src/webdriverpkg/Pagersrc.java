package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagersrc {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("Https://www.google.com");
		String src=driver.getPageSource();//returns Page source
		if(src.contains("Gmail"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}

	}

}

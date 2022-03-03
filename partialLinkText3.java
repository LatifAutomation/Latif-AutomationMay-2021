package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText3 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Forgotten password
		
	
		String text = driver.findElement(By.partialLinkText("?")).getText();
		
		System.out.println(text);
		

	}

}

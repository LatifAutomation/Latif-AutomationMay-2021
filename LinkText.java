package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML3/LinkText4.html");
		
		driver.manage().window().maximize();
		
		//Link1
		
		driver.findElement(By.linkText("MyLink1")).click();
		
		
	}

}

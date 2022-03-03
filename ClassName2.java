package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.airbnb.co.in/");
		driver.manage().window().maximize();
		
		//
		
		driver.findElement(By.className("_1yibeas")).sendKeys("Mumbai");

	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/HTML30May2022/ID.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.tagName("input")).sendKeys("Maruti");
		
		// Middle Name
		
		driver.findElement(By.id("A")).sendKeys("Suzuki");
		
		//Last Name
		
		driver.findElement(By.id("B")).sendKeys("Car");
		
	}

}

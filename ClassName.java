package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/pc/Desktop/HTML3/ClassName4.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.tagName("input")).sendKeys("Manual");
		//Middle Name
		
		driver.findElement(By.id("abc")).sendKeys("Automation");
		
		//Last Name
		
		driver.findElement(By.name("lname")).sendKeys("Tetsing");
		
		//Address
		driver.findElement(By.name("add")).sendKeys("Pune");
		
		//Permanant address
		
		driver.findElement(By.className("peradd")).sendKeys("Maharashtra");
		
		
		
		
	}

}

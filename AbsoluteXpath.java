package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/Absolutexpath3.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.xpath(" html/body/div[1]/input[1]")).sendKeys("Test");
		
		//Last name
		
		driver.findElement(By.xpath("html/body/div[1]/input[3]")).sendKeys("Automation");
		
		//Link1
		
		driver.findElement(By.xpath("html/body/div[2]/a[1]")).click();
	}

}

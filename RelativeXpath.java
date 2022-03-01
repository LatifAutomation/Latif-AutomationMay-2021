package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML3/Absolutexpath3.html");
		
		driver.manage().window().maximize();
		// First name
		
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("My first Name");
		
		//link2
		driver.findElement(By.xpath("//div[2]/a[2]")).click();

	}

}

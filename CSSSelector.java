package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/Automation%20Assignment/CSSSelector.html");
		driver.manage().window().maximize();
		
		
		//First Name
		driver.findElement(By.tagName("input")).sendKeys("Manual ");
		
		//Middle Name
		
		driver.findElement(By.cssSelector("input[id='mname']")).sendKeys("Automation");
		
		//Last Name
		
		driver.findElement(By.cssSelector("input[name='lastnam']")).sendKeys("Testing");
		
	}

}

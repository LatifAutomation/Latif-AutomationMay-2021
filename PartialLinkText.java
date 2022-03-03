package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/HTML3/LinkText4.html");
		
		driver.manage().window().maximize();
		
		//Link1
		
		driver.findElement(By.partialLinkText("nk2")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("3")).click();
		
		
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Email Address
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	 
	//Search input
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobie");
	
	//Search button click
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

}

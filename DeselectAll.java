package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize();
		
		//Identify the elemet
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		//create the object of Select class
		
		Select sel=new Select(dropdown);
		
		
		
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		//sel.selectByValue("saab");
		//sel.selectByVisibleText("Opel");
		sel.selectByVisibleText("Audi");
		sel.selectByValue("maruti");
		
		//Deselct All
		
		sel.deselectAll();
		
		
	}

}

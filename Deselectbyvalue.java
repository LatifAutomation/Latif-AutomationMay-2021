package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectbyvalue {

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		driver.manage().window().maximize();
		
		//Identify the elements
		
		WebElement drp = driver.findElement(By.id("cars"));
		
		//Create the object of Select Class
		
		Select sel=new Select(drp);
		
		//Perform the action
		
		sel.selectByValue("saab");
		sel.selectByValue("opel");
		sel.selectByValue("audi");
		
		
		//Deselect the value by using deselect by value method
		
		sel.deselectByValue("opel");
		
	}

}

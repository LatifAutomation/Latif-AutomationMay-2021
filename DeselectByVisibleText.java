package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {

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
		
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Maruti");
		
		//Deselect the value by using deseelct by visible text
		sel.deselectByVisibleText("Saab");
		
	}

}

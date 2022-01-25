package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args)
	{
       WebDriver driver=new ChromeDriver();
       
		driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		
		
		//is Multiple
		
		// if multiselectable---> True
		
		//if not -----> false
		//driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
		
		driver.manage().window().maximize();
		
		// Identify the drop down
		WebElement drp = driver.findElement(By.id("cars"));
		
		// Create the object of 
		
		Select sel=new Select(drp);
		
		
		if(sel.isMultiple())
		{
			System.out.println("drop down is multiselectable");
		}

		
		else
		{
			System.out.println("drop down is not multiselectable");
		}
	}

}

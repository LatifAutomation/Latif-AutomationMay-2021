package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleClass extends Utility

{

	public static void main(String[] args) 
	{
		
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/pc/Desktop/HTML/Select.html");
     driver.manage().window().maximize();
     
     WebElement dropdown1 = driver.findElement(By.id("cars"));
     WebElement dropdown2 = driver.findElement(By.id("cars"));
		//create the object of Select class
		
     Utility ut=new Utility();
    // Utility.selectByIndex(dropdown, 0);
	ut.selectByvalue(dropdown1, "opel");	
     
     ut.selectByvalue(dropdown2, "apple");
		
	}

}

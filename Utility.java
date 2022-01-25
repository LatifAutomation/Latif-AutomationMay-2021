package DropDownHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{

	
	public static void selectByIndex(WebElement drp,int arg)
	{
		Select sel=new Select(drp);
		sel.selectByIndex(0);
	}
	
	public static void selectByvalue(WebElement drp,String val)
	{
		Select sel=new Select(drp);
		sel.selectByValue(val);
	}
	
	
	public static void selectByvisibleText(WebElement drp,String val)
	{
		Select sel=new Select(drp);
		sel.selectByVisibleText(val);
	}
	
}

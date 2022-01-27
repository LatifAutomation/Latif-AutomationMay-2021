package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
		WebDriver abc=new ChromeDriver();
		abc.get("https://chercher.tech/practice/popups");
		abc.manage().window().maximize();
		
		
		//
		WebElement dbcl = abc.findElement(By.id("double-click"));
		
		Actions act=new Actions(abc);
		
		act.doubleClick(dbcl).perform();
		

	}

}

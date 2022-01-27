package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) 
	{
		WebDriver abc=new ChromeDriver();
		abc.get("https://chercher.tech/practice/popups");
		abc.manage().window().maximize();
		
		WebElement list = abc.findElement(By.id("sub-menu"));
		
		Actions act=new Actions(abc);
		
		act.moveToElement(list).perform();
		
		//act.moveToElement(target, xOffset, yOffset)
		
	
		int xcord = list.getLocation().getX();
		
		System.out.println(xcord);

	}

}

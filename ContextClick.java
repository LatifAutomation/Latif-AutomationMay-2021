package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identify the elements
		
		WebElement fblog = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(fblog).perform();
		
		act.
		
		
	}

}

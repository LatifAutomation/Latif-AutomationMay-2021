package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify the elememnt
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		

		//Create the object of Actions class
		
		Actions act=new Actions(driver);
		
		
		//perform the action
		
		act.sendKeys(ele, "Mobile").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(300);
		
		act.sendKeys(Keys.END).perform();
		
	
		
	}

}

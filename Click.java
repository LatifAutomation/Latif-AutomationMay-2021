package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
      
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		

		//Create the object of Actions class
		
		Actions act=new Actions(driver);
		
		
		//perform the action
		
		act.sendKeys(ele, "Mobile").perform();
		
		WebElement srbtn = driver.findElement(By.id("nav-search-submit-button"));
		
		act.click(srbtn).perform();
		
	}

}

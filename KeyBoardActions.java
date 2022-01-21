package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KeyBoardActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// Identify the drop down
		
		WebElement drp = driver.findElement(By.id("searchDropdownBox"));
		drp.click();
		
		
		
		Select sel=new Select(drp);
		
		sel.
		
		
		
		/*drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ARROW_DOWN);
		drp.sendKeys(Keys.ENTER);*/
		

	}

}

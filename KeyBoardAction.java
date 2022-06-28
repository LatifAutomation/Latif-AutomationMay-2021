package HandLingList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement lst = driver.findElement(By.id("searchDropdownBox"));
		
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(300);
		lst.sendKeys(Keys.ARROW_DOWN);
		lst.sendKeys(Keys.ENTER);

	}

}

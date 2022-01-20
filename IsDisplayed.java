package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		
		if(logo.isDisplayed())
		{
			System.out.println("Amazon Logo is visible");
		}
		
		else
		{
			System.out.println("Amazon Logo is not visible");
		}
	}

}

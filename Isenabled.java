package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement srcbtn = driver.findElement(By.id("nav-search-submit-button"));
		
		if(srcbtn.isEnabled())
		{
			System.out.println("Seearch button is enabled");
		}
		
		else
		{
			System.out.println("Seearch button is not enabled");
		}
	}

}

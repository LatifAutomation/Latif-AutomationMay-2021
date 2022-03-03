package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname3 {

	public static void main(String[] args)
	{

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Email
		
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Test@test.com");
		

	}

}

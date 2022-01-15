package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector2 {

	public static void main(String[] args) 
	{
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				//Email Address
				driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("test@gmail.com");
				
				//Password
				
				driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Test@1234");
				//driver.findElement(By.cssSelector("button[name='login']")).click();
				
				driver.findElement(By.cssSelector("button[id*='u_0_d_']")).click();

	}

}

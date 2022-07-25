package TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataDriven 
{
  
	@Test(dataProvider="facebookdata")
	public void facebookTest(String username,String password)
  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Email
		driver.findElement(By.id("email")).sendKeys(username);
		
		//password
		
		
		driver.findElement(By.name("pass")).sendKeys(password);	
		
  }
	
	
	@DataProvider(name="facebookdata")
	
	public Object[][] TestData()
	
	{
		
		Object[][]facebookData1=new Object[2][2];
		
		facebookData1[0][0]="firstuser@gmail.com";
		facebookData1[0][1]="Test@1234";
		
		facebookData1[1][0]="seconduser@gmail.com";
		facebookData1[1][1]="Test@12345";
		
		
		
		
		
				
		return facebookData1;
		
	}
	
	
}

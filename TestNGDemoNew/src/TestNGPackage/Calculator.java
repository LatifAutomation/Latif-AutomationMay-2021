package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator
{
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest()
	public void openURL()
	{
		driver.get("https://www.calculator.net/");
	}
	
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	//public static void main(String[] args) throws InterruptedException {
	
    @Test ()
	public void Multiplication()
	{
		// TODO Auto-generated method stub
		String MultiplicationexpectedResult = "222075";

		
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click(); 

		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();  
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

		String MultiplicationactualResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
		System.out.println(MultiplicationactualResult);
	if(MultiplicationactualResult.contains(MultiplicationexpectedResult)) {
		System.out.println("Multiplication test case Pass");
		}
		else {
		System.out.println("Multiplication test case Fail");
		}
}	

@Test()

public void Division()
{
	//4000 200
	//driver.get("https://www.calculator.net/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String DivisionexpectedResult = "20";
		
	    
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click(); 

		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();  
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  
		
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

		String DivisionResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
					System.out.println(DivisionResult);
		if(DivisionResult.contains(DivisionexpectedResult)) {
		System.out.println("Division test case Pass");
		}
		else {
		System.out.println("Division test case Fail");
		}
	
}
		//@Test()
		
		public void Addition()
		{
			//driver.get("https://www.calculator.net/");
		String AdditionexpectedResult = "111111";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='sciOutPut']")).sendKeys("-234234");//- 
//		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); //2
//		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
//		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
//		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); //2
//		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
//		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
//		
		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click(); 

	    driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  //3
		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); //4
		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click(); //5 
		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  //3
		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); //4
		driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click(); //5 
		
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

		String AdditionactualResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
		System.out.println(AdditionactualResult);
		if(AdditionactualResult.contains(AdditionexpectedResult)) {
		System.out.println("Addition test case Pass");
		}
		else {
		System.out.println("Addition test case Fail");
		}
		
}


		@Test()
		
		public void Subtraction()
		{
		driver.get("https://www.calculator.net/");
		String SubtractionexpectedResult = "23329646";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); //2
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click(); //8
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//2
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
		
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click(); 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click(); 

		//driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[1]")).click();  //-
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); //2
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click(); //3 
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();  //0
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click(); //9
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); //4
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click(); //8
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); //2
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click(); //3
		
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

		String SubtractionactualResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
		System.out.println(SubtractionactualResult);
		if(SubtractionactualResult.contains(SubtractionexpectedResult)) {
		System.out.println("Subtraction test case Pass");
		}
		else {
		System.out.println("Subtraction test case Fail");
		}
		
	}

	@Test
		public void addition2()
		{
			//driver.get("https://www.calculator.net/");
			String AdditionexpectedResult = "111111";
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  //3
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); //4
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click(); //5 
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();  //3
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click(); //4
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click(); //5 
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
			
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); //2
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click(); //2
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();//3
			driver.findElement(By.xpath("//*[@id=\'sciout\']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();//4
			
			driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();  

			String AdditionactualResult = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
			System.out.println(AdditionactualResult);
			if(AdditionactualResult.contains(AdditionexpectedResult)) {
			System.out.println("Addition test case Pass");
			}
			else {
			System.out.println("Addition test case Fail");
			}
			
			
		}
		
}





	

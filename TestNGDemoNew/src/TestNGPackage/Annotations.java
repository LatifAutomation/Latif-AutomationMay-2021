package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  
	
	@Test
	public void test()
	{
		
		System.out.println(" I am in Test case");
	}
	
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println(" Browser opened");
	}
	
	
	@BeforeTest
	public void login()
	{
		System.out.println(" Login to application");
	}
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println(" close opened");
	}
	
	
	@AfterTest
	public void logout()
	{
		System.out.println(" logout from application");
	}
	
}

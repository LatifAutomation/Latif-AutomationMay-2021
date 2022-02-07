package TestNGPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class First 
{
  
	
	
	@Test(priority=-1)
	public void logout()
	{
		System.out.println("I am in logout Test case");
	}
	//@Test
	public void zebra()
	{
		System.out.println("I am in zebra Test case");
	}
	
	@Test(priority=0)
	public void registration()
	{
		System.out.println("I am in registration Test case");
	}
	
	@Test(priority=-8)
	public void productsearch()
	{
		System.out.println("I am in productsearch Test case");
	}
	
	@Test(priority=-3)
	public void payment()
	{
		System.out.println("I am in payment Test case");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("I am in login Test case");
	}
	
	
	@Test(priority=4)
	public void report()
	{
		System.out.println("I am in report Test case");
	}
	
	
}

package TestNGPackage;

import org.testng.annotations.Test;

public class Dependsonmethod 
{
  
	
	
	@Test
	public void payment()
	{
		System.out.println(" I am in payment");
	}
	
	
	
	@Test
	public void login()
	{
		System.out.println("I am in Login Method");
	}
	
	
	@Test
	public void registration()
	{
		System.out.println("I am in Registration");
	}
	
	
	@Test
	
	public void productsearch()
	{
		System.out.println(" I am in product search");
	}
  
}

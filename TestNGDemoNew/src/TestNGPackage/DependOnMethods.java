package TestNGPackage;

import org.testng.annotations.Test;

public class DependOnMethods
{
  
	@Test
	public void login() 
	{
		
		System.out.println("Application Login successfully");
	}
	

	@Test(dependsOnMethods= {"purchase","login"},priority=-3 )
	public void amountTransafer()
	{
		System.out.println("Amount transferred succesfully");
	}
	
	@Test
	public void serachProduct()
	{
		System.out.println(" Product Search successfully");
	}
	
	@Test(dependsOnMethods="amountTransafer")
	public void reportGenerGenerte()
	{
		System.out.println(" Report Generated");
	}
	
	
	@Test(dependsOnMethods="serachProduct")
	public void purchase()
	{
		System.out.println("Product purchased successfully ");
	}
	
	
	@Test(dependsOnMethods="reportGenerGenerte", priority=-6)
	public void logout()
	{
		System.out.println(" Logout successfully");
	}
}

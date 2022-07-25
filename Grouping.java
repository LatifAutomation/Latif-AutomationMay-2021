package TestNG2;

import org.testng.annotations.Test;

public class Grouping 
{
  
	
	@Test(groups= {"group1","group3"})
	public void login()
	{
		System.out.println("Login successfull");
	}
	
	
	@Test(groups= {"group2"})
	public void register()
	{
		System.out.println("register successfull");
	}
	
	@Test(groups= {"group3"})
	public void logout()
	{
		System.out.println("logout successfull");
	}
	
	
	@Test(groups= {"group2"})
	public void purchase()
	{
		System.out.println("purchase successfull");
	}
	
}

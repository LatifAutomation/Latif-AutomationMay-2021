package TestNGPackage;

import org.testng.annotations.Test;

public class Priority
{
  
	@Test(priority=5)
	public void first()
	{
		System.out.println(" I am in First Test case");
	}
	
	
	@Test(priority=-1)
	public void second()
	{
		System.out.println(" I am in second Test case");
	}
	
	
	
	@Test(priority=-3)
	public void third()
	{
		System.out.println(" I am in third Test case");
	}
	
	
	
	@Test(priority=2)
	public void fourth()
	{
		System.out.println(" I am in fourth Test case");
	}
	
	
	@Test(priority=2)
	public void fifth()
	{
		System.out.println(" I am in fifth Test case");
	}
	
}

package TestNGPackage;

import org.testng.annotations.Test;

public class EnabledTestCase 
{
  
	@Test
	public void first()
	{
		System.out.println(" I am in first Test case");
	}
	
	@Test(description="This is Test case for Login ")
	public void second()
	{
		System.out.println(" I am in second Test case");
	}
	
	
	@Test
	public void third()
	{
		System.out.println(" I am in third Test case");
	}
	
	
	@Test
	public void fourth()
	{
		System.out.println(" I am in fourth Test case");
	}
	
	@Test
	public void fifth()
	{
		System.out.println(" I am in fifth Test case");
	}

}

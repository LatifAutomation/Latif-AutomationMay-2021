package TestNGPackage;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FirstTest
{
	
	@Test
	public void first()
	{
		System.out.println(" I am in First Test case");

	
}
	
	@Test
	public void second()
	{
		System.out.println("I am in Second Test Case");
	}
	
	@Test
	public void failed()
	{
		System.out.println("I am in third Test Case");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void failed2()
	{
		System.out.println("I am in third Test Case");
		String exptitle = "a123";
		String actTitle = "wer";
		
		Assert.assertEquals(true, false);
	}
	
	
	@Test
	public void third()
	{
		System.out.println("I am in third Test Case");
	}
	
	
	
	
	
}




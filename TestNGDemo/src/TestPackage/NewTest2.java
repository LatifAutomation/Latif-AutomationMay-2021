package TestPackage;

import org.testng.annotations.Test;

public class NewTest2 
{
  @Test(dependsOnMethods="third")
  public void first()
  {
	  
	 System.out.println("First Test case"); 
  }
  
  @Test(dependsOnMethods="fourth")
  public void second()
  {
	  
	 System.out.println("second Test case"); 
  }
  
  @Test(priority=0)
  public void third()
  {
	  
	 System.out.println("third Test case"); 
  }
  
  
  @Test
  public void fourth()
  {
	  
	 System.out.println("fourth Test case"); 
  }
  
  @Test(priority=-1)
  public void five()
  {
	  
	 System.out.println("five Test case"); 
  }
  
}

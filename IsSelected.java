package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/popups");
		driver.manage().window().maximize();
		
		//
		 WebElement chk = driver.findElement(By.id("checkbox"));
		 chk.click();
		
          if(chk.isSelected())
          {
        	  System.out.println("Checkbox is selected");
        	  
          }
		
          else
          {
        	  System.out.println("Checkbox is not  selected");
          }
	}

}

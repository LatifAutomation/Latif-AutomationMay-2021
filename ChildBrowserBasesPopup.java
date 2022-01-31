package AlertsandPopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserBasesPopup {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/popups#");
		driver.manage().window().maximize();
		
		//Identify the element
		
		//driver.findElement(By.id("two-window")).click();
		
		driver.findElement(By.xpath("//a[@id='three-window']")).click();
		System.out.println("Window clicked");
		
		/*String pid = driver.getWindowHandle();
		
		System.out.println(pid);*/
		
		Set<String> rids = driver.getWindowHandles();
		
		//System.out.println(rids);
		
		Iterator<String> itr=rids.iterator();
		
		String pwd = itr.next();
		
		System.out.println(pwd);
		
		String cwid = itr.next();
		System.out.println();
		
		
		driver.switchTo().window(cwid);
		
		String ctitle = driver.getTitle();
		System.out.println(ctitle);
		
		
		//driver.close();
		
		
	   driver.switchTo().window(pwd);
	   
	  String ptitl = driver.getTitle();
	  System.out.println(ptitl);
	//driver.close();
	  driver.quit();
		
		
	}

}

package TestNg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class Windowhandlegurupage {
WebDriver driver;
@BeforeTest
public void beforetest()
{
	driver = new ChromeDriver();
	System.out.println();
}
@org.testng.annotations.Test
public void f() {
	driver.get("https://demo.guru99.com/popup.php");
	String parentWindow = driver.getWindowHandle();
    System.out.println("Parent Window Title" +driver.getTitle());
    driver.findElement(By.xpath("/html/body/p/a")).click();
    Set<String> allWindowHandles = driver.getWindowHandles();
    for(String handle : allWindowHandles)
    		{
    	System.out.println(handle);
    	//system.out.println(parentWindow);
    	if(!handle.equalsIgnoreCase(parentWindow))
    	{
    		driver.switchTo().window(handle);
    		String s= driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
    	    System.out.println(s);
    	    driver.close();
    	}
    	driver.switchTo().window(parentWindow);
    		}
}

}

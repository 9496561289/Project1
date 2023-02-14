package Junit;

import org.junit.Before;


import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alertboxprgm {
	WebDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Testing/Alert.html");
	}
	@Test
	public void test8()
	{
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		if(alerttext.equals("hello i am an alertbox"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		}
		a.accept();
		//a.dismiss();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc123");
		
	}
}

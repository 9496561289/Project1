package TestNg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleandrightclick {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	
	{
	driver= new ChromeDriver();	
	}
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test1()
	{
		
		WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement double1 = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Alert a= driver.switchTo().alert();
		String alert= a.getText();
		System.out.println(alert);
		a.accept();
		act.doubleClick(double1);
		act.perform();
		Alert b = driver.switchTo().alert();
		b.accept();
		
		
		
		
	}
	
}


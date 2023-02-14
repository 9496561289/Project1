package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testnggrouping {
	WebDriver driver;
	public void setup()
	{
		//browser open
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		
		driver.get("https://www.google.com");
	}
	@Test(groups = {"smoke","sanity"})
	public void titleverification()
	{
		
		System.out.println("hello");
	}
	@Test(groups = {"sanity"})
	public void test2()
	{
		
	}
	@Test(groups = {"sanity"})
	public void test3()
	{
		
	}
	@Test(groups = {"regression"})
	public void test4()
	{
		
	}
	@Test(groups = {"smoke"})
	public void test5()
	{
		
	}
	@AfterMethod
	public void aftermethod()
	{
		
	}
	@AfterTest
	public void browserquit()
	{
		
	}

}

package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.Fbpassworderrorpage;
import org.testng.annotations.BeforeMethod;

public class Fbpassworderrortest {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get(baseurl);
	}
	@Test
	public void testforgetpasswrd()
	{
		 Fbpassworderrorpage ob = new Fbpassworderrorpage(driver);
		 ob.linkclick();
		 ob.setvalues("9496561289");
		 ob.click();
		 
	}
}

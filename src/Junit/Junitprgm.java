package Junit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgm {
	ChromeDriver driver;
	
  @Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test1()
	{
		String title= driver.getTitle();
		System.out.println(title);	
	}
	@After
	public void browserclose()
	{
		//driver.quit();
		driver.close();
	}
	

}

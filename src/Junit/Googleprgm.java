package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleprgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test3()
	{
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("poem",Keys.ENTER);
	}
}

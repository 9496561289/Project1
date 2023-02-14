package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		
	}
	@Test
	public void test1()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("F:\\DOCUMENTS\\Rinu Rose Resumes\"");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}

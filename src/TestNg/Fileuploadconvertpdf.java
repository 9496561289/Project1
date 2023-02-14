package TestNg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadconvertpdf {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
	}
	@Test
	public void test2() throws IOException
	{
		String title= driver.getTitle();
		System.out.println(title);
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Testing\\T1.exe");
		
		
	}
}

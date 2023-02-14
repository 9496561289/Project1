package Junit;

//import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logofindprgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
	}
	@Test
	public void test4()
	{
		Boolean logo=driver.findElement(By.xpath("//*[@id='wrapper/table[1]/tbody/tr[1]/td[1]/img/']")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is displayed");
			
		}
		else
		{
			System.out.println("Logo is not displayed");
		}

	}
}

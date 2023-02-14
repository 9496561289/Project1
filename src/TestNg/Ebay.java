package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
	@BeforeTest
	public void setup()
	
	{
	driver= new ChromeDriver();	
	}
	@Test
	public void test1()
	{
		driver.get("https://ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\\\"mainContent\\\"]/div[1]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		act.perform();
		act.click().build();
		act.perform();
		//driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		driver.findElement(By.xpath("//*[@id=\"s0-0-33-4-0-0[0]-2-match-media-0-ebay-carousel-list\"]/li[2]/div/a/div[2]/div/div/h2/div/span")).click();

		
	}
}









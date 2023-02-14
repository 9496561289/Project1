package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Implicitwait {
	WebDriver driver;
	@BeforeTest
	public void setup()
	
	{
	driver= new ChromeDriver();	
	}
	@Test
	public void test1()
	{
		//drag and drop code
		
		driver.get("https://demoqa.com/droppable/");
		
		//implicit wait code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
		//drop.getText();
		String text=drop.getText();
		if(text.contentEquals("Dropped"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
}

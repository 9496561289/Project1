package Junit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgm {
WebDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/Testing/Alert.html");
	
}
@Test
public void test1() throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("E://error.png"));
	
	//One element screenshot
	WebElement button=	driver.findElement(By.xpath("/html/body/input[1]"));
	File sc=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sc, new File("./Screenshot/error1.png"));
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	if(alerttext.equals("hello i am an alertbox"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
	a.accept();
	//a.dismiss();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc123");
}
}

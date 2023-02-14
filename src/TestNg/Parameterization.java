package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new FirefoxDriver();
}
@Parameters("searchvalue")
@Test
public void test4(String s)
{
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
}

}

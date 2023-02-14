package Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Utestloginpage;


public class Utestlogintest {
	WebDriver driver;
	String baseurl="https://www.utest.com";
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
	public void testlogin()
	{
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Total count of links="+l.size());
		for(WebElement link:l)
		{
			String linkdetails=link.getAttribute("href");
			verify(linkdetails);
		}
		driver.findElement(By.xpath("/html/body/ul[1]/li[8]/button[2]")).click();
		Utestloginpage ob = new Utestloginpage(driver);
		ob.setvalues("rinurosekarukayil@gmail.com", "karukayil");
		ob.login();
	}
	private void verify(String linkdetails) {
		
		try
		{
			URL u=new URL(linkdetails);
			   HttpURLConnection con =(HttpURLConnection)u.openConnection();
			   con.connect();
			   if(con.getResponseCode()==200)
			   {
				   System.out.println("status is 200..."+linkdetails);
			   }
		
			   else if(con.getResponseCode()==404)
			   {
				   System.out.println("status is 404..."+linkdetails);
			   }
			   
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		}

}

package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Linkvalidation 
{
	
    WebDriver driver;
    String baseurl="https://www.facebook.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void main()
{
	List<WebElement> l=driver.findElements(By.tagName("a"));
	System.out.println("Total count of links="+l.size());
	for(WebElement link:l)
	{
		String linkdetails=link.getAttribute("href");
		verify(linkdetails);
	}
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
		   else
		   {
			   System.out.println("other status code...."+linkdetails);
		   }
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	}
}

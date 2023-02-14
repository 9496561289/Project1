package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstscript {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	//FirefoxDriver driver1 = new FirefoxDriver();
	//driver1.get("http://www.youtube.com");
	String title= driver.getTitle();
	String exp="google";
	
	//if(title.equals(exp))-- output will be fail
	
	if(title.equalsIgnoreCase(exp))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
		

	}

}

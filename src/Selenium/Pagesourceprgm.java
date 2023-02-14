package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourceprgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		String s= driver.getPageSource();
		if(s.contains("Notifications"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}

	}

}

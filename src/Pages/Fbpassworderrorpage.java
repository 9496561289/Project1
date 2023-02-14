package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbpassworderrorpage {
	WebDriver driver;
	
	By forgottenlink=By.xpath("//*[contains(text(),'Forgotten password?')]");
	By forgottenpasswrdmobile=By.id("identify_email");
	By forgottenpasswrdsearch=By.name("did_submit");
	
	public void linkclick()
	{
		driver.findElement(forgottenlink).click();
	}
	public  Fbpassworderrorpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String mobilenumber)
	{
		driver.findElement(forgottenpasswrdmobile).sendKeys(mobilenumber);
	}
	public void click()
	{
		driver.findElement(forgottenpasswrdsearch).click();
	}
	 
	  
}

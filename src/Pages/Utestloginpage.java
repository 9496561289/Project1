package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utestloginpage {
	WebDriver driver;
	 
	  By Uusername=By.id("username");
	  By Upassword=By.id("password");
	  By Ulogin=By.name("login");
	  
	  public  Utestloginpage(WebDriver driver)
	  {
	  	this.driver=driver;
	  }
	  public void setvalues(String username,String password)
	  {
	  	driver.findElement(Uusername).sendKeys(username);
	  	driver.findElement(Upassword).sendKeys(password);
	  }
	  public void login()
	  {
	  	driver.findElement(Ulogin).click();
	  	}

}

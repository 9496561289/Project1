package TestNg;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
@BeforeTest
public void setup()
{
	//browser open
	
}
@BeforeMethod
public void urlloading()
{
	//url
	
}
@Test(priority=1,invocationCount=3,dependsOnMethods = {"test2"})
public void test1()
{
	//test activity
	System.out.println("hello");
}
@Test(priority=3,enabled=false)
public void test2()
{
	//test activity
}
@Test(priority=2,enabled=false)
public void test3()
{
	//test activity
}
@AfterMethod
public void aftermethod()
{
	//report details
}
@AfterTest
public void browserquit()
{
	//browser close
}

}

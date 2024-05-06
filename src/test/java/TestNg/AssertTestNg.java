package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestNg {
	

	@Test
	public void Script() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		SoftAssert a= new SoftAssert();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		//Assert.assertEquals("Facebook – log in or sign up1", driver.getTitle());// Hard Assertions.\
		a.assertEquals("Facebook – log in or sign up1", driver.getTitle());
		System.out.println("After Assertiojn");
	
		a.assertAll();
		
		
		
		
	}
}

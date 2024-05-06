package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGEx1 {
	
	
	
	@Test
	public void Script() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://automationbykrishna.com/");
		
	}

}

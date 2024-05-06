package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAssign {

	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		
	  }
	
	
	@Test(dataProvider = "data")
	public void login(String UserId,String Pwd) throws InterruptedException
	{
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(UserId);
		driver.findElement(By.id("passwd")).sendKeys(Pwd);
	}
	@DataProvider(name="data")
	public Object[][] getData()
	{
		return new Object[][] {{"Priya@yahoo.com","123@eug"}};
	}
	@AfterTest
	public void AfterTest()
	{
		driver.close();
	}
}

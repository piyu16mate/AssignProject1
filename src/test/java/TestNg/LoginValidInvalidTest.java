package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginValidInvalidTest {

	@Test(dataProvider = "data")
	public void Login(String user,String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://automationbykrishna.com/");
		driver.findElement(By.id("registration2")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='unameSignin']")).sendKeys(user);
		
		driver.findElement(By.xpath("//input[@id='unameSignin']//following-sibling::input[@id='pwdSignin']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@id='btnsubmitdetails']//preceding-sibling::input[@id='rememberme']")).click();
		driver.findElement(By.xpath("//div[@class='col-lg-4']//child::button[@id='btnsubmitdetails']")).click();
	}
	@DataProvider(name = "data")
	public Object[][] getValidData()
	{
		return new Object[][]{{"Priya@yahoo.com","3y45bsjf"},{"Sujit@gmail.com","34ndj"},{"Kevin@yahoo.com","u586nj"}};
	}
	
	@DataProvider(name="inavalid data")
	public Object[][] getInvalidData()
	{
		return new Object[][]{{".com","3y45bsjf"},{"nsd","34ndj"},{"sndjf","u586nj"}};
	}
}

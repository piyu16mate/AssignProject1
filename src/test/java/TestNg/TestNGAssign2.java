package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class TestNGAssign2 {

	
	WebDriver driver;
	
	/*@BeforeTest
	public void beforeTest() throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		
	  }*/
	
	@Test(groups = {"Smoke"})
	public void ClickForm() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
	//driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]")).click();
	WebElement element=	driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]"));
	js.executeScript("arguments[0].click();", element);
	PracticeForm();
	}
	
	@Test(groups = {"Smoke"})
	public void PracticeForm() throws InterruptedException
	{
		driver.findElement(By.xpath("(//div[@class='element-group']//child::li[@id='item-0'])[2]")).click();
	//fillForm();
		
	
	}
	@Test(dependsOnMethods = {"ClickForm"} ,groups= {"Regression"})
	public void fillForm() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.findElement(By.id("firstName")).sendKeys("sneha");
		driver.findElement(By.id("lastName")).sendKeys("verma");
		
		driver.findElement(By.id("userEmail")).sendKeys("lsneha@yahoo.com");
		//WebDriverWait wait= new WebDriverWait(driver,30);
	JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scroll(0,1300)");
		WebElement element=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
		
		if(element.isEnabled())
		js.executeScript("arguments[0].click();", element);
		
		driver.findElement(By.id("userNumber")).sendKeys("8600181545");
		WebElement obj2=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		js.executeScript("arguments[0].click();", obj2);
		driver.findElement(By.id("currentAddress")).sendKeys("Venkatesh Imspf,Pune");
		
	WebElement submitBtn=driver.findElement(By.xpath("//button[@id='submit']"));
js.executeScript("arguments[0].scrollIntoView();", submitBtn);
submitBtn.click();
	}
/*	@AfterTest
	public void AfterTest()
	{
		driver.close();
	}*/
}

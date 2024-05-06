package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReportsEx {
	@Test
	public void m1() throws InterruptedException
	{
	ExtentReports report= new ExtentReports("./Reports/TestCase1.html");
	ExtentTest Test= report.startTest("Login");
	
	System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://facebook.com/");
	Test.log(LogStatus.PASS, "Launched the Application");
	report.endTest(Test);
	report.flush();
	driver.close();
	}
	


}

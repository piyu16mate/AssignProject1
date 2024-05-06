package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssign3 {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		
	  }
	@Test
	public void login() throws InterruptedException, IOException
	{
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		File file= new File("E:\\priya\\resources\\AssignData.xlsx");
		FileInputStream fileIO= new FileInputStream(file);
		XSSFWorkbook work=new XSSFWorkbook(fileIO);
		XSSFSheet sheet= work.getSheet("UserData");
		int totalRows=sheet.getLastRowNum();
		int totalcols=sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=totalRows;i++)
		{
				XSSFRow row=sheet.getRow(i);
				
				for(int j=0;j<totalcols;)
				{
					
					if(row.getCell(j).getCellType()==CellType.STRING)
					{
						//System.out.println(row.getCell(j).getStringCellValue());
						String User=row.getCell(j).getStringCellValue();
						driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(User);
						j++;
						String pwd=row.getCell(j).getStringCellValue();
						driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
						driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
						Thread.sleep(2000);
						
					}
				
				
				
				}
		}	
				
			
		
		work.close();
		
		
	}
}

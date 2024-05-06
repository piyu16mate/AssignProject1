package TestNg;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Assign4POM {
	
	WebDriver driver;
	@FindBy(xpath="//a")
	private WebElement header;
	
	@FindBy(xpath="")
	private WebElement pwd;
	
	
	@Test
	public void DisplayHeader(String Headers) {
		
		Headers=this.header.getText();
		System.out.println(Headers);
		
		
	}
		
	
	Public Assign4POM()
		{
			PageFactory.initElements(driver, Assign4POM.class);
			return null;
			
		}
		

}

package TestNg;

import javax.sound.sampled.TargetDataLine;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGdataProvider {
	
	@Test(dataProvider = "data")
	public void login(String User,String Pwd) {
		
		System.out.println("Username and Password is="+User+"AND"+Pwd);
		
		}
	
	@DataProvider(name="data")
	
	public Object[][]getData()
	{
		return new Object[][] {{"Priya","12345"},{"Kevin","345nenfgnd"},{"Sujit","7589jfghd"}};
	}

}

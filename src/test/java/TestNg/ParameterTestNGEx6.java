package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterTestNGEx6 {
	
	@Test
	@Parameters({"User","Password"})
	public void login(String UserName,String Password)
	{
		System.out.println("UserName is"+UserName);
		System.out.println("Password is"+Password);
		
	}
	
	
		
	}



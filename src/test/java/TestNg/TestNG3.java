package TestNg;

import org.testng.annotations.Test;

public class TestNG3 {

	@Test(dependsOnMethods = {"Registration"})
	public void Login()
	{
		System.out.println("Login");
	}
	@Test(priority = 1)
	public void Registration()
	{
		System.out.println("Registration");
	}
	
	
	@Test(priority = 0)
	public void checkOut()
	{
		System.out.println("Checkout");
	}
}

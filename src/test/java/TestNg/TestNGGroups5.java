package TestNg;

import org.testng.annotations.Test;

public class TestNGGroups5 {

	@Test(groups = {"Smoke"})
	public void Login()
	{
		System.out.println("Login");
	}
	@Test(groups = {"sanity"})
	public void Registration()
	{
		System.out.println("Registration");
	}
	
	
	@Test(groups = {"Regression"})
	public void checkOut()
	{
		System.out.println("Checkout");
	}
	@Test(groups = {"Regression"})
	public void Home()
	{
		System.out.println("Home");
	}
	@Test(groups = {"Regression"})
	public void SendMoney()
	{
		System.out.println("SendMoney");
	}
	@Test(groups = {"Regression"})
	public void Payout()
	{
		System.out.println("Payout");
	}
	
}

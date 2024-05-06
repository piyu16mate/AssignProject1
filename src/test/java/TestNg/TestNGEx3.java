package TestNg;

import org.testng.annotations.Test;

public class TestNGEx3 {

//	@Test(timeOut = 500)
	//public void m1() throws InterruptedException
//	{
//		Thread.sleep(500);
//		System.out.println("Timeout Concept");
//	}
	@Test(invocationCount = 5)
	public void m2()
	{
		System.out.println("m2");
	}
}


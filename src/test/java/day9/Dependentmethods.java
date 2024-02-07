package day9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependentmethods {
	 
	@Test(priority=1)
	void openApp()
	{
//		System.out.println("open the application successfully");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"openApp"})
	void Login()
	{
//		System.out.println("Login into the page");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,dependsOnMethods= {"Login"})
	void Search()
	{
//		System.out.println("Searching the T-Shirts");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods= {"Login","openApp"})
	void Advanced()
	{
//		System.out.println("Advanced Searching");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"Login"})
	void Logout()
	{
//		System.out.println("Logout is completed");
		Assert.assertTrue(true);
	}

}

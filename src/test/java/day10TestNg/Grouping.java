package day10TestNg;

import org.testng.annotations.Test;

public class Grouping {
	/*
	loginByEmail  - sanity & regression
	loginByfacebook - sanity
	loginBytwitter  - sanity

	signupbyemail - sanity & regression
	signupbyfacebook  - regression
	signupbytwitter  - regression

	paymentinrupees - sanity & regression
	paymentindollar - sanity  
	paymentReturnbyBank  - regression
	*/
	
	@Test(priority=1,groups= {"sanity","regression"})
	void Login1()
	{
		System.out.println("Login to Email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void Login2()
	{
		System.out.println("Login to Facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void Login3()
	{
		System.out.println("Login to Twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void Signup1()
	{
		System.out.println("Signup to Email");
	}
	
	@Test(priority=5, groups= {"regression"})
	void Signup2()
	{
		System.out.println("Signup to facebook");
	}
	
	@Test(priority=6, groups= {"regression"})
	void Signup3()
	{
		System.out.println("Signup to Twitter");
	}
	
	@Test(priority=7,groups= {"sanity","regression"})
	void Ruppes()
	{
		System.out.println("Indian Ruppes");
	}
	
	@Test(priority=8, groups= {"sanity"})
	void Dollers()
	{
		System.out.println("American Dollers");
	}
	
	@Test(priority=9, groups= {"regression"})
	void ReturnBank()
	{
		System.out.println("Return to the Bank");
	}
}

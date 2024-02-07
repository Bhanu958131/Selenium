package loginandannotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsMethod {
	
	@BeforeMethod
	void dog()
	{
		System.out.println("Dog is Boww....");
	}
	
	@Test
	void test1()
	{
		System.out.println("this is test 1");
	}
	
	@Test
	void test2()
	{
		System.out.println("this is test2");
	}
	
	@AfterMethod
	void cat()
	{
		System.out.println("cow is Meow.....");
	}

}

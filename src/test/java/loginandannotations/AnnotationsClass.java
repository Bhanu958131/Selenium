package loginandannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsClass {
	
	@BeforeClass
	void eat()
	{
		System.out.println("eating the chicken");
	}
	
	@Test
	void test1()
	{
		System.out.println("testing1");
	}
	
	@Test
	void test2()
	{
		System.out.println("testing2");
	}
	
	@AfterClass
	void dance()
	{
		System.out.println("Dancing");
	}

}

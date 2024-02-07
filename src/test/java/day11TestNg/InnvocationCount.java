package day11TestNg;

import org.testng.annotations.Test;

public class InnvocationCount {
	
	@Test(invocationCount=100)
	void print()
	{
		System.out.println("this is printing statement");
	}

}

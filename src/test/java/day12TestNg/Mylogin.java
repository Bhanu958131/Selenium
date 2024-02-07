package day12TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylogin implements ITestListener {

	public void onTestStart(ITestResult result)
	{
		System.out.println("This is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This test is success");
	}
	
	public void onTestFaliure(ITestResult result)
	{
		System.out.println("this test is failure");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("This test is skipped");
	}
	
	public void onFinished(ITestContext context)
	{
		System.out.println("This test is Finished");
	}
}

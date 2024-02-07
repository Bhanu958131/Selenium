package day12TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void test1() 
  {
	  Assert.assertEquals(1, 1);
  }
  
  @Test(priority=2)
  void test2()
  {
	  Assert.assertEquals("A", "a");
  }
  
  @Test(priority=3,dependsOnMethods="test2")
  void test3()
  {
	  Assert.assertEquals(1, 1);
  }
}

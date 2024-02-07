package loginandannotations;

//import org.testng.annotations.Test;
import org.testng.annotations.*;

public class NewTest {
  @Test
  public void first() 
  {
	  System.out.println("My first case");
  }
  
  @Test
  void second()
  {
	  System.out.println("my second case");
  }
  
  @Test
  void third()
  {
	  System.out.println("my third case");
  }
}

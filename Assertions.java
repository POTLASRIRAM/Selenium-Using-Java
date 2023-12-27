package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	//We have two types of Assertions : 1)Soft Assertions 2)Hard Assertions
  @Test
  public void f() {
	  //Hard Assertions
	  int x=10;
	  int y=20;
	  System.out.println("This is Before Hard Assertions");
	  Assert.assertNotEquals(x, y);
	  System.out.println("This is After Hard Assertions");
  }
}

package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertNotNull08 {
  @Test
  public void f() {
	  Object a= "Hi";
	  System.out.println("Assert Not Null started");
	  Assert.assertNotNull(a, "Assert Not Null failed");
	  System.out.println("Assert Not Null completed");
  }
}

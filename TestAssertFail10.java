package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertFail10 {
  @Test
  public void f() {
	  Object a= null;
	  System.out.println("Assert Null started");
	  Assert.assertNull(a, "Assert Null failed");
	  System.out.println("Assert Null completed");
	  Assert.fail("Assert failed");
  }
}

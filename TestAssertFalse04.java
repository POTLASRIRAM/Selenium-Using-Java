package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertFalse04 {
  @Test
  public void f() {
	  System.out.println("Assert false started");
	  Assert.assertFalse(45<29, "Assert false failed");
	  Assert.assertFalse("Hi".equals("hello"),"Assert false failed");
	  System.out.println("Assert false completed");
  }
}

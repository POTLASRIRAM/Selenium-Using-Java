package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertTrue03 {
  @Test
  public void f() {
	  System.out.println("Assert true started");
	  Assert.assertTrue(45>29, "Assert true failed");
	  System.out.println("Assert true completed");
  }
}

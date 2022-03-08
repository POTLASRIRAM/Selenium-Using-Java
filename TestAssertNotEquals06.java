package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertNotEquals06 {
  @Test
  public void f() {
	  System.out.println("Assert Not Equals started");
	  Assert.assertNotEquals(10,20,"Assert Not Equals failed");
	  System.out.println("Assert Not Equals completed");
  }
}

package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertEquals05 {
  @Test
  public void f() {
	  System.out.println("Assert equals started");
	  Assert.assertEquals(45,45, "Assert equals failed");
	  Assert.assertEquals("Hi","Hi","Assert equals failed");
	  System.out.println("Assert equals completed");
  }
}

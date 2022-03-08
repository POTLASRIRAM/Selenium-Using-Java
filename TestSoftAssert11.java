package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssert11 {
	SoftAssert sa= new SoftAssert();
  @Test(priority=1)
  public void f() {
	  System.out.println("Test11 started");
	  sa.assertTrue(10>100);
	  System.out.println("Test11 completed");
	  System.out.println("Test12 started");
	  sa.assertFalse(10>100);
	  System.out.println("Test12 completed");
	  sa.assertAll();
  }
}

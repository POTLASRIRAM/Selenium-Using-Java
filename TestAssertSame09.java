package assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertSame09 {
  @Test
  public void f() {
	  Object a= new Object();
	  Object b=a;
	  System.out.println("Assert same started");
	  Assert.assertSame(a,b);
	  System.out.println("Assert same completed");
  }
}

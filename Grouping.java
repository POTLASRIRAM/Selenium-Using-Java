package testNG;

import org.testng.annotations.Test;

public class Grouping {
  //Grouping -- Used to execute particular test cases
	
	@Test(groups={"first"})
	void firstMethod() {
		System.out.println("This is first method");
	}
	@Test(priority=1)
	void secondMthod() {
		System.out.println("This is second method");
	}
	@Test(groups= {"first","second","third"})
	void thirdMethod() {
		System.out.println("This is third Method");
	}
}

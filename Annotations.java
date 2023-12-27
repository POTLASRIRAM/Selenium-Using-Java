package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
	WebDriver driver=new ChromeDriver();
	 @Test(priority=1)
	  public void login() {
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		  driver.findElement(By.xpath("//button[@id='submit']")).click();
		  System.out.println("This is from Annotations class....");
	  }
	  @BeforeClass
	  public void openApp() {
		  
			driver.manage().window().maximize();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
		  
	  }

	  @AfterClass
	  public void closeApp() {
		  driver.close();
	  }
	  @BeforeMethod
	  void beforeMethod() {
		  System.out.println("This is before Test Method");
		  }
	  
	  @AfterMethod
	  void afterMethod() {
		  System.out.println("This is after Test Method");
	  }
	  @BeforeTest
	  void beforeTest() {
		  System.out.println("This is before test");
		  
	  }
	  @BeforeSuite
	  void beforeSuite() {
		  System.out.println("This is before Suite");
	  }
	  //@AfterSuite
	  void afterSuite() {
		  System.out.println("This is after Suite");
	  }
	  
	  

}

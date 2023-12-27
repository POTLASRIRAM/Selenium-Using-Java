package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependency {
	
	
	WebDriver driver=new ChromeDriver();
	 @Test(priority=1,dependsOnMethods = "openApp")
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
			Assert.assertTrue(true);
		  
	  }

	  @AfterClass
	  public void closeApp() {
		  driver.close();
}
}

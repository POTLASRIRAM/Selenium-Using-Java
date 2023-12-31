package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvocationCount {
	
	WebDriver driver = new ChromeDriver();
  @Test(invocationCount=5)
  public void f() {
	  driver.manage().window().maximize();
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  System.out.println("Login successful..");
		
  }
}

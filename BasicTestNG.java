package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BasicTestNG {
	
	WebDriver driver=new ChromeDriver();
  @Test(priority=1)
  public void login() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
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

}

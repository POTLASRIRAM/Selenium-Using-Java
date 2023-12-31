package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	  @Test
	  @Parameters({"browser","URL"})
	  public void f(String br,String url) {
		  if(br.equals("Chrome")) {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		  driver.findElement(By.xpath("//button[@id='submit']")).click();
		  System.out.println("Login successful..");
		  driver.close();
		  }
		  if(br.equals("Firefox")) {
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();
			  driver.get(url);
			  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
			  driver.findElement(By.xpath("//button[@id='submit']")).click();
			  System.out.println("Login successful..");
			  driver.close();
		  }
		  else {
			  driver = new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.get(url);
			  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
			  driver.findElement(By.xpath("//button[@id='submit']")).click();
			  System.out.println("Login successful..");
			  driver.close();
		  }
			
	  }
}

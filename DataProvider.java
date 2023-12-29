package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver=new ChromeDriver();
	
	  @Test(priority=1,invocationCount=2,dataProvider="data")
	  public void login(String username,String password) {
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		  driver.findElement(By.xpath("//button[@id='submit']")).click();
		  System.out.println("Login successful..");
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
	  @org.testng.annotations.DataProvider(name="data",indices = {0})
	  String [][] loginCredentials(){
		  String data[][]= {{"student","Password123"},{"stu","123"},{"johnnn","cena"},{"peter","peter123"},{"macron","mm34567"}};
		return data;
		  
	  }
}

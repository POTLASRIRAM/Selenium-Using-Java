package pageObjectModel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PageObjectModelLogin {
	Login in;
	LoginPageFactory lpf;
	WebDriver driver;
  @Test
  public void loginTest() {
	  in.setUsername("student");
	  in.setPassword("Password123");
	  String title = in.submit();
	  System.out.println(title);
	  Assert.assertEquals(title,"Logged In Successfully | Practice Test Automation");
  }
  @BeforeClass
  @Parameters({"browser"})
  public void openWebsite(String br) {
	  if(br.equals("Chrome")) {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  in = new Login(driver);
	  }
	  else if(br.equals("Firefox")) {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://practicetestautomation.com/practice-test-login/");
		  in = new Login(driver);
	  }
	  else if(br.equals("Edge")) {
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://practicetestautomation.com/practice-test-login/");
		  in = new Login(driver);
	  }
	  
  }

  @AfterClass
  public void shutdownWebsite() {
	  driver.quit();
  }

}

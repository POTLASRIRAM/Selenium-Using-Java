package day21;

import java.util.*;
import java.time.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {
	
	public static void main(String []args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit() commands -- added at the begining of the url
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//ExplicitWait() command -- adds wait time for each web element
		// We have two ways to implement this 1)Declaration 2) Usage
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Declaration
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='H6-NpN _3N4_BX']")));
		
		driver.quit();
	}

}

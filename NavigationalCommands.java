package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationalCommands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // amzon
		Thread.sleep(4000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // flipkart
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.quit();

	}

}

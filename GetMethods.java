package day20;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class GetMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//We have the following get commands
		//get(url)
		//getURL()
		//getPageSource()
		//getTitle()
		//getWindowHandle()
		//getWindowHandles()
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//get(URL) to open a webpage
		driver.get("https://www.flipkart.com/all/~cs-b5d63d86829a57666c30c4f519cd2144/pr?sid=reh,4d7,x9i&marketplace=FLIPKART&restrictLocale=true");
		
		//getTitle() to get current page title
		System.out.println(driver.getTitle());
		
		//getURL() to get current page url
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() to get current page source
		String ps=driver.getPageSource();
		
		ps.contains("Amazon"); // To check particular element in the page source code
		
		//getWindowHandle() to get current page window ID 
		
		String winid = driver.getWindowHandle();
		System.out.println("Window ID : "+ winid);
		
		
		//getWindowHandles() returns set of multiple pages windowID's which can be further used to navigate to that pages and perform automation operations
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
		
		Set<String> winids = driver.getWindowHandles();
		
		Thread.sleep(3000);
		
		for(String wi : winids) {
			System.out.println("Windows IDs :"+ wi);
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}

package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://demo.guru99.com/V4/"); 
		JavascriptExecutor js = driver;
		//Scroll to a certain pixels
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		js.executeScript("window.scrollBy(0,200)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll down untill the element is reached
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://en.wikipedia.org/wiki/India");
		WebElement ele = driver.findElement(By.xpath("//span[@id='Medieval_India']"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		//To comeback to page top
		js.executeScript("window.scrollBy,-document.body.scrollHeight");
		
		//Scroll to end of page
		js.executeScript("window.scrollBy,document.body.scrollHeight");
		
		Thread.sleep(3000);
		driver.quit();

	}

}

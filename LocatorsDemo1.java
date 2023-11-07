package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open app
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize(); // maximize browser window
				
				//Finding number of sliders on home page	
				List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
				System.out.println("Number of sliders:"+sliders.size());
				
				//Find Total number of images in home page
				
				List<WebElement> images=driver.findElements(By.tagName("img"));
				System.out.println("Total number of images:"+images.size());
				
				//Find total number of links
				List<WebElement> links=driver.findElements(By.tagName("a"));
				System.out.println("Total number of links:"+ links.size());
				
				
				driver.quit();
				

	}

}

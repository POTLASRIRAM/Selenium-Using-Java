package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class CheckBoxes {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//Handling check boxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		Thread.sleep(3000);
		//Selecting one checkboxes
		/*for(int i=0;i<checkboxes.size();i++) {
			if(i<1) {
			checkboxes.get(i).click();
			System.out.println("Selected successfully...");
		     }
		}*/
		
		//Selecting multiple checkboxes
		int cbs = checkboxes.size();
		for(int i=0;i<cbs;i++) {
			Thread.sleep(3000);
			WebElement click = checkboxes.get(i);
			click.click();
			System.out.println("Selected successfully..." + click);
		    
		}
		//Unselecting selected checkboxes
		for(int i=0;i<cbs;i++) {
			Thread.sleep(3000);
			WebElement click = checkboxes.get(i);
			click.click();
			System.out.println("Selected Unsuccessfully..." + click);
		    
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}

package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		//Tag and id
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Men's shirts");
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		driver.findElement(By.id("nav-search-submit-button")).click();
		

	}

}

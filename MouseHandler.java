package day25;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandler {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));                                                              
		driver.manage().window().maximize();
		//driver.get("http://demo.guru99.com/test/newtours/");
		Actions act = new Actions(driver);
		//Mouse hover
		//WebElement hover = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		//act.moveToElement(hover).perform();
		
		//Right click
		//WebElement right_click = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		//act.contextClick(right_click).perform();
		
		//Double click
		//WebElement double_click = driver.findElement(By.xpath("//a[normalize-space()='Hotels']"));
		//act.doubleClick(double_click).perform();
		
		//Drag and drop
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='column-b']"));
		act.dragAndDrop(source, destination).perform();
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}

package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://the-internet.herokuapp.com/key_presses");  
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@id='target']"));
		act.sendKeys(Keys.TAB).perform();
        Thread.sleep(3000);
        driver.quit();
	}

}
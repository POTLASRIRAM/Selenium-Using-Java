package day22;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert promptAlert = driver.switchTo().alert();
		String promptText = promptAlert.getText();
		Thread.sleep(3000);
		promptAlert.sendKeys("Selenium");
		Thread.sleep(4000);
		promptAlert.accept();
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}

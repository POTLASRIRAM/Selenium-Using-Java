package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}

}

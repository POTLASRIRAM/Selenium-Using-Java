package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://demo.guru99.com/V4/"); 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Using JS executeScript() method to send login credentials
		WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
		js.executeScript("arguments[0].setAttribute('value','mngr544562')", username);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		js.executeScript("arguments[0].setAttribute('value','agEtaty')",password);
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		js.executeScript("arguments[0].click();",login);
		Thread.sleep(2000);
		driver.quit();

	}

}

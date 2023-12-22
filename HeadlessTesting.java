package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args)throws Exception {
		// Headless Testing
		ChromeOptions options = new ChromeOptions();
		options.setHeadless();	
        WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
	    driver.manage().window().maximize();
		
	    Thread.sleep(5000);
		WebElement Email = driver.findElement(By.name("Email"));
		Email.clear();
		Email.sendKeys("admin@yourstore.com");
		
		WebElement Password = driver.findElement(By.name("Password"));
		Password.clear();
		Password.sendKeys("admin");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		String act_title = driver.getTitle();
		String exp_title = act_title;
		
		if(act_title.equals(exp_title)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		WebElement act_value = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1"));
		
		WebElement exp_value= act_value;
		
		if(act_value.equals(exp_value)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/nav/div/ul/li[3]/a")).click();
		
		Thread.sleep(3000);
		System.out.println("Two test cases passed, closing the browser...");
		driver.quit();

	}

}

package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncorrectCredentials {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("sp@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("Password");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String error_message = driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']")).getText();
		if(error_message.equals("Your email or password is incorrect!")) {
			System.out.println("In login error page..");
		}
		else {
			System.out.println("Not in login error page..");
		}
		driver.quit();
		

	}

}

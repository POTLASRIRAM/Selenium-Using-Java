package AutomationPractice;

import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.chrome.*;

public class RegisterUser {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to url
		driver.get("https://automationexercise.com/");
		String homepagetitle = driver.getTitle(); //Verify that home page is visible successfully
		String exp_title = "Automation Exercise";
		if(exp_title.equals(homepagetitle)) {
			System.out.println("Home page is visible...");
		}
		else {
			System.out.println("Home page is not visible..");
		}
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();//Click on 'Signup / Login' button
		String new_user = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();//Verify 'New User Signup!' is visible
		String exp_new_user = "New User Signup!";
		if(exp_new_user.equals(new_user)) {
			System.out.println("New user is visible...");
		}
		else {
			System.out.println("New user is not visible..");
		}
		//Enter name and email address
		driver.findElement(By.name("name")).sendKeys("John");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("john123@gmail.com");
		//Click 'Signup' button
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
		//Verify that 'ENTER ACCOUNT INFORMATION' is visible
		String enter_account = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']")).getText();
		String exp_account = "New User Signup!";
		if(enter_account.equals(exp_account)) {
			System.out.println("Enter account is visible...");
		}
		else {
			System.out.println("Enter account is not visible..");
		}
		
		Thread.sleep(4000);
		driver.quit();

	}

}

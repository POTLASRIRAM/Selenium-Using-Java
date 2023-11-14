package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(1000);
		
		//Automating signin using xpath locators
		//Finding signin button using full xpath
		
		String Sigintext=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).getText();
		System.out.println(Sigintext);
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span/span")).click();
		String act_val = driver.getTitle();
		String exp_val = "Amazon Sign-In";
		//Checking if the page opened is signin or not
		if(exp_val.equals(act_val)) {
			System.out.println("Page opened is Signin");
		}
		else {
			System.out.println("Wrong page");
			driver.quit();
		}
		System.out.println("Login page title : "+act_val);
		Thread.sleep(1000);
		//Providing email and password
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("......");
		System.out.println("Email Entered");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(".......");
		System.out.println("Password Entered");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		String homepage=driver.getTitle();
		String exp_homepage="Amazon.com. Spend less. Smile more.";
		if(homepage.equals(exp_homepage)) {
			System.out.println("Login Successful");
		    System.out.println("Entered into homepage...");
		}
		else {
			System.out.println("Wrong page");
			driver.quit();
		}
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}

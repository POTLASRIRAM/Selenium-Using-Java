package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	//This is using normal method
	WebDriver driver;
	//Constructor
	Login(WebDriver driver){
		this.driver = driver;
	}
	
	//Selectors
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By submit = By.xpath("//button[@id='submit']");
	
	//Action methods
	public void setUsername(String user_name) {
		driver.findElement(username).sendKeys(user_name);
	}
	public void setPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	public String submit() {
		driver.findElement(submit).click();
		String title = driver.getTitle();
		return title;
	}

}

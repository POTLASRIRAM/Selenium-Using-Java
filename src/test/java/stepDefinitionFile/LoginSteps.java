package stepDefinitionFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	WebDriver driver;
	@Given("the user opened the app")
	public void the_user_opened_the_app() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://demo.nopcommerce.com/");
	    
	}

	@Given("the user navigated to login page")
	public void the_user_navigated_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    
	}

	@When("user entered valid username and valid password\\(username : {string}, password : {string})")
	public void user_entered_valid_username_and_valid_password_username_password(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	    
	}

	@When("user clicked on submit button")
	public void user_clicked_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	    
	}

	@Then("user should see login successful")
	public void user_should_see_login_successful() {
	    // Write code here that turns the phrase above into concrete actions
		String myAccount = driver.findElement(By.xpath("//a[@class='ico-account']")).getText();
	    if(myAccount.equals("My account")) {
	    	Assert.assertTrue(true);
	    	driver.quit();
	    }
	    else {
	    	Assert.fail();
	    }
	    
	}


}

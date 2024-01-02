package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	//Constructor
	LoginPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, driver);
	}
	
	//Selectors
	@FindBy(xpath="//input[@id='username']")
	WebElement un;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passd;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement st;
	
	//Action methods
	/*public void setUname(String user_name) {
		un.sendKeys(user_name);
	}
	public void setPwd(String pswd) {
		passd.sendKeys(pswd);
	}
	public String setLogin() {
		st.click();
		String title = driver.getTitle();
		return title;
	}*/
	public void setUname1(String user_name) {
		// TODO Auto-generated method stub
		un.sendKeys(user_name);
		
	}

	public void setPwd(String pswd) {
		// TODO Auto-generated method stub
		passd.sendKeys(pswd);
	}

	public String setLogin() {
		// TODO Auto-generated method stub
		st.click();
		String title = driver.getTitle();
		
		return title;
	}
	
	

}

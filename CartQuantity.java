package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartQuantity {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/products");
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
	    driver.findElement(By.xpath("//input[@id='quantity']")).clear();
	    driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("4");
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement cart = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a"));
	    js.executeScript("arguments[0].click()", cart);
	    Thread.sleep(2000);
	    String cart_quantity = driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[4]/button")).getText();
	    if(cart_quantity.equals("4")) {
	    	System.out.println("Cart Quantity updated");
	    }
	    else {
	    	System.out.println("Cart Quantity not updated");
	    }
		Thread.sleep(3000);
		driver.quit();

	}

}

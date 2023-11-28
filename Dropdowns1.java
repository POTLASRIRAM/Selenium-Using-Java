package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bstackdemo.com/");
		driver.manage().window().maximize();
		//Drop downs without select tags
		driver.findElement(By.xpath("//div[@class='sort']//select")).click();
		List<WebElement> drpval = driver.findElements(By.cssSelector("select option"));
		for(int i=0;i<drpval.size();i++) {
			String dpval = drpval.get(i).getText();
			if(dpval.equals("Lowest to highest")) {
				drpval.get(i).click();
				Thread.sleep(4000);
				System.out.println("Successfully selected.....");
			}
			
		}
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}

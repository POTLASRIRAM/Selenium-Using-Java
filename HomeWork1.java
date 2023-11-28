package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWork1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		//Drop downs without select tags
		
		//select country
				driver.findElement(By.id("country-list")).click(); //click on Select country drop down
				List<WebElement> country=driver.findElements(By.xpath("//select[@id='country-list']//option")); // capture all countries
				
				System.out.println(country.size()); // Count number of countries
				
				for(WebElement opt:country) // Select country
				{
					if(opt.getText().equals("France"))
					{
						opt.click();
							break;
					}
				}
				
				Thread.sleep(3000);
				
				//Now select state
				driver.findElement(By.id("state-list")).click(); //click on Select state drop down
				List<WebElement> states=driver.findElements(By.xpath("//select[@id='state-list']//option")); // capture all states
				
				System.out.println(states.size()); // Count number of states
				
				for(WebElement opt:states) // Select country
				{
					if(opt.getText().equals("Alsace"))
					{
						opt.click();
						break;
					}
				}
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}

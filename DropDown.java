package AutomationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");  
		List<WebElement> countries = driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select/option"));
		System.out.println(countries.size());
		for(WebElement con : countries) {
			String country = con.getText();
			if(country.equals("India")) {
				con.click();
				System.out.println("Successfully selected...");
				break;
			}
		}
		 Thread.sleep(2000);
		 driver.quit();
	}

}

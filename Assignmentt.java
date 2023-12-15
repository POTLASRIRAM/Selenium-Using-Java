package day24;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentt {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Selecting drop downs
		List<WebElement> dep_city = driver.findElements(By.xpath("//select[@name='fromPort']//option"));
		for(WebElement dp : dep_city) {
			//System.out.println("Departure City :");
			//System.out.println(dp.getText());
			if(dp.getText().equals("Boston")) {
				dp.click();
			}
		}
		List<WebElement> des_city = driver.findElements(By.xpath("//select[@name='toPort']//option"));
		for(WebElement ds : des_city) {
			//System.out.println("Destination City :");
			//System.out.println(ds.getText());
			if(ds.getText().equals("London")) {
				ds.click();
			}
		}
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Checking if the page meets expected pagee
		String page_title = driver.getTitle();
		System.out.println(page_title);
		if(page_title.equals("BlazeDemo - reserve")) {
			System.out.println("Successfully matched with expected page...");
		}
		else
		{
			driver.quit();
		}
		
		//Getting all the fares for selected route
		ArrayList<Float> prices = new ArrayList();
		for(int i=1;i<=5;i++) {
			String price = driver.findElement(By.xpath("//table//tr["+i+"]/td[6]")).getText();
			String pri = price.replace("$","");
			float pr = Float.parseFloat(pri);
			prices.add(pr);
			//System.out.println(pr);
		}
		System.out.println(prices);
		//Arrays.sort(prices);
		Thread.sleep(4000);
		driver.quit();
	}

}

package day26;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links count : "+ links.size());
		for(WebElement li : links) {
			String link = li.getText();
			System.out.println(link);
		}
		int worked_link =0;
		int broken_link =0;
		for(WebElement li : links) {
			String link = li.getAttribute("href");
			System.out.println(link);
			if(link == null || link.isEmpty()) {
				continue;
			}
			URL urllink = new URL(link);
			HttpURLConnection con = (HttpURLConnection)urllink.openConnection();
			con.connect();
			if(con.getResponseCode()>=400) {
				System.out.println("Broken Link.....");
				broken_link++;
			}
			else {
				System.out.println("Link worked.....");
				worked_link++;
			}
		}
		System.out.println("No of Worked links : "+worked_link);
		System.out.println("No of Broken links : "+broken_link);
		
		Thread.sleep(2000);
		driver.quit();
	}

}

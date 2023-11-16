package day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubHome {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		
		Thread.sleep(1000);

	}

}

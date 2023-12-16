import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day25 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));                                                              
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}

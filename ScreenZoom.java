package day25;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenZoom {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));                                                              
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		Point z = new Point(100,100);
		driver.manage().window().setPosition(z);
		Thread.sleep(2000);
		driver.quit();

	}

}

package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));                                                              
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		Actions act = new Actions(driver);
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2673\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(iframe);
		WebElement slider = driver.findElement(By.xpath("//div[@id='blue']//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("Initial location : "+slider.getLocation());
		Thread.sleep(4000);
		act.dragAndDropBy(slider, 10, 159).perform();
		Thread.sleep(4000);
		System.out.println("Post operation : "+slider.getLocation());
		driver.quit();

	}

}

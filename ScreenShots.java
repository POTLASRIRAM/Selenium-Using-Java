package day26;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();                                                                                            
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
		driver.get("https://www.amazon.com/");
		
		//Capture page screen shot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File pic = ts.getScreenshotAs(OutputType.FILE);
		File storage = new File("D:\\Selenium with Java\\seleniumproject\\src\\test\\java\\day26\\ss.png");
		FileUtils.copyFile(pic, storage);
		
		//Capture a particular webelement screenshot
		WebElement ele = driver.findElement(By.xpath("//div[@id=\"9c1153ad-0b7a-4c86-89ab-d36e5af9ff7c\"]/div[2]/div/ul/li[2]/span/a"));
		ele.getScreenshotAs(OutputType.FILE);
		File storagee = new File("D:\\Selenium with Java\\seleniumproject\\src\\test\\java\\day26\\ss1.png");
		FileUtils.copyFile(pic, storagee);
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}

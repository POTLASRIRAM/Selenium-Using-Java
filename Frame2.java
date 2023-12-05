package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hiiii..");
        WebElement iframe = driver.findElement(By.xpath("/html/body/center/iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.cssSelector("div.AB7Lab")).click();
        Thread.sleep(3000);
        driver.quit();


	}

}

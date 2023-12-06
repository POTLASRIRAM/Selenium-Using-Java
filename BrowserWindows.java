package day23;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> wids = driver.getWindowHandles();
        List<String> winids = new ArrayList(wids);
        String fwin = winids.get(0);
        String swin = winids.get(1);
        driver.switchTo().window(swin);
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]/button[1]")).click();
        driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("John");
        Thread.sleep(3000);
        driver.switchTo().window(fwin);
        Thread.sleep(2000);
        driver.quit();

	}

}

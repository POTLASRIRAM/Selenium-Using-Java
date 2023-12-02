package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String fst_alrt=driver.switchTo().alert().getText();
		System.out.println(fst_alrt);
		driver.switchTo().alert().accept();
		String scd_alrt=driver.switchTo().alert().getText();
		System.out.println(scd_alrt);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.quit();
	}

}

package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

public static void main(String[] args)throws Exception {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();

		WebElement ifcls = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(ifcls);
		
		String year = "2025";
		String month = "December";
		String date = "20";
		
		driver.findElement(By.id("datepicker")).click();
		while(true)
		{
		String frame_monthh = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]")).getText();
		String frame_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(frame_monthh.equals(month) && frame_year.equals(year))
		{
				System.out.println("Matched...");
				break;
		}
		else 
		{
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[2]/span")).click();
		}
		}
		List<WebElement> tdata = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr//td"));
		System.out.println(tdata.size());
		
		for(WebElement td : tdata) {
			if(td.getText().equals(date)) {
				td.click();
				System.out.println("Clciked");
				break;
			}
		}
				
		Thread.sleep(3000);
		driver.quit();
	}

}

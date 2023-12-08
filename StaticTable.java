package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1)Finding total no of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Row size :"+rows);
		
		//2)Finding total no of columns
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		System.out.println("Columns size :"+columns);
		
		//3)Reading specific row and column data
		String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[4]")).getText();
		System.out.println("Specific data :"+data);
		
		//4)Get all table data
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=columns;c++) {
				String tdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(tdata+" ");
			}
			System.out.println();
		}
		
		//5)Get data based on a value in table
		for(int r=2;r<=rows;r++) {
			
				String tdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[3]")).getText();
				if(tdata.equals("JAVA")|| tdata.equals("Java")) {
					String spd=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
					System.out.println("Matched data :"+spd);
				}
			
			
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}

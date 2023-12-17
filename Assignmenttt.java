
		package day24;                                                                                                                          
        
		import java.time.Duration;                                                                                                              
		import java.util.ArrayList;                                                                                                             
		import java.util.Arrays;
import java.util.Collections;
import java.util.List;                                                                                                                  
		                                                                                                                                        
		import org.openqa.selenium.By;                                                                                                          
		import org.openqa.selenium.WebDriver;                                                                                                   
		import org.openqa.selenium.WebElement;                                                                                                  
		import org.openqa.selenium.chrome.ChromeDriver;                                                                                         
		                                                                                                                                        
		public class Assignmenttt {                                                                                                              
		                                                                                                                                        
			public static void main(String[] args)throws Exception {                                                                            
				// TODO Auto-generated method stub                                                                                              
				WebDriver driver=new ChromeDriver();                                                                                            
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));                                                              
				driver.get("https://blazedemo.com/");                                                                                           
				driver.manage().window().maximize();                                                                                            
				Thread.sleep(4000);                                                                                                             
				//Selecting drop downs                                                                                                          
				List<WebElement> dep_city = driver.findElements(By.xpath("//select[@name='fromPort']//option"));                                
				for(WebElement dp : dep_city) {                                                                                                 
					//System.out.println("Departure City :");                                                                                   
					//System.out.println(dp.getText());                                                                                         
					if(dp.getText().equals("Boston")) {                                                                                         
						dp.click();                                                                                                             
					}                                                                                                                           
				}                                                                                                                               
				List<WebElement> des_city = driver.findElements(By.xpath("//select[@name='toPort']//option"));                                  
				for(WebElement ds : des_city) {                                                                                                 
					//System.out.println("Destination City :");                                                                                 
					//System.out.println(ds.getText());                                                                                         
					if(ds.getText().equals("London")) {                                                                                         
						ds.click();                                                                                                             
					}                                                                                                                           
				}                                                                                                                               
				driver.findElement(By.xpath("//input[@type='submit']")).click();                                                                
				                                                                                                                                
				//Checking if the page meets expected pagee                                                                                     
				String page_title = driver.getTitle();                                                                                          
				System.out.println(page_title);                                                                                                 
				if(page_title.equals("BlazeDemo - reserve")) {                                                                                  
					System.out.println("Successfully matched with expected page...");                                                           
				}                                                                                                                               
				else                                                                                                                            
				{                                                                                                                               
					driver.quit();                                                                                                              
				}                                                                                                                               
				                                                                                                                                
				int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
				System.out.println("number of rows in table:"+rows); //5
			
			//6 - capture prices then store in array
				
				String pricesArr[]=new String[rows];   //0-4
				
				for(int r=1;r<=rows;r++)
				{
					String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
					pricesArr[r-1]=price; //adding price into array
				}
				
			//7- Sort prices then find lower price value
				
				for(String arrvalue:pricesArr)
				{
					System.out.println(arrvalue);
				}
				
				Arrays.sort(pricesArr); // this will able to sort strings. so no need to convert to number
				String lowestPrice=pricesArr[0];
				System.out.println("Lower price:"+lowestPrice);
				
			//8- Find record in table having lower price
				
				for(int r=1;r<=rows;r++)
				{
					String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
					
					if(price.equals(lowestPrice))
					{
						driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
						break;
					}

				}
				driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("John");
				driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Earthhh");
				driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Earth");
				driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Earth");
				driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("12345");
				driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234567891234567");
				driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("10");
				driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2023");
				driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Johnn");
				driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
			
				String pagetitle = driver.getTitle();
				System.out.println(pagetitle);
				if(pagetitle.equals("BlazeDemo Confirmation")) {
					System.out.println("Successfully booked.....");
				}
				else {
					System.out.println("Booking unsuccessful...");
					driver.close();
				}
				Thread.sleep(4000);                                                                                                             
				driver.quit();                                                                                                                  
			}                                                                                                                                   
		                                                                                                                                        
		}                                                                                                                                      

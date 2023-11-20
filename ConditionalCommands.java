package day20;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class ConditionalCommands {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.applitools.com/index.html");
		
		Thread.sleep(3000);
		//isDisplayed() -- check if something is displayed or not
		boolean displayed = driver.findElement(By.xpath("//div[@class='logo-w']")).isDisplayed();
		System.out.println("Is displayed : "+ displayed);
		
		//isEnabled() -- check if something like input,checkbox,radio buttons are able to enable or not
		boolean enabled = driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
		System.out.println("Is Enabled : "+ enabled);
		
		//isSelected() -- check if radio button,checkbox is selected or not
		WebElement selected = driver.findElement(By.xpath("//input[@type='checkbox']"));
		selected.click();
		System.out.println("Is Selected : "+ selected.isSelected());
				
		Thread.sleep(5000);
		driver.quit();
		
	}

}

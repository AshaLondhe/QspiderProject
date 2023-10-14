package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// to open the browser
		driver.get("https://www.facebook.com/");
		
		//address of create an account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		// address od radio button 
		femaleRadioBtn= driver.findElement(By.xpath("//input"))
		
	}

}

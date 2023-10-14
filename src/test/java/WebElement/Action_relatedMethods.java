package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_relatedMethods {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {


		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // Opens the edge browser
		driver.manage().window().maximize(); // Maximize statement
		//For implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/"); // it opens the application
		WebElement emailTf = driver.findElement(By.xpath("//input[@id='email']"));
		
		emailTf.sendKeys("Asha");
		Thread.sleep(3000);
		emailTf.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		
		
		
	}

}

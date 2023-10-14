package TestNg_Failling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	
	@SuppressWarnings("deprecation")
	@Test
	public void amz()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.id("email")).sendKeys("ajhgd");
	}
		
	

}

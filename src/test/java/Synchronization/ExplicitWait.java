package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // Opens the edge browser
		driver.manage().window().maximize(); // Maximize statement
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//explicit wait

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/"); // it opens the application
		driver.findElement(By.id("email")).sendKeys("Asha");
		WebElement login = driver.findElement(By.xpath("//button[@name=\'login\']"));
				wait.until(ExpectedConditions.elementToBeClickable(login));
			login.click();
		
		
	}
}


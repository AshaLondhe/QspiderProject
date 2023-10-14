package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // Opens the edge browser
		driver.manage().window().maximize(); // Maximize statement
		driver.get("https://www.facebook.com/"); // it opens the application
		// driver.findElement(By.id("email")).sendKeys("Asha"); // address of email text
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Asha");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("ABC@123");
		Thread.sleep(3000);
		//address of forgotten password using xpath text 
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//address of forgotten password using xpath text 
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}

}

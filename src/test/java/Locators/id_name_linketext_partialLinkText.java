package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_name_linketext_partialLinkText {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // Opens the edge browser
		driver.manage().window().maximize(); // Maximize statement
		driver.get("https://www.facebook.com/"); // it opens the application
		// driver.findElement(By.id("email")).sendKeys("Asha"); // address of email text
		// field
		driver.findElement(By.id("email")).sendKeys("Asha for class");

		driver.findElement(By.name("pass")).sendKeys("Asha@123");

	}
}

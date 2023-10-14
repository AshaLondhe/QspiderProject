package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Siblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // Opens the edge browser
		driver.manage().window().maximize(); // Maximize statement
		
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//a[text()='New Releases']/preceding-sibling::a[@data-csa-c-content-id='nav_cs_gb']")).click();
		
		//correct program
		
		
	}

}

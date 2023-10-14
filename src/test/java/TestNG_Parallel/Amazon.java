package TestNG_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	
	@Test
	public void am()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // Opens the edge browser
		driver.manage().window().maximize(); // Maximize statement
		driver.get("https://www.amazon.in/"); // it opens the application
		
	}

}

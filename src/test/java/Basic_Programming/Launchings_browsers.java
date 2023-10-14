package Basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchings_browsers {

	public static void main(String[] args) throws Throwable {

		// Edge browser related statement
		WebDriverManager.edgedriver().setup();
		// Opens the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		// Maximize statement
		driver.manage().window().maximize();
		
		
	}

}

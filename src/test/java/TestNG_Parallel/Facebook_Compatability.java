package TestNG_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Compatability {
	
	@Parameters({"browsername"})
	
	@Test
	public void fbc(String browser)
	{
		
		WebDriver driver;
		if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			//opens empty browser
			driver = new EdgeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashab\\eclipse-workspace\\QspiderProject\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize(); // Maximize statement
		driver.get("https://www.amazon.in/"); // it opens the application
		
		
		//For implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// to open the browser
		
		driver.get("https://www.facebook.com/"); // it opens the application
		
	}

}

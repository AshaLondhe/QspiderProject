package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashab\\eclipse-workspace\\DemoProject\\src\\test\\resources\\chromedriver.exe");
		
		
		//WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		ChromeDriver driver = new ChromeDriver();
		
		//WebDriver driver=new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// to open the browser
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div"));
		
		//Executed program - Done
	}

}

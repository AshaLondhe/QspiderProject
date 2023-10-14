package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Notification {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications"); //----- text written in quotes will be this only, it is not normal text.
	//	option.addArguments("--disable-locations"); // use this for location pop up 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashab\\eclipse-workspace\\DemoProject\\src\\test\\resources\\chromedriver.exe");
		

		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/"); // use this for nofitications popup 

		driver.get("https://www.goindigo.in/"); // website to where location pop up is available 
		
		
	}

}

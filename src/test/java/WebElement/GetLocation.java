package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation {


		public static void main(String[] args) throws Throwable {


			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver(); // Opens the edge browser
			driver.manage().window().maximize(); // Maximize statement
			//For implicit wait 
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			new WebDriverWait(driver, Duration.ofSeconds(10)); ///check this
			
			driver.get("https://www.facebook.com/"); // it opens the application
		 WebElement emailTf = driver.findElement(By.xpath("//input[@id='email']"));
			
			System.out.println(emailTf.getAttribute("placeholder"));
			//using getlocation
			
			coOrdinates = emailIf.getLocation();
			int x =coOrdinates.getX();
			int y=coOrdinates.getY();
			System.out.println(x);
			System.out.println(y);
			
			

	}

}

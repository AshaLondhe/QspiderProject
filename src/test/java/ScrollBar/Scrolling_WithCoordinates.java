package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_WithCoordinates {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// to open the browser
		driver.get("https://www.amazon.in/");
		
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		Point coordinates = career.getLocation();
		int x = coordinates.getX();
		int y = coordinates.getY();
		
		
		//downcasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		
		Thread.sleep(3000);
		//career.click();  /// use this statement or below statement
		js.executeScript("arguments[0].click();", career);
		
	}

}

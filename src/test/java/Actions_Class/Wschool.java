package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wschool {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// to open the browser
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		
		//Handaling Frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		
	/*	Thread.sleep(3000);
		Actions a = new Actions(driver);
		 //a.doubleClick(plus).perform();
		 a.click(plus).perform();
		  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	*/
	
	}

}

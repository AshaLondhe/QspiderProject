package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// to open the browser
		driver.get("https://www.snapdeal.com/");
		// address of sign in 
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		// create an object for actions class
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Register']")).click();
				//handling frames
				driver.switchTo().frame("loginIframe"); //this is id value given
				driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("Asha");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='close-pop']")).click();
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("xyz");
				
				
				
		
	}

}

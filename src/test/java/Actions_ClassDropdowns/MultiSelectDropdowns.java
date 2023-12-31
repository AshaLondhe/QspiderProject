package Actions_ClassDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdowns {

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
		driver.get("https://demoapp.skillrary.com/");
		
		
		WebElement dd = driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		
		Select s = new Select(dd);
		System.out.println(s.isMultiple()); // TO CHECK IF IT IS SINGLE DD OR MULTIPLE 
		s.selectByIndex(0); 
				Thread.sleep(3000);
				
		s.selectByValue("199");
		Thread.sleep(3000);
		
	/*	s.selectByValue("299");
		Thread.sleep(3000);
		
		s.selectByValue("299");
		Thread.sleep(3000);
	*/
		
	//	s.selectByVisibleText("INR 300 - INR 399 ( 1 ) "); //this is not working in this page dev error 
		Thread.sleep(3000);
		s.deselectByIndex(0);
		s.deselectByValue("199");
	//	s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) "); 
		
		List<WebElement> values = s.getAllSelectedOptions(); 
		for (WebElement b: values)  //this loop will not print anything because all dropdown elements we have deselected already, select elements and try
		{
			System.out.println(b.getText());
			
		}
		
	}

}

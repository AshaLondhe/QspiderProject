package Actions_ClassDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_SingleDropdown {

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
		
		
		WebElement dd = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//handling dropdown
		Select s = new Select(dd);
		
		s.selectByIndex(5); //to select element by index
		Thread.sleep(3000);
		
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		System.out.println(s.isMultiple());
		List<WebElement> all = s.getOptions();		
		System.out.println(all.size());
		for(WebElement b:all)
		{
			
			System.out.println(b.getText());
		}
				
	}

}

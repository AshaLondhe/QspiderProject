package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilities {

//1.double click

	public void doubleClickProcess(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	// 2. right click
	public void RightClick(WebDriver driver, WebElement ele2) {
		Actions a = new Actions(driver);
		a.contextClick(ele2).perform();

	}

	// 3. drag and drop
	public void DragAndDrop(WebDriver driver, WebElement ele3, WebElement ele4) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele3, ele4).perform();
	}

	// 4. Implicit
	@SuppressWarnings("deprecation")
	public void ImplicitWait(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	//5. Explicit Wait
	public void ExplicitWait(WebDriver driver, int time, WebElement ele)
	{
	driver.manage().timeouts();
	
	
	}
	
	
}

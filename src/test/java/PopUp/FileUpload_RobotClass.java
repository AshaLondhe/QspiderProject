package PopUp;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_RobotClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable  {
		
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// to open the browser
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		
		Robot r = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\ashab\\OneDrive\\Desktop\\Asha\\AshaResume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		
	}

}

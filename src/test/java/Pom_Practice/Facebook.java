package Pom_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.FaceBookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		//for maximizing
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// to open the browser
		driver.get("https://www.facebook.com/");

		//object creation
		FaceBookLoginPage fb1 = new FaceBookLoginPage(driver);
		fb1.emailTextfield("Asha");
		fb1.passwordtextfield("123");
		fb1.loginButton();
		
	//complete program - Done, for this other file is FaceBookLoginPage
		
	}

}

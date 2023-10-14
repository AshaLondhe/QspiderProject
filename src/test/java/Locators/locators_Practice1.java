package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators_Practice1 {
	
	public static void main (String []args)
	
	{
	
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_custrec_signin%26adgrpid%3D1317216587721796%26hvadid%3D82326303101722%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D163634%26hvtargid%3Dkwd-82326969838361%3Aloc-90%26hydadcr%3D7876_2322854&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("9923293220");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Shreya@3699");
		driver.findElement(By.id("signInSubmit")).click();
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(); // Opens the edge browser
		driver.manage().window().maximize(); // Maximize statement
		
		driver.get("https://www.amazon.in/Redmi-Storage-Performance-Mediatek-Display/dp/B0BYN4D512/ref=sr_1_1_sspa?crid=3GTUV2NVLKKMK&keywords=mobile&qid=1695395048&sprefix=mobile%2Caps%2C218&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1"); // it opens the application
		WebElement value = driver.findElement(By.xpath("span[text()='Redmi 12C (Matte Black, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']/../../../../../..//span[@class='a-price-whole']"));
		System.out.println(value.getText());
	}

}

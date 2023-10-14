package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	//don't take main method in this program
	
	//declaration
	// address of email text field
	@FindBy(id="email")
	private WebElement emailTf;
	
	//address of password text field
	
	@FindBy(name="pass")
	private WebElement passwordTf;
	
	//address of login button 
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
		
	//initialization
	public FaceBookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	//Utilization 
	//Getter Method ----don't type --right click below on this page -- source and select methods to create for getter. --generate it
	
	public WebElement getEmailTf() {
		return emailTf;
	}


	public WebElement getPasswordTf() {
		return passwordTf;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
	//Business Libraries
	public void emailTextfield(String data)
	{
		emailTf.sendKeys(data);
	}
	
	public void passwordtextfield(String data)
	{
		passwordTf.sendKeys(data);
		
	}

	public void loginButton()
	{
		loginBtn.click();
	}
	
}

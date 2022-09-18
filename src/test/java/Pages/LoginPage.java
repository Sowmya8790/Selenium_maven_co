package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	//************************Object****************
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id ="password")
	WebElement Checkbox;
	
	@FindBy(name="btn_login")
	WebElement LoginBtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password)
	{
		// Step1. Click  on the Login Link
				
				LoginLink.click();
				
				//Step2: Enter Username
				
				UserName.sendKeys(username);
				
				
				//Step3: Enter Password
				
				Password.sendKeys(password);
				
				//Step4 Click Remember Me checkbox
				
		        Checkbox.click();
		        
				//Step5: Click pn Login Button				
				LoginBtn.click();
	}


}

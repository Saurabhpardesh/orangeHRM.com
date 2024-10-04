package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver Driver;
	
	@FindBy (xpath ="//input[@placeholder='username']")
	WebElement usernametextbox;
	
	@FindBy (xpath ="//input[@name='password']")
	WebElement passwordtextbox;
	
	@FindBy (xpath ="//button[@type='submit']")
	WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void enterusernameintextbox(String user) {
		
		if(usernametextbox.isEnabled()) {
			
			usernametextbox.sendKeys(user);
		}
		
	}
	
    public void enterpasswordintextbox(String pass) {
		
		if(passwordtextbox.isEnabled()) {
			
			passwordtextbox.sendKeys(pass);
		}
		
	}
    
    public void clickonloginbutton() {
    	
    	if(loginbutton.isEnabled()) {
    		
    		loginbutton.click();
    	}
    }

}

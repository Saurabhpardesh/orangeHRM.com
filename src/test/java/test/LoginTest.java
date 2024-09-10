package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginTest extends BaseTest{
	
	
	LoginPage lp;
	
	@BeforeClass
	public void initialization() {
		
		//step-5 init object
		lp =new LoginPage(driver);
		
	}
	@Test(priority=2) 
	public void login() {
		
		//step-1
		lp.enterusernameintextbox("Admin");
		
		//step-2
		lp.enterpasswordintextbox("admin123");
		
		//step-3
		lp.clickonloginbutton();
		
		
		
	}
	@Test(priority= 1)
	public void verifypagetitle() {
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Page title does not matched");
		
	}
	

}

package test;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public void initobjects(WebDriver driver) {
		loginpage  =new LoginPage(driver);
		homepage =new HomePage(driver);
	}
	
	@BeforeClass
	public void init() {
		
	    //step-5 init object
		initobjects(driver);
	}
	
	
	@Test
	public void logout() {
		Assert.assertTrue(homepage.verifyDashBoardMenu());
		
		homepage.clickOnProfile();
		
		homepage.clickOnLogout();
	}
	

}

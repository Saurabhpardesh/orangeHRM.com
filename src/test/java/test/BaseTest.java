package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void initialization() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
    //my project
	@AfterSuite
	public void teardown() {
		
		driver.quit();
	}
	

}

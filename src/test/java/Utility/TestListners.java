package Utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.BaseTest;




public class TestListners extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method static
		try {
			
			Screenshot.capturescreen(driver, result.getName());
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
	}

	
		
	}
	
	


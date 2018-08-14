package May14;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
	
	@BeforeClass
	public void launchurl(){
		System.out.println("Launching url...");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("Closing browser...");
	}
	
	
	@BeforeMethod
	public void login(){
		System.out.println("Logging in...");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("Logging out....");
	}
	
	@Test
	public void m10(){
		System.out.println("Inside m9");
		
	}
	
	@Test
	public void m11(){
		System.out.println("Inside m9");
		
	}

}

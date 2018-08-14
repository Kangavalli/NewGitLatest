package May14;

import org.testng.annotations.Test;

public class Test2 {
	
	//This is written from Git by Rajeshwari
	
	@Test(groups = {"Regression"}, dependsOnGroups = {"Sanity"}, alwaysRun = true)
	public void m4(){
		System.out.println("Inside m4");
	}
	
	@Test(groups = {"Sanity"})
	public void m5(){
		System.out.println("Inside m5");
		int a = 1/0;
	}
	
	@Test //(groups = {"Regression"}, dependsOnGroups = {"Sanity"}, alwaysRun = true)
	public void m6(){
		System.out.println("Inside m6");
	}
}

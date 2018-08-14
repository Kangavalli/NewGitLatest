package May14;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test //(priority = 4, groups = {"Sanity"}, dependsOnGroups = {"Regression"})
	public void m7(){
		System.out.println("Inside m7");
	}
	
	@Test //(priority = 6, dependsOnMethods = {"m7"}, groups = {"Regression"} , alwaysRun = true)
	public void m8(){
		System.out.println("Inside m8");
	}
	
	@Test(priority = 1)
	public void m9(){
		System.out.println("Inside m9");
		int a = 1/0;
	}
}

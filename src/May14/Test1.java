package May14;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(dependsOnMethods = {"m2"}, alwaysRun = true)	// to run even if parent method fails use alwaysRun=true.(soft dependency) and without AlwaysRun it is Hard dependency.
	public void m1(){
		System.out.println("Inside m1");
	}
	
	@Test
	public void m2(){
		System.out.println("Inside m2");
		int a = 1/0;
	}
	
	@Parameters({"url","PageLoadTimeOut"})
	@Test
	public void m3(String applicationurl, String TimeOut){
		System.out.println("URL = " + applicationurl);
		System.out.println("Inside m3");
	}
}

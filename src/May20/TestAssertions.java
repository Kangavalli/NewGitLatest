package May20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertions {
	
	@Test
	public void A1(){
		String actualName = "Aish";
		String expectedName = "AISH";
		try{
		Assert.assertEquals(actualName, expectedName);      //assertion is another way of failing TC it will fail when expected and actual are not equal.
		}catch(AssertionError ar){
			//code
		}
		boolean result = actualName.equals(expectedName);
		Assert.assertTrue(result, "Two strings are not equal"); 	
		System.out.println("My Third git commit");
		//if the result is not true it will display given message 
	}
	

}

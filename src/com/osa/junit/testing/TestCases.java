package com.osa.junit.testing;

//import org.openqa.selenium.By;

public class TestCases extends Drivers{
	
	public static void testCase1() {
			dr.get("https://www.osaconsultingtech.com");
			String actualTitle=dr.getTitle();
		    String expectedTitle ="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
		  
		    if(actualTitle.equals(expectedTitle)) {
			System.out.println("The test is pass : "+actualTitle);
		  }else {
			System.out.println("The test is fail ");
			System.out.println("The actual value is    :"+actualTitle);
			System.out.println("The expected value is  :"+expectedTitle);
			}
			
	}
	

}

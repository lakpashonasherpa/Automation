package com.osa.junit.testing;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainClass {

//public static void main(String[] args) throws Exception {
		@BeforeClass
		public static void juintTest1() {
			Drivers.getDriverPath();
		}
		@Test
		public void junitTest2() {
			TestCases.testCase1();
		}
		
		//Thread.sleep(5000);
	//}
	
	
	

}

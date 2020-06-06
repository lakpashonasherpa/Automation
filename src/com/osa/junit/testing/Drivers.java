package com.osa.junit.testing;

import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
	//ststic Properties prop =
	public static ChromeDriver dr;
	Properties prop=System.setProperties("/JUnitProjects/frame.properties");
	public static ChromeDriver getDriverPath() {
    System.setProperty(Driver,driverPath);
	      dr =new ChromeDriver();
	      dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      dr.manage().window().maximize();
	      
	      				
	return dr;
	
	}

}

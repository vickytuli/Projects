package com.mobile.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestConnection {
	
	
	public static void mobiletesting() throws Exception
	{
		@SuppressWarnings("unused")
		WebDriver driver;
		
		DesiredCapabilities capa = new DesiredCapabilities();
		
		capa.setCapability("browserName","Android");
		
		capa.setCapability("version","6.0.1");
		
		capa.setCapability("deviceName","motorola-motog3-ZY2226SCB7");
		
		capa.setCapability("platformName","Android");
		
		capa.setCapability("appPackage","com.android.calculator2");
		
		capa.setCapability("appActivity","com.android.calculator2.Calculator");
		
			
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capa);
		
		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		String Result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
		System.out.println(Result);
		
		
		
		
		
		driver.quit();
		
	}
	
	
public static void main(String[] args) throws Exception {
	TestConnection.mobiletesting();
}
}

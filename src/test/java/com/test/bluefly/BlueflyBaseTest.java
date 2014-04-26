package com.test.bluefly;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlueflyBaseTest {

	public WebDriver driver = new FirefoxDriver();
	
	@Before
	public void start(){
		
		driver.navigate().to("http://www.bluefly.com");
		}
	
	
	@After
	public void end(){
		driver.quit();
	}
	
	
	
}

package com.test.bluefly;

import java.awt.List;

import org.junit.Test;
import org.openqa.selenium.By;

public class BlueflySmokTest extends BlueflyBaseTest{
	
	
	@Test
	public void test1(){
		driver.findElement(By.xpath("//li[@id='main-nav-new']/a")).click();
		
		List<WebElement> elements =driver.findElements(By.xpath("//div[@id='productsContainer']/div"));
		 int a = elements.size();
				 
		 
		 Thread.sleep(3000);
			 
		 while( isElementPresent(By.xpath("//a[@class='next']"))== true || isElementPresent(By.xpath("//a[@class='next']"))==false)
				 
		 {
						
			 for (int j = 1; j<=4; j++)
			 {
				 Thread.sleep(3000);
				 if(isElementPresent(By.xpath("//div[@id='productsContainer']/div["+j+"]//div[@class='listProductSpecialStatusMsg sold-out']")) == true)
				 {
					 continue;
				 }
				 
				 driver.findElement(By.xpath("//div[@id='productsContainer']/div["+j+"]//img")).click();
				 Thread.sleep(3000);
				 driver.navigate().back();			
			     
			 }
			 Thread.sleep(2000);
			 
			 if (isElementPresent(By.xpath("//a[@class='next']"))==false)
			 {			 
				 break;
			 }				 
			 driver.findElement(By.xpath("//a[@class='next']")).click();
					 
			 
			 Thread.sleep(2000);
			 
		 } 
		
			 
					
	} 

	private boolean isElementPresent(By by) {
	    try {
	        driver.findElement(by);
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }

		
	}

}

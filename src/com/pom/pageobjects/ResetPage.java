package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPage {
	  WebDriver driver;
	  By reset = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[1]");
	  By search = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]");
	  	  public ResetPage (WebDriver driver) {
		   this.driver = driver;

      }
	  	  
	  	 public void ClickOnSearch() {
			  driver.findElement(search).click();
		  }
		  
	  public void ClickOnReset() {
		   driver.findElement(reset).click();
	   }
	  
	 
	 
}
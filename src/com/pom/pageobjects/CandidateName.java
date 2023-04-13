package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CandidateName {
	 WebDriver driver; 
By CandidateName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div"); 
By CCandidateName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input");
By Keywords = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]");
By CKeywords= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/input");


public CandidateName (WebDriver driver) {
	   this.driver = driver;
} 
public void ClickOnCandidateName() {
	driver.findElement(CandidateName).click();
		}
		public void enterCCandidateName(String name) {
			driver.findElement(CCandidateName).sendKeys(name);
		}
		 
	 
public void ClickOnKeywords() {
			driver.findElement(Keywords).click();
				}	 
		public void enterCKeywords(String name) {
			driver.findElement(CKeywords).sendKeys(name);
		}
		
	 
	 
	 
	 
	 
	 
}

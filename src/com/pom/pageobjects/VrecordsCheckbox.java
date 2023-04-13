package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VrecordsCheckbox {
	WebDriver driver; 
	
By Vcheckbox = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/label/span");
By Vdelete = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button");	
By Yesdlt = By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]");
	
	
	
	public VrecordsCheckbox (WebDriver driver) {
		   this.driver = driver;
	  }
	
	public void ClickOnVcheckbox() {
		 driver.findElement(Vcheckbox).click();
	 }
	
	
	public void ClickOnVdelete() {
		 driver.findElement(Vdelete).click();
	 }
	
	public void ClickOnYesdlt() {
		 driver.findElement(Yesdlt).click();
	 }
	
	
	
}

package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Savepage {
	WebDriver driver;
	By Save = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[1]");
	
	 public Savepage (WebDriver driver) {
		   this.driver = driver;

 }
		
	
	public void ClickOnSave() {
		driver.findElement(Save).click();
	}
	

  

}

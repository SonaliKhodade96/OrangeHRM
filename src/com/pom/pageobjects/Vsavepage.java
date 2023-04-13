package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vsavepage {
	WebDriver driver;
	By Vsavebtn = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[7]/button[1]");	
	
	
	
	 public Vsavepage (WebDriver driver) {
		   this.driver = driver;

}
	 
	 
	 public void ClickOnVsavebtn() {
			driver.findElement(Vsavebtn).click();
		}
		
}

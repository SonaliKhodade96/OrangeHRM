package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;
By NamePopUp = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span");	
By Logout = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");	
	
	
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void ClickOnNamePopUp() {
		 driver.findElement(NamePopUp).click();
	 }
	

	public void ClickOnLogout() {
		 driver.findElement(Logout).click();
	 }
	
	
	
	
	
	
	
	
	
}

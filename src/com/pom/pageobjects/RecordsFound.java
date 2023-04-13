package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecordsFound {
	WebDriver driver;
	By eyeicon = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[7]/div/button[1]");
	By trashicon = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[7]/div/button[2]");
	By cross = By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/button");
	
	public RecordsFound (WebDriver driver) {
		   this.driver = driver;

}
	
	 public void ClickOneyeicon() {
		  driver.findElement(eyeicon).click();
	  }
	 
	 public void ClickOntrashicon() {
		  driver.findElement(trashicon).click();
	  }
	
	 public void ClickOncross() {
		  driver.findElement(cross).click();
	  }
	

	
}

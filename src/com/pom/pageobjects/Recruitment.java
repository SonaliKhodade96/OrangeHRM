package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recruitment {
	 WebDriver driver;
	 
	 By recruitment = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a");
     
	 public Recruitment (WebDriver driver) {
  	   this.driver = driver;
     }
	
	 public void ClickOnRecruitment() {
		 driver.findElement(recruitment).click();
	 }
     

}

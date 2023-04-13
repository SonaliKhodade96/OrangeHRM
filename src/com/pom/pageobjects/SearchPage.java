package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	   WebDriver driver;
       By search = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input");
       By arrow = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button");
       By leftA = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button");


       public SearchPage (WebDriver driver) {
    	   this.driver = driver;
       }
       
     public void ClickOnSearch (String searc) {
    	 driver.findElement(search).sendKeys(searc);
     }
     
   
		/*
		 * public void ClickOnArrow () { driver.findElement(arrow).click(); }
		 */
     
		/*
		 * public void ClickOnLeftA () { driver.findElement(leftA).click(); }
		 */



}     
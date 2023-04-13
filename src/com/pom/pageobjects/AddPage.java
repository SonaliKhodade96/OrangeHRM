package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AddPage {
	WebDriver driver;
By add = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
By Cadd= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i");
		
By First = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input");
By Middle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input");
By Last = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input");
By AddVacancy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div");
By CAddVacancy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[6]");

By Email = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
By Number = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
By Keywords = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input");

    
    
    
    public AddPage (WebDriver driver) {
		   this.driver = driver;

   }
	
	 public void ClickOnAdd() {
		  driver.findElement(add).click();
	  }
	  
	 public void ClickOnCadd() {
		 driver.findElement(Cadd).click();
	 }
	 
	 
	 public void enterFirstName(String name) {
			driver.findElement(First).sendKeys(name);
		}
	 
	 public void enterMiddleName(String name) {
			driver.findElement(Middle).sendKeys(name);
		}
	 
	 public void enterLastName(String name) {
			driver.findElement(Last).sendKeys(name);
		}
		
	 public void ClickOnAddVacancy() {
			driver.findElement(AddVacancy).click();
		}
		
		public void ClickOnCAddVacancy() {
			driver.findElement(CAddVacancy).click();    
		}
		
	  public void enterEmail(String name) {
				driver.findElement(Email).sendKeys(name);
			}
		
	  public void enterNumber(String name) {
			driver.findElement(Number).sendKeys(name);
		}
	
	  public void enterKeywords(String name) {
			driver.findElement(Keywords).sendKeys(name);
		}
	  
}
	  
	  

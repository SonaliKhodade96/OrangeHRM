package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class CandidatesPage {
    WebDriver driver; 
By recruitment = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a");
By JobTitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
By Vacancy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i"); 
By HiringManager = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div");    
By Status = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div");    
  		

By FromDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div");
By ToDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div");
By MethodOfApplication = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div");

By SoftwareEngineer = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[23]");
By VSoftwareEngineer = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[7]");
By CHiringManager = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[4]");
By CStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[3]");

By CFromDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/input");
By CToDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/input/select/[12]");
By CMethodOfApplication = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div/div[2]");

public CandidatesPage (WebDriver driver) {
	   this.driver = driver;
  }

public void ClickOnRecruitment() {
		 driver.findElement(recruitment).click();
	 }
  
  public void ClickOnJobTitle () {
		driver.findElement(JobTitle).click();
  }	
  public void ClickOnSoftwareEngineer () {
	  driver.findElement(SoftwareEngineer).click();
  }

  public void ClickOnVacancy() {
		driver.findElement(Vacancy).click();
	  }	
			
  public void ClickOnVSoftwareEngineer () {
	  driver.findElement(VSoftwareEngineer).click();
	  
  }
	public void ClickOnHiringManager() {
		driver.findElement(HiringManager).click();
			}		
	public void ClickOnCHiringManager() {
		driver.findElement(CHiringManager).click();
			}			    
			 
	public void ClickOnStatus() {
		driver.findElement(Status).click();
			}	
	public void ClickOnCStatus() {
		driver.findElement(CStatus).click();
			}	
	

	
			
			// Not sure correct or not
			public void ClickOnFromDate() {
				driver.findElement(FromDate).click();
			}
			public void ClickOnCFromDate() {
				driver.findElement(CFromDate).click();
			}
			
			// Not sure correct or not
			public void ClickOnToDate() {
				driver.findElement(FromDate).click();
			}
			public void ClickOnCToDate() {
				driver.findElement(CFromDate).click();
			}
			
			
			public void ClickOnMethodOfApplication () {
				driver.findElement(MethodOfApplication).click();
			}
			
			
			public void ClickOnCMethodOfApplication () {
				driver.findElement(CMethodOfApplication).click();
			}
			
			
}
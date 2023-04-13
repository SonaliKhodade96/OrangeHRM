package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VacanciesPage {
	WebDriver driver; 
	
By vacancies = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]");
By VacanciesJobTitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div");	
By VSoftwareEngineer = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[6]");

By VacanciesVacancy = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div");
By VacanciesSE = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[6]");

By VacanciesHiringManager = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div");
By VHiringManager = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[3]");

By Status = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div");
By VStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[3]");

By Vsearch = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
By Vreset = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");

By Vadd = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
By VVacancyName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input");
By VJobtitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div");
By VJT = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[5]");
By VHiringManage = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input");




public VacanciesPage (WebDriver driver) {
		   this.driver = driver;
	  }

	
	public void ClickOnVacancies() {
		 driver.findElement(vacancies).click();
	 }
	
	public void ClickOnVacanciesJobTitle () {
		driver.findElement(VacanciesJobTitle).click();	
  }	
		public void ClickOnVSoftwareEngineer () {
			  driver.findElement(VSoftwareEngineer).click();
		  }
	
		
		
		public void ClickOnVacanciesVacancy () {
			driver.findElement(VacanciesVacancy).click();
		}
		public void ClickOnVacanciesSE () {
		driver.findElement(VacanciesSE).click();
      }
	
		
		
		public void ClickOnVacanciesHiringManager () {
			driver.findElement(VacanciesHiringManager).click();
		}
		public void ClickOnVHiringManager () {
			driver.findElement(VHiringManager).click();    
		}
	
		public void ClickOnStatus () {
			driver.findElement(Status).click();
		}
		public void ClickOnVStatus() {
			driver.findElement(VStatus).click();    
		}
	
		public void ClickOnVsearch () {
			driver.findElement(Vsearch).click();
		}
		public void ClickOnVreset() {
			driver.findElement(Vreset).click();    
		}
		
		
		public void ClickOnVadd() {
			driver.findElement(Vadd).click();    
		}
	
		public void ClickOnVVacancyName() {
			driver.findElement(VVacancyName).click();
		}
		public void enterVacancyName(String name) {
			driver.findElement(VVacancyName).sendKeys(name);
		}
		
		
		public void ClickOnVJobtitle() {
			driver.findElement(VJobtitle).click();
		}
		
		public void ClickOnVJT() {
			driver.findElement(VJT).click();
		}
		
		public void ClickOnVHiringManage() {
			driver.findElement(VHiringManage).click();
		}
		public void enterVHiringManage(String name) {
			driver.findElement(VHiringManage).sendKeys(name);
		}
	

}

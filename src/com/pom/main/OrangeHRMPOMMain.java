package com.pom.main;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.pageobjects.AddPage;
import com.pom.pageobjects.CandidateName;
import com.pom.pageobjects.CandidatesPage;
import com.pom.pageobjects.LoginPage;
import com.pom.pageobjects.LogoutPage;
import com.pom.pageobjects.RecordsFound;
import com.pom.pageobjects.Recruitment;
import com.pom.pageobjects.ResetPage;
import com.pom.pageobjects.Savepage;
import com.pom.pageobjects.VacanciesPage;
import com.pom.pageobjects.VrecordsCheckbox;
import com.pom.pageobjects.Vsavepage;



public class OrangeHRMPOMMain {

	public static void main(String[] args) {
		try {
		 ChromeDriver driver  = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(2000);
         
		LoginPage login =  new LoginPage(driver);
		Thread.sleep(2000);
		login.enterUserName("Admin");
		Thread.sleep(2000);
		login.enterPassword("admin123");
		Thread.sleep(2000);
		login.ClickOnLogin();
		
		/*
		 * SearchPage search = new SearchPage(driver); Thread.sleep(2000);
		 * search.ClickOnSearch("Recruitment");
		 */
		/*
		 * Thread.sleep(2000); search.ClickOnArrow();
		 */
		/*
		 * Thread.sleep(2000); search.ClickOnLeftA();
		 */
		
		Recruitment recur = new Recruitment(driver);
		recur.ClickOnRecruitment();
		
		CandidatesPage candidate = new CandidatesPage(driver);
		
		candidate.ClickOnJobTitle();
		Thread.sleep(2000);
		candidate.ClickOnSoftwareEngineer();
		Thread.sleep(2000);		
		candidate.ClickOnVacancy();
		Thread.sleep(2000);
		candidate.ClickOnVSoftwareEngineer();
		Thread.sleep(2000);		
		candidate.ClickOnHiringManager();
		Thread.sleep(2000);
		candidate.ClickOnCHiringManager();
		Thread.sleep(2000);		
		candidate.ClickOnStatus();
		Thread.sleep(2000);
		candidate.ClickOnCStatus();
		Thread.sleep(2000);	
		
		CandidateName candiN = new CandidateName (driver);
		candiN.ClickOnCandidateName();
		Thread.sleep(2000);
		candiN.enterCCandidateName("Sonali Dilip Gaikwad");
		Thread.sleep(2000);		
		candiN.ClickOnKeywords();
		candiN.enterCKeywords("Software Tester");
		Thread.sleep(2000);
		
		// Not sure correct or not
		candidate.ClickOnFromDate();
		Thread.sleep(2000);
		candidate.ClickOnCFromDate();
		Thread.sleep(2000);
		// Not sure correct or not
		candidate.ClickOnToDate();
	    Thread.sleep(2000);
	    candidate.ClickOnCToDate();
	    Thread.sleep(2000);
	    
	    candidate.ClickOnMethodOfApplication();
		Thread.sleep(2000);
		candidate.ClickOnCMethodOfApplication();
		Thread.sleep(2000);
	    
		ResetPage rsp = new ResetPage(driver);
		 rsp.ClickOnSearch();
	    rsp.ClickOnReset();
	    Thread.sleep(3000);
	    
	    AddPage add =  new AddPage(driver);
		Thread.sleep(2000);
		add.ClickOnCadd();
		Thread.sleep(2000);
		add.enterFirstName("Sonali");
		Thread.sleep(2000);
		add.enterMiddleName("Dilip");
		Thread.sleep(2000);
		add.enterLastName("Gaikwad");
		Thread.sleep(2000);		
		add.ClickOnAddVacancy();
		Thread.sleep(2000);
		add.ClickOnCAddVacancy();
		Thread.sleep(2000);
		add.enterEmail("sonalig78@gmail.com ");
		Thread.sleep(2000);		
		add.enterNumber("9132487896");
		Thread.sleep(2000);		
		add.enterKeywords("manual tester, automation tester");
		Thread.sleep(2000);
		
		Savepage savep	= new Savepage(driver);
		savep.ClickOnSave();
		Thread.sleep(2000);
	
		
		 

		
		RecordsFound recordf = new RecordsFound (driver);
		recordf.ClickOneyeicon();
		
		recur.ClickOnRecruitment();
		Thread.sleep(2000);
		recordf.ClickOntrashicon();
		Thread.sleep(2000);
		recordf.ClickOncross();
		
		
		
		
		VacanciesPage van = new VacanciesPage (driver);
		van.ClickOnVacancies();
		Thread.sleep(2000);
		
		van.ClickOnVacanciesJobTitle();
		Thread.sleep(2000);
		van.ClickOnVSoftwareEngineer();	
		Thread.sleep(2000);
		
		van.ClickOnVacanciesVacancy();
		Thread.sleep(2000);
		van.ClickOnVacanciesSE();
		Thread.sleep(2000);
		
		van.ClickOnVacanciesHiringManager();
		Thread.sleep(2000);
		van.ClickOnVHiringManager();
		Thread.sleep(2000);
		
		van.ClickOnStatus();
		Thread.sleep(2000);
		van.ClickOnVStatus();
		Thread.sleep(2000);
			
		van.ClickOnVsearch();
	    van.ClickOnVreset();
	    Thread.sleep(2000);
	    
	    
	    van.ClickOnVadd();
	    Thread.sleep(1000);
	    
	    van.ClickOnVVacancyName();
	    van.enterVacancyName("software tester");
	    Thread.sleep(2000);
	    
	    van.ClickOnVJobtitle();
		Thread.sleep(2000);
		van.ClickOnVJT();
		Thread.sleep(2000);
		
		van.ClickOnVHiringManage();
		
	    van.enterVHiringManage("Paul  Collings");
	    Thread.sleep(2000);
	    
	    Vsavepage savev = new Vsavepage (driver);
	    savev.ClickOnVsavebtn();
	    van.ClickOnVacancies();
	    
	    VrecordsCheckbox recordcheck = new VrecordsCheckbox(driver);
	    recordcheck.ClickOnVcheckbox();
	    Thread.sleep(1000);
	    recordcheck.ClickOnVdelete();
	    Thread.sleep(1000); 
	    recordcheck.ClickOnYesdlt();
	    
	    
	    LogoutPage LogPage = new LogoutPage (driver);
	    LogPage.ClickOnNamePopUp();
	    Thread.sleep(1000); 
	    LogPage.ClickOnLogout(); 
	    
	    
	    
		}
		
		
		
		catch (Exception e) {}

	
	
	}

}

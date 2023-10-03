package swimGDSAutomation.PositiveTC;

import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageBCNPage;


public class ManageBCNTest extends BaseClass {

	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	 String Email = "nda.norala@gmail.com";
     String Password ="Nikhil@86"; 
  
	 //Verify if the user is able to click on Manage BCN menu and get the title of the page
	 @Test(priority=1)
	 public void ClickOnManageBCNMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 managebcnpage.titleOfPage();
	
	 }
	 
	 //Verify if the user is able to click on Enter BCN Number Range sub-menu and get the title of the page
	 @Test(priority=2)
	 public void ClickOnEnterBCNNumberSubmenu() throws InterruptedException {
		 
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 managebcnpage.Click_BCNrangesubmenu();
	 managebcnpage.waitCode();
	 managebcnpage.titleOfPage();
	
	 }
	 
	 //Verify if the user is able to click on Manage BCN number sub-menu and get the title of the page
	 @Test(priority=3)
	 public void ClickOnManageBCNNumberSubmenu() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.titleOfPage();
		
     }
	 
	 //Verify if the user is able to click on Cancel BCN sub-menu and get the title of the page
	 @Test(priority=4)
	 public void ClickOnCancelBCNSubmenu() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.waitCode();
	 managebcnpage.titleOfPage();
		
     }
	 
	 //Verify if the user is able to click on View BCN sub-menu and get the title of the page
	 @Test(priority=5)
	 public void ClickOnViewBCNSubmenu() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_viewBCN();
	 managebcnpage.waitCode();
	 managebcnpage.titleOfPage();
		
     }
	 
	 //Verify if the user is able to click on Manage BCN sub-menu and get the title of the page
	 @Test(priority=6)
	 public void ClickOnManageBCNSubmenu() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_manageBCNsubmenu();
	 managebcnpage.waitCode();
	 managebcnpage.titleOfPage();
		
     }
	 
	 //Verify if the user is able to click on Review Balance shift sub-menu and get the title of the page
	 @Test(priority=7)
	 public void ClickOnReviewBalanceShiftSubmenu() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_reviewbalanceshift();
	 managebcnpage.waitCode();
	 managebcnpage.titleOfPage();
		
     }
	 
	 //Verify if the user is able to click on Manage Alternate Voyage sub-menu and get the title of the page
	 @Test(priority=8)
	 public void ClickOnManageAlternateVoyageSubmenu() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_manageAlternatevoyage();
	 managebcnpage.waitCode();
	 managebcnpage.titleOfPage();
		
     }
}

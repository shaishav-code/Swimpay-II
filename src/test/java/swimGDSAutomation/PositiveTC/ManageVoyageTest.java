package swimGDSAutomation.PositiveTC;

import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageVoyagePage;

public class ManageVoyageTest extends BaseClass{
	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	
     
     //Verify if user is able to click on Manage Voyage Sub-menu and 4 sub-menu should get visible
	 @Test(priority=1)
	 public void ClickOnManageVoyageMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.titleOfPage();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
     //Verify if user is able to click on List Voyage sub-menu and can get the title of the page
	 @Test(priority=2)
	 public void ClickOnListVoyageSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.titleOfPage();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on Cancel Voyage sub-menu and can get the title of the page
	 @Test(priority=3)
	 public void ClickOnCancelVoyageSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.titleOfPage();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on Change Voyage Date sub-menu and can get the title of the page
	 @Test(priority=4)
	 public void ClickOnChangeVoyageDateSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.titleOfPage();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on Change of Vessel sub-menu and can get the title of the page
	 @Test(priority=5)
	 public void ClickOnChangeOfVesselSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.titleOfPage();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
}

package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageVoyagePage;

public class ManageVoyageTest extends BaseClass{
	
//	 String email = "nda.norala@gmail.com";
//   String password ="Nikhil@86";
	 String email = "cma@gmail.com";
     String password ="Admin@123";
	
     
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
	 
     //Verify if user is able to click on List Voyage sub-menu with Active status selected and can get the title of the page
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
	 managevoyagepage.waitCode();
	 managevoyagepage.scrolling();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on Status dropdown with 3 options displayed i.e. Active, Completed & Cancelled
	 @Test(priority=3)
	 public void ClickOnStatusDropdown() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 

	 //Verify if user is able to click on View of Action column to see the Voyage Details of Active status
	 @Test(priority=4)
	 public void ClickOnViewFromActionColumn() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnActionColumn("CMACGM-W-048");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on cross icon of Voyage details to close the pop-up of Active status
	 @Test(priority=5)
	 public void ClickToCloseThePopup() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnActionColumn("CMACGM-W-048");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on View of BCN column to see the BCN Details of Active status
	 @Test(priority=6)
	 public void ClickOnViewFromBCNColumn() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnBCNColumn("CMACGM-W-050");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on Accending & Descending arrow of Booking date column of Active status
	 @Test(priority=7)
	 public void ClickOnAscDescArrow() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnBCNColumn("CMACGM-W-048");
	 managevoyagepage.Windowhandling(1);
	 managevoyagepage.Click_Ascarrow();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Descarrow();
	 Assert.assertTrue(false);

	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	//Verify if user is able to click on Pagination arrow to change the page of BCN sub-menu of Active status
	 @Test(priority=8)
	 public void ClickOnPaginationArrow() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnBCNColumn("CMACGM-W-048");
	 managevoyagepage.Windowhandling(1);
	 managevoyagepage.waitCode();
	 managevoyagepage.scrolling();
	 managevoyagepage.Click_PageNavigationArrow();
		 
	 try {
     	   managevoyagepage.waitCode();
	     } 
	catch (InterruptedException e) 
		     {
			    e.printStackTrace();
	 }
		 
     }
	 
	 //Verify if user is able to select the Completed status from the dropdown 
	 @Test(priority=9)
	 public void SelectTheCompletedStatusFromDropdown() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Completed");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to select the Completed status from dropdown and click on Load button
	 @Test(priority=10)
	 public void ClickOnCompletedStatus() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Completed");
	 managevoyagepage.Click_loadbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.scrolling();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on View of Action column to see the Voyage Details and can closewith Selected status as Completed
	 @Test(priority=11)
	 public void ClickOnViewFromActionColumn_SelectedStatusAsCompleted() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Completed");
	 managevoyagepage.Click_loadbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnActionColumn("CMACGM-W-002");
	 try {
		 managevoyagepage.waitCode();
		     } 
	 catch (InterruptedException e) 
		     {
		    e.printStackTrace();
		     }
		 
	 managevoyagepage.Click_crossicon();
	 
     }
	 
	 //Verify if user is able to click on View of BCN column to see the BCN Details with selected status as Completed
	 @Test(priority=12)
	 public void ClickOnViewFromBCNColumn_SelectedStatusAsCompeleted() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Completed");
	 managevoyagepage.Click_loadbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnBCNColumn("CMACGM-W-002");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to select the Cancelled status from dropdown and click on Load button
	 @Test(priority=13)
	 public void ClickOnCancelledStatus() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Cancelled");
	 managevoyagepage.Click_loadbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.scrolling();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on View of Action column to see the Voyage Details and can close the pop-up with Selected status as Cancelled
	 @Test(priority=14)
	 public void ClickOnViewFromActionColumn_SelectedStatusAsCancelled() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Cancelled");
	 managevoyagepage.Click_loadbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnActionColumn("CMACGM-W-032");
	 try {
		 managevoyagepage.waitCode();
		     } 
	 catch (InterruptedException e) 
		     {
		    e.printStackTrace();
		     }
		 
	 managevoyagepage.Click_crossicon();
	 
     }
	 
	 //Verify if user is able to click on View of BCN column to see the BCN Details with selected status as Cancelled
	 @Test(priority=15)
	 public void ClickOnViewFromBCNColumn_SelectedStatusAsCancelled() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Cancelled");
	 managevoyagepage.Click_loadbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnBCNColumn("CMACGM-W-029");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
         {
		    e.printStackTrace();
	     }
		 
		 }
	 String Email = "nda.norala@gmail.com";
	 String Password = "Nikhil@86";
	 
	 //Verify if user is able to click on Cancel Voyage sub-menu and can get the title of the page
	 @Test(priority=16)
	 public void ClickOnCancelVoyageSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(Email);
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
	 @Test(priority=17)
	 public void ClickOnChangeVoyageDateSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(Email);
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
	 @Test(priority=18)
	 public void ClickOnChangeOfVesselSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(Email);
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

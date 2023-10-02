package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageVoyagePage;

public class ManageVoyageTest extends BaseClass{
	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	 String Email = "cma@gmail.com";
     String Password ="Admin@123";
	
                        //////////////////List Voyage/////////////////////
     
     //Verify if user is able to click on Manage Voyage Sub-menu and 4 sub-menu should get visible
	 @Test(priority=1)
	 public void ClickOnManageVoyageMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
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
		
	 LandingPage landingPage = new LandingPage(driver);;
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
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
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
		 
	 
	 
	                   ///////////////////Cancel Voyage///////////////////
	 
	 //Verify if user is able to click on Cancel Voyage sub-menu and can get the title of the page
	 @Test(priority=16)
	 public void ClickOnCancelVoyageSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
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
	 
	 //Verify if user is able to insert the Voyage number in the field in Cancel Voyage sub-menu
	 @Test(priority=17)
	 public void EnterVoyageNumberInField() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.Click_voyagenofield("CMACGM-W-047");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to Select the Voyage number from the dropdown options in the Cancel Voyage sub-menu
	 @Test(priority=18)
	 public void SelectVoyageNumberFromDropdownOptions() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 try {
		 managevoyagepage.Select_voyagenumber("CMACGM-W-050");
	     } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to Select the CheckBox of Port-Pairs for cancelling the Voyage number
	 @Test(priority=19)
	 public void SelectCheckBoxOfPortPairs() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("CMACGM-W-050");
	     } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 
	 managevoyagepage.waitCode();
	 managevoyagepage.Select_Checkbox();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on the Submit button in Cancel Voyage sub-menu
	 @Test(priority=20)
	 public void ClickOnSubmitButton() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);		
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();		
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00012-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Select_Checkbox();
	 managevoyagepage.Click_submitbtn();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	    {
	    e.printStackTrace();
	    }
		 
	 }
	 
	 
	 //Verify if user is able to click on No Button to close the pop-up in the Cancel Voyage sub-menu
	 @Test(priority=21)
	 public void ClickOnNoButtonToCloseThePopup() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00012-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Select_Checkbox();
	 managevoyagepage.Click_submitbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Nobtn(0);
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on Yes Button to cancel the voyage in Cancel Voyage sub-menu
	 @Test(priority=22)
	 public void ClickOnYesButtonToCancelVoyage() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00012-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Select_Checkbox();
	 managevoyagepage.Click_submitbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Yesbtn(0);
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on No Button in Seller Offers Alternative Voyage pop-up in Cancel Voyage Sub-menu
	 // @Test(priority=23)
	 public void ClickOnNoButtonInSellerOffersAltVoyagePopup() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.Select_voyagenumber("V00012-S");
	 managevoyagepage.waitCode();
	 managevoyagepage.Select_Checkbox();
	 managevoyagepage.Click_submitbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Yesbtn(0);
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Nobtn(1);
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 Assert.assertTrue(managevoyagepage.Success_message(), "Successfully Cancelled the Voyage Number by selecting No option for Seller Offers Alternative Voyage" );
	
	 }
	 
	 //Verify if user is able to click on Yes Button in Seller Offers Alternative Voyage pop-up in Cancel Voyage Sub-menu
	 // @Test(priority=24)
	 public void ClickOnYesButtonInSellerOffersAltVoyagePopup() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
     landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.Select_voyagenumber("V00012-S");
	 managevoyagepage.waitCode();
	 managevoyagepage.Select_Checkbox();
	 managevoyagepage.Click_submitbtn();
	 managevoyagepage.Click_Yesbtn(0);
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Yesbtn(1);
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
		    
	     }
	 Assert.assertTrue(managevoyagepage.Success_message(), "Successfully Cancelled the Voyage Number by selecting Yes option for Seller Offers Alternative Voyage" );
	
	 }
	 
	//Verify if user has successfully cancelled the Voyage number or not in List Voyage sub-menu by selecting Cancelled option from the dropdown
	 @Test(priority=25)
	 public void VerifyTheCancelledVoyageNumber() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
     landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_cancelvoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00012-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Select_Checkbox();
	 managevoyagepage.Click_submitbtn();
	 managevoyagepage.Click_Yesbtn(0);
	 managevoyagepage.Click_Yesbtn(1);
	 managevoyagepage.waitCode();
	 Assert.assertTrue(managevoyagepage.Success_message(), "Successfully Cancelled the Voyage Number by selecting Yes option for Seller Offers Alternative Voyage" );
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_statusdropdown();
	 managevoyagepage.Select_status("Cancelled");
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_loadbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnBCNColumn("V00012-S");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
			    
	     }
		
	 }
	 
	           ///////////////////////////Change Voyage Date//////////////////////////
	 
	 
	 //Verify if user is able to click on Change Voyage Date sub-menu and can get the title of the page
	 @Test(priority=26)
	 public void ClickOnChangeVoyageDateSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
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
	 
	 //Verify if user is able to click on ETD & ETA fields to select the date from Calender in Change Voyage date sub-menu
	 @Test(priority=27)
	 public void ClickOnETDAndETAField() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("CMACGM-W-044");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ETDfield();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to Select the date from the Calender on ETD field in Change Voyage date sub-menu
	 @Test(priority=28)
	 public void SelectDateOnETDField() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.SelectdatenMonth(0,"September 2023","30");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to Select the date from the Calender on ETA field in Change Voyage date sub-menu
	 @Test(priority=29)
	 public void SelectDateOnETAField() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.SelectdatenMonth(1,"December 2023","12");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to Select the ETA & ETD date from the Calender and click on Submit button in Change Voyage date sub-menu
	 @Test(priority=30)
	 public void ClickOnETDFiel() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(0,"September 2023","30"); 
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(1,"December 2023","12");
		 } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_SubmitonChangeVoyagedatesubmenu();
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on No button to cancel the changes in Change Voyage date Sub-menu
	 @Test(priority=31)
	 public void ClickOnNoOptionInChangeDateSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(0,"October 2023","12"); 
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(1,"December 2023","12");
		 } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_SubmitonChangeVoyagedatesubmenu();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Nobtn(0);
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 	 	 
	 }
	 
	 //Verify if user is able to click on Yes button to successfully submit the changes in Change Voyage date Sub-menu
	 @Test(priority=32)
	 public void ClickOnYesOptionInChangeDateSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(0,"October 2023","12"); 
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(1,"December 2023","12");
		 } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_SubmitonChangeVoyagedatesubmenu();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Yesbtn(0);
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 Assert.assertTrue(managevoyagepage.Success_message(), "Successfully Changed the date of ETA & ETD" );
	 	 
	 }
	 
	 
	 //Verify if user has succesfully changed the date or not in List Voyage sub-menu
	 @Test(priority=33)
	 public void VerifyDateChange() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevoyage();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
	     } 
	 catch (Exception e) 
	     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(0,"October 2023","15"); 
	     } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.SelectdatenMonth(1,"December 2023","15");
		 } 
	 catch (Exception e) 
     {
	    System.out.println("Executing corresponding Catch block");
     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_SubmitonChangeVoyagedatesubmenu();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_Yesbtn(0);;
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnActionColumn("V00011-S");
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
		 } 
	 
	 
	                  //////////////////////Change of Vessel//////////////////////
	
	 
	 //Verify if user is able to click on Change of Vessel sub-menu and can get the title of the page
	 @Test(priority=34)
	 public void ClickOnChangeOfVesselSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
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
	 
	 //Verify if user is able to Enter the Voyage number in the field in Change of Vessel sub-menu
	 @Test(priority=35)
	 public void EnterVoyageNumberInChangeOfVesselSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("CMACGM-W-050");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
	 }
	 
	//Verify if user is able to Select the Voyage number from the dropdown options in the Change of Vessel sub-menu
	 @Test(priority=36)
	 public void SelectVoyageNumberFromDropdownOptionsInChangeVesselSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();;
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00011-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 try {
		 managevoyagepage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
		 }
	 
	//Verify if user is able to enter the new Vessel name in the field in Change of Vessel sub-menu
	 @Test(priority=37)
	 public void EnterNewVesselNameInTheField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();;
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00013-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newvesselname("MSC Panama");
	 try {
		 managevoyagepage.waitCode();
		     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
			 
	 }
	 
	 //Verify if user is able to enter the new IMO number in the field in Change of Vessel sub-menu
	 @Test(priority=38)
	 public void EnterNewIMONumberInTheField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();;
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00013-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newvesselname("MSC Roma");
	 managevoyagepage.Enter_newIMOnumber("9202666");
	 try {
		 managevoyagepage.waitCode();
		     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
			 
	 }
	 
	 //Verify if user is able to click on Submit button to change the new vessal name and IMO number in Change of Vessel sub-menu
	 @Test(priority=39)
	 public void ClickOnSubmitButtonInChangeOfVesselSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();;
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00013-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newvesselname("MSC Rom");
	 managevoyagepage.Enter_newIMOnumber("920266");
	 managevoyagepage.Click_submitbtn();
	 try {
		 managevoyagepage.waitCode();
		     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 Assert.assertTrue(managevoyagepage.Success_message(), "Successfully Changed the Vessel name & IMO number" );
			 
	 }
	 
	//Verify if user has successfully changed the Vessel details or not and also verify it is displaying in list Voyage sub-menu
	 @Test(priority=40)
	 public void VerifyChangedVesselDetails() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageVoyagePage managevoyagepage = landingPage.ManageVoyagePageOption();
	 managevoyagepage.Click_changevessel();;
	 managevoyagepage.waitCode();
	 try {
		 managevoyagepage.Select_voyagenumber("V00013-S");
         } 
	 catch (Exception e) 
	     {
		    System.out.println("Executing corresponding Catch block");
	     }
	 managevoyagepage.waitCode();
	 managevoyagepage.Enter_newvesselname("MSC Roma");
	 managevoyagepage.Enter_newIMOnumber("9202666");
	 managevoyagepage.Click_submitbtn();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_listvoyage();
	 managevoyagepage.waitCode();
	 managevoyagepage.Click_ViewOnActionColumn("V00013-S");
	 try {
		 managevoyagepage.waitCode();
		 } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
				 
	 }
}

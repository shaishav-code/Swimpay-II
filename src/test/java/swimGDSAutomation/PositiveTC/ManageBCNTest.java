package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageBCNPage;


public class ManageBCNTest extends BaseClass {

	 String email = "cma@gmail.com";
     String password ="Admin@123";
	 String Email = "nda.norala@gmail.com";
     String Password ="Nikhil@86"; 
     
     
                  ////////////////////Enter BCN Number Range////////////////
  
	 //Verify if the user is able to click on Manage BCN menu and get the title of the page
	 @Test(priority=1)
	 public void ClickOnManageBCNMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
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
	 
	 //Verify if the user is able to enter the Starting number in the field in Enter BCN Number Range sub-menu
	 @Test(priority=3)
	 public void EnterStartingNumberInField() throws InterruptedException {
		 
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNrangesubmenu();
	 managebcnpage.waitCode();
	 managebcnpage.Enter_startingnumber("1");
	 try {
			managebcnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
	 }
	
	 }
	 
	 
	 //Verify if the user is able to enter the Ending number in the field in Enter BCN Number Range sub-menu
	 @Test(priority=4)
	 public void EnterEndingNumberInField() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNrangesubmenu();
	 managebcnpage.waitCode();
	 managebcnpage.Enter_startingnumber("1");
	 managebcnpage.Enter_Endingnumber("5");
	 try {
			managebcnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 }
	 
	 //Verify if the user is click on the Submit button after inserting the details in Enter BCN Number Range sub-menu
	 @Test(priority=5)
	 public void ClickOnSubmitButtonToEnterTheNumberRange() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNrangesubmenu();
	 managebcnpage.waitCode();
	 managebcnpage.Enter_startingnumber("11");
	 managebcnpage.Enter_Endingnumber("15");
	 managebcnpage.Click_submitBtn();
	 managebcnpage.waitCode();
	 try {
			managebcnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 Assert.assertTrue(managebcnpage.Success_message());
	 
	 }
	 
 	 //Verify if the Entered BCN Number Range has been added in Manage BCN Numbers submenu--Failed
	 //https://nda-narola.tinytake.com/msc/ODc5MTk3MV8yMjIxNDIyOA
	 @Test(priority=6)
	 public void VerifyBCNNumberRangeAdded() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNrangesubmenu();
	 managebcnpage.waitCode();
	 managebcnpage.Enter_startingnumber("6");
	 managebcnpage.Enter_Endingnumber("10");
	 managebcnpage.Click_submitBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
			
     }  
		 
	               ///////////////////////Manage BCN Numbers/////////////////////////// 
	 
	 //Verify if the user is able to click on Manage BCN number sub-menu and get the title of the page
	 @Test(priority=7)
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
	 
	 //Verify if the user is able to click on Add BCN number Range in Manage BCN Numbers sub-menu
	 @Test(priority=8)
	 public void ClickOnAddBCNNumberRangeButton() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	 }	
	 
     }
	 
	 //Verify if the user is able to close the Add BCN Range pop-up by simply clicking on cross icon in Manage BCN Numbers sub-menu
	 @Test(priority=9)
	 public void ClickOnCrossIconToCloseThePopup() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
	 managebcnpage.waitCode();
	 managebcnpage.Click_crossicon();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
	 
	 }
	 
	 //Verify if the user is able to Enter the Starting & Ending number in Add BCN number Range pop-up in Manage BCN Numbers sub-menu
	 @Test(priority=10)
	 public void EnterStartingAndEndingNumberInPopup() throws InterruptedException {
						 
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
	 managebcnpage.Enter_startingnumber("11");
	 managebcnpage.Enter_Endingnumber("15");
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
				e.printStackTrace();
		 }	
	 
     }
	 
	 //Verify if the user is able to Enter the Starting & Ending number in Add BCN number Range pop-up and click on Cancel button in Manage BCN Numbers sub-menu
	 @Test(priority=11)
	 public void EnterStartingAndEndingNumberAndClickCancelButtonInPopup() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
	 managebcnpage.Enter_startingnumber("11");
	 managebcnpage.Enter_Endingnumber("15");
	 managebcnpage.Click_CancelBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
	 
	 }
	 
	 //Verify if the user is able to Enter the Starting & Ending number in Add BCN number Range pop-up and click on Add button in Manage BCN Numbers sub-menu
	 @Test(priority=12)
	 public void EnterStartingAndEndingNumber_AndClickSaveButtonInPopup() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.waitCode();
	 managebcnpage.Click_AddBCNRangeBtn();
	 managebcnpage.Enter_startingnumber("11");
	 managebcnpage.Enter_Endingnumber("15");
	 managebcnpage.Click_AddBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
	 
	 }
	 
	 //Verify if the user is able to click on Menu toggle switch in Manage BCN Numbers sub-menu
	 @Test(priority=13)
	 public void ClickOnMenuToggleButton() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
	 
	 }
	 
	 //Verify if the user is able to select the menu options i.e.Inactive in Manage BCN Numbers sub-menu - Suggestion
	 @Test(priority=14)
	 public void SelectInactiveOptionFromMenuToggleButton() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Inactive");
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }	
	 
	 }
	 
	 //Verify if the user is able to select the menu options i.e.Active in Manage BCN Numbers sub-menu-Skip
	 @Test(priority=15, dependsOnMethods ="SelectInactiveOptionFromMenuToggleButton" )
	 public void SelectActiveOptionFromMenuToggleButton() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Inactive");
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
	 
	 }
	 
 	 //Verify if the user is able to select the menu options i.e.Edit in Manage BCN Numbers sub-menu
	 @Test(priority=16)
	 public void SelectEditOptionFromMenuToggleButton() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Edit");
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
		 
	 }
	 
 	 //Verify if the user is able to enter the Starting and Ending number in the Edit popup in Manage BCN Numbers sub-menu
	 @Test(priority=17)
	 public void EnterStartingAndEndingNumberInEditPopup() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Edit");
	 managebcnpage.Enter_startingnumber("16");
	 managebcnpage.Enter_Endingnumber("20");
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
		 
	 }
	 
	 //Verify if the user is able to enter the Starting and Ending number in the Edit popup and click on Cancel Button in Manage BCN Numbers sub-menu
	 @Test(priority=18)
	 public void EnterStartingAndEndingNumber_AndClickCancelButtonInEditPopup() throws InterruptedException {
						 
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Edit");
	 managebcnpage.Enter_startingnumberinedit("16");
	 managebcnpage.Enter_Endingnumberinedit("20");
	 managebcnpage.Click_CancelBtn();
	 try {
		managebcnpage.waitCode();
		 } 
		 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
			 
	 }
	 
	 //Verify if the user is able to enter the Starting and Ending number in the Edit popup and click on Save nutton in Manage BCN Numbers sub-menu
	 @Test(priority=19)
	 public void EnterStartingAndEndingNumber_AndClickSaveButtonInEditPopup() throws InterruptedException {
						 
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Edit");
	 managebcnpage.Enter_startingnumberinedit("16");
	 managebcnpage.Enter_Endingnumberinedit("20");
	 managebcnpage.Click_SaveBtn();
	 try {
		managebcnpage.waitCode();
		 } 
		 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
			 
	 }
	 
	 //Verify if the user is able to select the menu options i.e.Delete in Manage BCN Numbers sub-menu
	 @Test(priority=20)
	 public void SelectDeleteOptionFromMenuToggleButton() throws InterruptedException {
						 
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Delete");
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }		
			 
	 }	
	 
	 //Verify if the user is able to select the menu options i.e.Delete and Click on No option in the Manage BCN Numbers sub-menu
	 @Test(priority=21)
	 public void SelectDeleteOptionFromMenuToggleButton_AndClickNoBtn() throws InterruptedException {
						 
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Delete");
	 managebcnpage.waitCode();
	 managebcnpage.Click_Nobtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }	
			 
	 }	 
	 
	 //Verify if the user is able to select the menu options i.e. Delete and Click on Yes option in the Manage BCN Numbers sub-menu
	 @Test(priority=22)
	 public void SelectDeleteOptionFromMenuToggleButton_AndClickYesBtn() throws InterruptedException {
						 
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_manageBCNno();
	 managebcnpage.Click_menubtn(1);
	 managebcnpage.waitCode();
	 managebcnpage.Select_dropdownoption("Delete");
	 managebcnpage.waitCode();
	 managebcnpage.Click_Yesbtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }	
	 Assert.assertTrue(managebcnpage.Success_message());
	 		 
	 }	 
	 
	            ///////////////////////Cancel BCN///////////////////////
	 
	 //Verify if the user is able to click on Cancel BCN sub-menu and get the title of the page
	 @Test(priority=23)
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
	 
	 //Verify if the user is able to enter the BCN number in Cancel BCN sub-menu
	 @Test(priority=24)
	 public void EnterBCNNumber() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.Enter_BCNno("MMCU0000759"); 
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
		
     }
	 
	//Verify if the user is able to click on the Cancellation type dropdown in Cancel BCN sub-menu
	 @Test(priority=25)
	 public void ClickCancellationTypeDropdown() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000759"); 
	 managebcnpage.waitCode();
	 managebcnpage.click_cancellationtypedropdown();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
			
     }
		 	 
	 //Verify if the user is able to select the Cancellation type from the dropdown in Cancel BCN sub-menu
	 @Test(priority=26)
	 public void SelectTheCancellationTypeFromTheOption() throws InterruptedException {
			 
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000759"); 
	 managebcnpage.waitCode();
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("3. CRN Issued - Containers Collected - New Voyage Not Offered");
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 // Assert.assertTrue(false);
		
     }
	 
   	 //Verify if the user is able to click on submit button to cancel the BCN in Cancel BCN sub-menu
	 //https://nda-narola.tinytake.com/msc/ODc5MjE3NV8yMjIxNDQ2Mg
	 @Test(priority=27)
	 public void ClickOnSubmitButtonToCancelBCN() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000216"); //MMCU0000759
	 managebcnpage.waitCode();
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.waitCode();
	 managebcnpage.Click_submitBtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
	 		
	 }
	 
	 //Verify if the user is able to click on Show details in Cancel BCN sub-menu
	 @Test(priority=28)
	 public void ClickOnShowDetailsInCancelBCNPage() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000759"); 
	 managebcnpage.waitCode();
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.Click_submitBtn();
	 managebcnpage.waitCode();
	 managebcnpage.click_showdetails();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
		 		
	 }
	 
	 //Verify if the user is able to click on No option to cancel the BCN in Cancel BCN sub-menu
	 @Test(priority=29)
	 public void ClickOnNoButtonToCancelBCN() throws InterruptedException {
				 
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000759"); 
	 managebcnpage.waitCode();
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.Click_submitBtn();
	 managebcnpage.waitCode();
	 managebcnpage.scrolling();
	 managebcnpage.click_Nobtn();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
	     }
	 		
	 }
	 
	 //Verify if the user is able to click on Yes option to cancel the BCN and also verify if the entered BCN number has been cancelled or not in Cancel BCN sub-menu
	 @Test(priority=30)
	 public void ClickOnYesButtonToCancelBCN() throws InterruptedException {
					 
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_cancelBCN();
	 managebcnpage.waitCode();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.waitCode();
	 managebcnpage.Select_BCNNumberFromoption("MMCU0000759"); 
	 managebcnpage.click_cancellationtypedropdown();
	 managebcnpage.waitCode();
	 managebcnpage.Select_cancellationtypeoption("1. Before CRN Issued");
	 managebcnpage.Click_submitBtn();
	 managebcnpage.waitCode();
	 managebcnpage.scrolling();
	 managebcnpage.click_Yesbtn();
	 managebcnpage.waitCode();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		}
		 		
	 } 
	            
                /////////////////View BCN////////////////////
	 
	 //Verify if the user is able to click on View BCN sub-menu and get the title of the page
	 @Test(priority=31)
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
	 
	 //Verify if the user is able to enter the BCN number on View BCN sub-menu 
	 @Test(priority=32)
	 public void EnterBCNNumberInViewSubmenu() throws InterruptedException {
				 			
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
	 managebcnpage.Enter_BCNno("MMCU0000822");
			
	 }
	 
	 //Verify if the user is select the options of BCN from the dropdown on View BCN sub-menu 
	 @Test(priority=33)
	 public void SelectBCNOptionInViewSubmenu() throws InterruptedException {
				 			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageBCNPage managebcnpage = landingPage.ManageBCNPageOption();
	 managebcnpage.waitCode();
	 managebcnpage.Click_viewBCN();
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.Select_BCNnumberfromdropdownoption("MMCU0000009");
	 try {
			managebcnpage.waitCode();
		 } 
		 catch (InterruptedException e) {
				e.printStackTrace();
		 }
			
	 }
	 
	 //Verify if the user is click on View Button in View BCN sub-menu 
	 @Test(priority=34
			 )
	 public void ClickViewButtonInViewSubmenu() throws InterruptedException {
				 			
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
	 managebcnpage.Click_BCNnofield();
	 managebcnpage.Select_BCNnumberfromdropdownoption("MMCU0000009");
	 managebcnpage.click_ViewBCNbtn();
	 managebcnpage.waitCode();
	 managebcnpage.scrolling();
	 try {
		managebcnpage.waitCode();
		 } 
	 catch (InterruptedException e) {
			e.printStackTrace();
		 }
			
	 } 
           
                   //////////////////////Manage BCN////////////////////
	 
	 //Verify if the user is able to click on Manage BCN sub-menu and get the title of the page
	 @Test(priority=35)
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
	 managebcnpage.scrolling();
	 managebcnpage.titleOfPage();
	 managebcnpage.Click_PageNavigationArrow();
		
     }
	 
	 
	 //Verify if the user is able to click on Status dropdown in Manage BCN sub-menu 
	 @Test(priority=36)
	 public void ClickOnstatusDropdown() throws InterruptedException {
				 
				
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
	 managebcnpage.Click_dropdownfield(0);
	 managebcnpage.waitCode();
			
    }
	 
	 //Verify if the user is able to click on Select Buyer dropdown in Manage BCN sub-menu 
	 @Test(priority=37)
	 public void ClickOnBuyerNameDropdown() throws InterruptedException {				 
				
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
	 managebcnpage.Click_dropdownfield(1);
	 managebcnpage.waitCode();
			
    }
	 
	 //Verify if the user is able to select Pending status from the dropdown in Manage BCN sub-menu 
	 @Test(priority=38)
	 public void SelectStatusFromTheDropdown() throws InterruptedException {				 
					
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
	 managebcnpage.Click_dropdownfield(0);
	 managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_statusdropdownoption("Pending");
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 try {
			managebcnpage.waitCode();
			 } 
	 catch (InterruptedException e) {
				e.printStackTrace();
			 }
				
	   }
	 
	 
	 //Verify if the user is able to select the Buyer name from the dropdown in Manage BCN sub-menu 
	 @Test(priority=39)
	 public void SelectBuyerNameFromTheDropdown() throws InterruptedException {				 
				
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
	 managebcnpage.Click_dropdownfield(0);
	 managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_statusdropdownoption("Pending");
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 managebcnpage.waitCode();
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_buyerdropdownoption("KKS & CO.");
		
			 } 
	  catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			} 
			managebcnpage.waitCode();
				
	    }
	 
     //Verify if the user is able to click on menu button by selecting Status as pending for the buyer in Manage BCN sub-menu 
     @Test(priority=40)
  	 public void CiickMenuForSelectedStatusAsPending() throws InterruptedException {				 
					
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
	 managebcnpage.Click_dropdownfield(0);
	 managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_statusdropdownoption("Pending");
		 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
				}
	 managebcnpage.waitCode();
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_buyerdropdownoption("KKS & CO.");
		} 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			} 
	managebcnpage.waitCode();
	managebcnpage.Click_MenuOnActionColumn("MMCU0000812");
	managebcnpage.waitCode();
	
    }
		 
    //Verify if the user is able to select the View option from the menu dropdown for Pending Status in Manage BCN sub-menu 
    @Test(priority=41)
     public void SelectViewOptionForStatusAsPnding() throws InterruptedException {				 
					
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
	 managebcnpage.Click_dropdownfield(0);
	 managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_statusdropdownoption("Pending");
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
				}
	 managebcnpage.waitCode();
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_buyerdropdownoption("KKS & CO.");	
		 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
				} 
	managebcnpage.waitCode();
	managebcnpage.Click_MenuOnActionColumn("MMCU0000812");
	managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_menudropdownoption("View Details");
		 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
				} 
	managebcnpage.waitCode();
	managebcnpage.scrolling();
					
    }
		 
    //Verify if the user is able to select the Manage Document option from the menu dropdown for Pending Status in Manage BCN sub-menu 
    @Test(priority=42)
    public void SelectManageDocumentOptionForStatusAsPnding() throws InterruptedException {				 
					
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
	 managebcnpage.Click_dropdownfield(0);
	 managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_statusdropdownoption("Pending");
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 managebcnpage.waitCode();
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_buyerdropdownoption("KKS & CO.");
		 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
				} 
	managebcnpage.waitCode();
	managebcnpage.Click_MenuOnActionColumn("MMCU0000812");
	managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_menudropdownoption("Manage Document");
		 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
				} 
	managebcnpage.waitCode();
					
   }
		 

	    //Verify if the user is able to select the Cancel BCN option from the menu dropdown and click on No button for Deposit Paid Status in Manage BCN sub-menu 
	    @Test(priority=43)
  	    public void SelectCancelDocumentOptionForStatusAsDepositPaid() throws InterruptedException {				 
					
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
		 managebcnpage.Click_dropdownfield(0);
		 managebcnpage.waitCode();
		 try {
			 managebcnpage.Select_statusdropdownoption("Deposit Paid");
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				}
		 managebcnpage.waitCode();
		 managebcnpage.Click_dropdownfield(1);
		 try {
			 managebcnpage.Select_buyerdropdownoption("KKS & CO.");
			
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				} 
		managebcnpage.waitCode();
		managebcnpage.Click_MenuOnActionColumn("MMCU0000748");
		managebcnpage.waitCode();
		managebcnpage.Select_menudropdownoption("Cancel BCN");
		managebcnpage.waitCode();
		managebcnpage.Click_nobtn_tocancelbcn(0);
					
	    }
	    
	    //Verify if the user is able to select the Cancel BCN option from the menu dropdown and click on Yes button for Deposit Paid Status in Manage BCN sub-menu 
	    @Test(priority=44)
  	    public void SelectCancelDocumentOptionForStatusAsDepositPaid_AndClickOnYesButton() throws InterruptedException {				 
					
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
		 managebcnpage.Click_dropdownfield(0);
		 managebcnpage.waitCode();
		 try {
			 managebcnpage.Select_statusdropdownoption("Deposit Paid");
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				}
		 managebcnpage.waitCode();
		 managebcnpage.Click_dropdownfield(1);
		 try {
			 managebcnpage.Select_buyerdropdownoption("KKS & CO.");
			
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				} 
		managebcnpage.waitCode();
		managebcnpage.Click_MenuOnActionColumn("MMCU0000748");
		managebcnpage.waitCode();
		managebcnpage.Select_menudropdownoption("Cancel BCN");
		managebcnpage.waitCode();
		managebcnpage.Click_yesbtn_tocancelbcn(0);
		managebcnpage.waitCode();
		managebcnpage.Click_submitBtn();
		managebcnpage.waitCode();
		managebcnpage.scrolling();
		managebcnpage.click_Yesbtn();
	    managebcnpage.waitCode();
		try {
			managebcnpage.waitCode();
			 } 
	    catch (InterruptedException e) {
				e.printStackTrace();
			}
			 		
		 } 
	 
	    //Verify if the user is able to select the View details option from the menu dropdown for Balance Paid Status in Manage BCN sub-menu 
	    @Test(priority=44)
  	    public void SelectViewDetailsOptionForStatusAsBalancePaid() throws InterruptedException {				 
					
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
		 managebcnpage.Click_dropdownfield(0);
		 managebcnpage.waitCode();
		 try {
			 managebcnpage.Select_statusdropdownoption("Balance Paid");
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				}
		 managebcnpage.waitCode();
		 managebcnpage.Click_dropdownfield(1);
		 try {
			 managebcnpage.Select_buyerdropdownoption("DB Schenker");
			
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				} 
		managebcnpage.waitCode();
		managebcnpage.Click_MenuOnActionColumn("MMCU0000588");
		managebcnpage.waitCode();	
		try {
			managebcnpage.Select_menudropdownoption("View Details");
			
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				} 

		managebcnpage.waitCode();
					
	   }
	 
	    //Verify if the user is able to select the Manage Doument option from the menu dropdown for Balance Paid Status in Manage BCN sub-menu 
	    @Test(priority=46)
  	    public void SelectManageDocumentOptionForStatusAsBalancePaid() throws InterruptedException {				 
					
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
		 managebcnpage.Click_dropdownfield(0);
		 managebcnpage.waitCode();
		 try {
			 managebcnpage.Select_statusdropdownoption("Balance Paid");
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				}
		 managebcnpage.waitCode();
		 managebcnpage.Click_dropdownfield(1);
		 try {
			 managebcnpage.Select_buyerdropdownoption("DB Schenker");
			
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				} 
		managebcnpage.waitCode();
		managebcnpage.Click_MenuOnActionColumn("MMCU0000588");
		managebcnpage.waitCode();		
		try {
			managebcnpage.Select_menudropdownoption("Manage Document");
			
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				} 		
		managebcnpage.waitCode();
					
	   }
	    

	    //Verify if the user is able to select the Complete Status with the Buyer name in Manage BCN sub-menu 
	    @Test(priority=47)
 	    public void SelectCompletedStatusWithBuyerName() throws InterruptedException {				 
						
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
		 managebcnpage.Click_dropdownfield(0);
		 managebcnpage.waitCode();
		 try {
			 managebcnpage.Select_statusdropdownoption("Completed");
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				}
		 managebcnpage.waitCode();
		 managebcnpage.Click_dropdownfield(1);
		 try {
			 managebcnpage.Select_buyerdropdownoption("DB Schenker");
					 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				} 
		managebcnpage.waitCode();
			
	   }
	 
	   //Verify if the user is able to select the View details option from the menu dropdown for the Cancelled Status in Manage BCN sub-menu 
       @Test(priority=48)
	    public void SelectViewDetailsOptionForStatusAsCancelled() throws InterruptedException {				 
						
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
		 managebcnpage.Click_dropdownfield(0);
		 managebcnpage.waitCode();
		 try {
			 managebcnpage.Select_statusdropdownoption("Cancelled");
				 } 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
				}
		 managebcnpage.waitCode();
		 managebcnpage.Click_dropdownfield(1);
		 try {
			 managebcnpage.Select_buyerdropdownoption("KKS & CO.");
			} 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
			} 
		managebcnpage.waitCode();
		managebcnpage.Click_MenuOnActionColumn("MMCU0000815");
		managebcnpage.waitCode();		
		 try {
				managebcnpage.Select_menudropdownoption("View Details");
			} 
		 catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
			} 	
		managebcnpage.waitCode();
						
	   }
	 
       //Verify if the user is able to select the Manage Document option from the menu dropdown for the Cancelled Status in Manage BCN sub-menu 
       @Test(priority=49)
       public void SelectManageDocumentOptionForStatusAsCancelled() throws InterruptedException {				 
						
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
	  managebcnpage.Click_dropdownfield(0);
	  managebcnpage.waitCode();
	  try {
			 managebcnpage.Select_statusdropdownoption("Cancelled");
					 } 
	  catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
	  		}
	  managebcnpage.waitCode();
	  managebcnpage.Click_dropdownfield(1);
	  try {
	    	 managebcnpage.Select_buyerdropdownoption("KKS & CO.");				
		 } 
	  catch (Exception e) {
					System.out.println("Executing corresponding Catch block");
			} 
   	 managebcnpage.waitCode();
	 managebcnpage.Click_MenuOnActionColumn("MMCU0000815");
	 managebcnpage.waitCode();
	 try {
		 managebcnpage.Select_menudropdownoption("Manage Document");
				 } 
     catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
  		}
	 managebcnpage.waitCode();
						
    }
	 
    //Verify if the user is able to select the View details option from the menu dropdown for Cancelled due to non payment Status in Manage BCN sub-menu 
    @Test(priority=50)
    public void SelectViewDetailsOptionForStatusAsCancelledDueToNonPayment() throws InterruptedException {				 
							
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
	managebcnpage.Click_dropdownfield(0);
	managebcnpage.waitCode();
	try {
	 managebcnpage.Select_statusdropdownoption("Cancelled due to non payment");
	    } 
    catch (Exception e) {
     	System.out.println("Executing corresponding Catch block");
						}
	managebcnpage.waitCode();
	managebcnpage.Click_dropdownfield(1);
	try {
		managebcnpage.Select_buyerdropdownoption("KKS & CO.");					
		} 
	catch (Exception e) {
		System.out.println("Executing corresponding Catch block");
		} 
	managebcnpage.waitCode();
	managebcnpage.Click_MenuOnActionColumn("MMCU0000804");
	managebcnpage.waitCode();
	try {
		managebcnpage.Select_menudropdownoption("View Details");
		    } 
    catch (Exception e) {
	    System.out.println("Executing corresponding Catch block");
							}
	managebcnpage.waitCode();
						
    }
	 
	//Verify if the user is able to select the View details option from the menu dropdown for Cancelled By System Status in Manage BCN sub-menu
	@Test(priority = 51)
	public void SelectViewDetailsOptionForStatusAsCancelledBySystem() throws InterruptedException {

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
		managebcnpage.Click_manageBCNsubmenu();
		managebcnpage.Click_dropdownfield(0);
		managebcnpage.waitCode();
		try {
			managebcnpage.Select_statusdropdownoption("Cancelled By System");
		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.waitCode();
		managebcnpage.Click_dropdownfield(1);
		try {
			managebcnpage.Select_buyerdropdownoption("KKS & CO.");

		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.waitCode();
		managebcnpage.Click_MenuOnActionColumn("MMCU0000800");
		managebcnpage.waitCode();
		managebcnpage.Click_dropdownfield(1);
		try {
			managebcnpage.Select_menudropdownoption("View Details");

		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}	
		managebcnpage.waitCode();

	}

	// Verify if the user is able to select the Manage Document option from the menu dropdown for Cancelled By System Status in Manage BCN sub-menu
	@Test(priority = 52)
	public void SelectManageDocumentOptionForStatusAsCancelledBySystem() throws InterruptedException {

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
		managebcnpage.Click_manageBCNsubmenu();
		managebcnpage.Click_dropdownfield(0);
		managebcnpage.waitCode();
		try {
			managebcnpage.Select_statusdropdownoption("Cancelled By System");
		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.waitCode();
		managebcnpage.Click_dropdownfield(1);
		try {
			managebcnpage.Select_buyerdropdownoption("KKS & CO.");

		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.waitCode();
		managebcnpage.Click_MenuOnActionColumn("MMCU0000800");
		managebcnpage.waitCode();
		try {
			managebcnpage.Select_menudropdownoption("Manage Document");
		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.waitCode();


	}

	//Verify if the user is able to click on Ascending & Descending arrow in Manage BCN sub-menu---Fail
	//https://nda-narola.tinytake.com/msc/ODgwMTc1NV8yMjIyNjY4Mw
	@Test(priority = 53)
	public void ClickOnAscDescArrowInManageBCNSubmenu() throws InterruptedException {

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
		managebcnpage.Click_manageBCNsubmenu();
		managebcnpage.Click_Ascarrow();
		managebcnpage.Click_Descarrow();
		managebcnpage.waitCode();
		Assert.assertTrue(false);

	}

		            ////////////////////////////Review Balance Shift////////////////////////////////
	 
	 
	 //Verify if the user is able to click on Review Balance shift sub-menu and get the title of the page
	@Test(priority=54)
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
	 managebcnpage.Click_toseethedetails();
	 managebcnpage.Click_PageNavigationArrow();
		
     }
	
	 //Verify if the user is able to select the status as Open for the Buyer on Review Balance shift sub-menu 
     @Test(priority=55)
	 public void SelectStatusAsOpenforTheBuyer() throws InterruptedException {
				 
				
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
	 managebcnpage.Click_dropdownfield(0);
	 try {
		 managebcnpage.Select_buyerdropdownoption_InBalReviewShift("DB Schenker");	
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_statusdropdownoption("Open");		
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			} 
	 managebcnpage.waitCode();
	 
			
     }
        

	 //Verify if the user is able to select the status as Open for the Buyer and can able to click on Decline button on Review Balance shift sub-menu- Fail
     @Test(priority=56)
	 public void SelectStatusAsOpenforTheBuyerAndClickDeclinebutton() throws InterruptedException {
				 
				
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
	 managebcnpage.Click_dropdownfield(0);
	 try {
		 
		 managebcnpage.Select_buyerdropdownoption_InBalReviewShift("DB Schenker");	
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_statusdropdownoption("Open");		
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			} 
	 managebcnpage.waitCode();
	 managebcnpage.Click_toseethedetails();
	 managebcnpage.waitCode();
	 managebcnpage.Click_declinebtn();
	 try {
			managebcnpage.waitCode();
			 } 
		 catch (InterruptedException e) {
				e.printStackTrace();
		 }
	 Assert.assertTrue(managebcnpage.Success_message());
			
     }
	
     //Verify if the user is able to select the status as Open for the Buyer and can able to click on Accept button on Review Balance shift sub-menu 
     @Test(priority=57)
	 public void SelectStatusAsOpenforTheBuyerAndClickAcceptbutton() throws InterruptedException {
				 
				
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
	 managebcnpage.Click_dropdownfield(0);
	 try {
		 
		 managebcnpage.Select_buyerdropdownoption_InBalReviewShift("DB Schenker");	
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_statusdropdownoption("Open");		
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			} 
	 managebcnpage.waitCode();
	 managebcnpage.Click_toseethedetails();
	 managebcnpage.waitCode();
	 managebcnpage.Click_acceptbtn();
	 try {
			managebcnpage.waitCode();
			 } 
		 catch (InterruptedException e) {
				e.printStackTrace();
		 }
	 Assert.assertTrue( managebcnpage.Success_message());
			
     }
	
	//Verify if the user is able to select the status as Accepted for the Buyer on Review Balance shift sub-menu
	@Test(priority = 58)
	public void SelectStatusAsAcceptedforTheBuyer() throws InterruptedException {

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
	managebcnpage.Click_reviewbalanceshift();
	managebcnpage.waitCode();
	managebcnpage.Click_dropdownfield(0);
		try {
			managebcnpage.Select_buyerdropdownoption_InBalReviewShift("DB Schenker");
		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
	managebcnpage.Click_dropdownfield(1);
	    try {
			managebcnpage.Select_statusdropdownoption("Accepted");
			} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
	managebcnpage.waitCode();
	managebcnpage.Click_toseethedetails();

	}

	// Verify if the user is able to select the status as Declined for the Buyer on Review Balance shift sub-menu
	@Test(priority = 59)
	public void SelectStatusAsDeclinedforTheBuyer() throws InterruptedException {

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
	managebcnpage.Click_reviewbalanceshift();
	managebcnpage.waitCode();
	managebcnpage.Click_dropdownfield(0);
		try {
			managebcnpage.Select_buyerdropdownoption_InBalReviewShift("DB Schenker");
			} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
			}
	managebcnpage.Click_dropdownfield(1);
			try {
			managebcnpage.Select_statusdropdownoption("Declined");
			} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
			}
	managebcnpage.waitCode();
	managebcnpage.Click_toseethedetails();

		}	
	
	// Verify if the user is able to select the status as Lapsed for the Buyer on Review Balance shift sub-menu
	@Test(priority = 60)
	public void SelectStatusAsLapsedforTheBuyer() throws InterruptedException {

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
	managebcnpage.Click_reviewbalanceshift();
	managebcnpage.waitCode();
	managebcnpage.Click_dropdownfield(0);
		try {
			managebcnpage.Select_buyerdropdownoption_InBalReviewShift("DB Schenker");
			} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
			}
	managebcnpage.Click_dropdownfield(1);
			try {
			managebcnpage.Select_statusdropdownoption("Lapsed");
			} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
			}
	managebcnpage.waitCode();
	managebcnpage.Click_toseethedetails();

	} 
	
	
		         ////////////////////////Manage Alternate Voyage//////////////////////////////
	 
	 //Verify if the user is able to click on Manage Alternate Voyage sub-menu and get the title of the page
	 @Test(priority=61)
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
	 managebcnpage.Click_toseethemanagedetails();
	 managebcnpage.Click_PageNavigationArrow();
		
     }
	 
	 
	 //Verify if the user is able to select the status as Open for the Buyer in Manage Alternate Voyage sub-menu
     @Test(priority=62)
	 public void SelectStatusAsOpenforTheBuyer_inManageAltVoyageSubmenu() throws InterruptedException {
			 
			
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
	 managebcnpage.Click_dropdownfield(0);
	 try {
		 managebcnpage.Select_buyerdropdownoption_inManageVoyage("DB Schenker");
		
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_statusdropdownoption("Open");
		
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			} 
	managebcnpage.waitCode();
    managebcnpage.Click_toseethemanagedetails();
    managebcnpage.Click_PageNavigationArrow();
		
     }
     
     
     //Verify if the user is able to select the status as Accepted for the Buyer in Manage Alternate Voyage sub-menu
     @Test(priority=63)
	 public void SelectStatusAsAcceptedforTheBuyer_InManagelternateVoyageSubmenu() throws InterruptedException {
			 
			
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
	 managebcnpage.Click_dropdownfield(0);
	 try {
		 managebcnpage.Select_buyerdropdownoption_inManageVoyage("DB Schenker");
		
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			}
	 managebcnpage.Click_dropdownfield(1);
	 try {
		 managebcnpage.Select_statusdropdownoption("Accepted");
		
			 } 
	 catch (Exception e) {
				System.out.println("Executing corresponding Catch block");
			} 
	 managebcnpage.waitCode();
	 managebcnpage.Click_toseethemanagedetails();
	 managebcnpage.Click_PageNavigationArrow();
		
    }


	//Verify if the user is able to select the status as Declined for the Buyer in Manage Alternate Voyage Sub-menu
	@Test(priority = 64)
	public void SelectStatusAsDeclinedforTheBuyer_InManageAltVoyageSubmenu() throws InterruptedException {

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
		managebcnpage.Click_manageAlternatevoyage();
		managebcnpage.waitCode();
		managebcnpage.Click_dropdownfield(0);
		try {
			managebcnpage.Select_buyerdropdownoption_inManageVoyage("DB Schenker");

		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.Click_dropdownfield(1);
		try {
			managebcnpage.Select_statusdropdownoption("Declined");

		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.waitCode();
	    managebcnpage.Click_toseethemanagedetails();
	    managebcnpage.Click_PageNavigationArrow();

	}

	//Verify if the user is able to select the status as Lapsed for the Buyer on Manage Alternate Voyage sub-menu
	@Test(priority = 65)
	public void SelectStatusAsLapsedforTheBuyer_InManageAltVoyageSubmenu() throws InterruptedException {

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
		managebcnpage.Click_manageAlternatevoyage();
		managebcnpage.waitCode();
		managebcnpage.Click_dropdownfield(0);
		try {
			managebcnpage.Select_buyerdropdownoption_inManageVoyage("DB Schenker");

		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.Click_dropdownfield(1);
		try {
			managebcnpage.Select_statusdropdownoption("Lapsed");

		} catch (Exception e) {
			System.out.println("Executing corresponding Catch block");
		}
		managebcnpage.waitCode();
	    managebcnpage.Click_toseethemanagedetails();
	    managebcnpage.Click_PageNavigationArrow();

	} 

}

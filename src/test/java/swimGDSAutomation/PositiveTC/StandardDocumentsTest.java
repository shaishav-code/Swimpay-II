package swimGDSAutomation.PositiveTC;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.StandardDocumentsPage;

public class StandardDocumentsTest extends BaseClass {

	 String email = "cma@gmail.com";
     String password ="Admin@123";
	 String Email = "nda.norala@gmail.com";
     String Password ="Nikhil@86"; 
	
                 //////////////////////////Upload T&C's///////////////////////
     
     //Verify if the user is able to click on Standard Documents menu and get the title of the page
	 @Test(priority=1)
	 public void ClickOnStandardDocumentsMenu() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.titleOfPage();
		
	 }
	 
     //Verify if the user is able to do logout from the Standard Documents menu 
	 @Test(priority=2)
	 public void ClickLogoutFromStandardDocumentsMenu() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Logoutbtn();
		
	 }
	 
     //Verify if the user is able to click on Upload T&C's sub-menu and get the title of the page
	 @Test(priority=3)
	 public void ClickOnUploadTermsNConditionsSubmenu() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertEquals(standarddocumentsnpage.titleOfPage(), "SWiM GDS - Seller - Upload T&C's");
		
	 }
	 
	 //Verify if the user is able to enter the Version number in the field
	 @Test(priority=4)
	 public void EnterTheVersionNumberInField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
     standarddocumentsnpage.Enter_version("1.3");
     standarddocumentsnpage.waitCode();
		
	 }
	 
	 //Verify if the user is able to click on Effective date field and calender should be visible for the current month
	 @Test(priority=5)
	 public void ClickEffectiveDateField() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
     standarddocumentsnpage.Enter_version("1.3");
     standarddocumentsnpage.Click_datefield();
     standarddocumentsnpage.waitCode();
		
	 }
	 
	 //Verify if the user is able to select the Effective date from the calender
	 @Test(priority=6)
	 public void SelectEffectiveDateFromTheCalender() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
     standarddocumentsnpage.Enter_version("1.3");
     standarddocumentsnpage.Click_datefield();
     standarddocumentsnpage.waitCode();
     standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
		
	 }
	 
     //Verify if the user is able to click on Select file to upload file and file explorer should get displayed in upload T&C's submenu.
	 @Test(priority=7)
	 public void ClickOnSelctFileToUploadField() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
     standarddocumentsnpage.Enter_version("1.3");
     standarddocumentsnpage.Click_datefield();
     standarddocumentsnpage.waitCode();
     standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     standarddocumentsnpage.Click_uploadfilefield();
     try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
			
	 }
	 
     //Verify whether the user can successfully choose the file they wish to upload in upload T&C's submenu.
	 //@Test(priority=8)
	 public void SelectTheFileToUpload() throws InterruptedException, AWTException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
     standarddocumentsnpage.Enter_version("1.3");
     standarddocumentsnpage.Click_datefield();
     standarddocumentsnpage.waitCode();
     standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     standarddocumentsnpage.Click_uploadfilefield();
     standarddocumentsnpage.waitCode();
     standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
     try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
			
	 }
	 
	 //Verify if the user is able to click on Upload T&C button and success message should get displayed in upload T&C's submenu.
	 //@Test(priority=9)
	 public void ClickOnUploadTnCButton() throws InterruptedException, AWTException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
     standarddocumentsnpage.Enter_version("1.3");
     standarddocumentsnpage.Click_datefield();
     standarddocumentsnpage.waitCode();
     standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     standarddocumentsnpage.Click_uploadfilefield();
     standarddocumentsnpage.waitCode();
     standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
     standarddocumentsnpage.Click_uploadTnCbtn();
     try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertTrue(standarddocumentsnpage.Success_message());
			
	 }
	 
	 //Verify if the user has successfully upload the T&C file in View T&C history in upload T&C's submenu.
	 //@Test(priority=10)
	 public void VerifyFileUploadedOrNot() throws InterruptedException, AWTException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadTnCsubmenu();
     standarddocumentsnpage.Enter_version("1.3");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
     standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     standarddocumentsnpage.Click_uploadfilefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
     standarddocumentsnpage.Click_uploadTnCbtn();
     try {
	 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertTrue(standarddocumentsnpage.Success_message()); 
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Click_viewTnCsubmenu();
	 standarddocumentsnpage.Click_eyeicon("1");
	 standarddocumentsnpage.waitCode();
				
	 } 
	 
	                //////////////////////////View T&C's History////////////////////
	 
	 
	 //Verify if the user is able to click on View T&C's History sub-menu and get the title of the page
	 @Test(priority=11)
	 public void ClickOnViewTermsNConditionsHistorySubmenu() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_viewTnCsubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertEquals(standarddocumentsnpage.titleOfPage(), "SWiM GDS - Seller - Sellers Standard Terms & Conditions");
		
	 }
	 
	 //Verify if the user is able to click on Eye icon to view the uploaded file in View T&C's History sub-menu
	 @Test(priority=12)
	 public void ClickOnEyeIconInViewTnCHistorySubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_viewTnCsubmenu();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.scrolling();
	 standarddocumentsnpage.Click_eyeicon("2.1");
	 try {
			standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
		
	 }
	 
	 //Verify if the user is able to click on Download icon to downlaod the uploaded file in View T&C's History sub-menu
	 @Test(priority=13)
	 public void ClickOnDownloadeIconInViewTnCHistorySubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_viewTnCsubmenu();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.scrolling();
	 standarddocumentsnpage.Click_Downloadicon("2.1");
	 try {
			standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
		
	 } 
	 
	                 //////////////////////////Upload Forms/////////////////////////
	 
	 //Verify if the user is able to click on Upload Forms sub-menu and get the title of the page
	 @Test(priority=14)
	 public void ClickOnUploadFormsSubmenu() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertEquals(standarddocumentsnpage.titleOfPage(), "SWiM GDS - Seller - Upload Forms");
		
	 }
	 
	 //Verify if the user is able to click on the Document form field in Upload Forms submenu
	 @Test(priority=15)
	 public void ClickOnSelectDocumentFormField() {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Click_Selectdocumentfield();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
			
	 }	 
	 
     //Verify if the user is able to select the SOC CSC Certification & Identity Form options from the dropdown in Upload Forms submenu
	 @Test(priority=16)
	 public void SelectTheSocCscCertificationAndIdentityFormOption() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     standarddocumentsnpage.Selectoptionsfromdropdown("SOC CSC Certification & Identity Form");
     standarddocumentsnpage.waitCode();
			
	 }
	 
	 //Verify if the user is able to enter the Version number in the field in Upload forms submenu
	 @Test(priority=17)
	 public void EnterTheVersionNumberInTheFieldInUploadFormSubmenu() throws InterruptedException {
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Selectoptionsfromdropdown("SOC CSC Certification & Identity Form");
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.waitCode();

     }

     // Verify if the user is able to select the Effective date from the calender in Upload forms submenu
     @Test(priority = 18)
     public void SelectEffectiveDateFromTheCalenderInUploadFormsSubmenu() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
	 	standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
	 	e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("SOC CSC Certification & Identity Form");
	 try {
			standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
   	 try {
	 	 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
	 	 e.printStackTrace();
	 }

     }
     
	 
     //Verify if the user has successfully upload the form in the SOC CSC Certification & Identity Form tab in View Forms History submenu ////////////////////////////
	 //@Test(priority=19)
	 public void VerifyFileUploadedOrNotInSOCCSCCertificationIdentityForm() throws InterruptedException, AWTException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("SOC CSC Certification & Identity Form");
     standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
     standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
     standarddocumentsnpage.Click_uploadfilefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
     standarddocumentsnpage.Click_uploadTnCbtn();
     try {
	 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertTrue(standarddocumentsnpage.Success_message()); 
	 standarddocumentsnpage.Click_viewformsubmenu();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Click_eyeicon("1.1");
	 standarddocumentsnpage.waitCode();
				
	 } 
	 
	 
	 //Verify if the user is able to select the SOC Indemmnity Form option from the dropdown in Upload Forms submenu
	 @Test(priority=20)
	 public void SelectTheSOCIndemmnityFormOption() throws InterruptedException {
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Selectoptionsfromdropdown("SOC Indemmnity Form");
     standarddocumentsnpage.waitCode();
			
	 }
		 
	 //Verify if the user is able to enter the Version number in the SOC Indemmnity Form in Upload forms submenu
	 @Test(priority=21)
	 public void EnterTheVersionNumberInSOCIndemmnityFormInUploadFormSubmenu() throws InterruptedException {
							
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Selectoptionsfromdropdown("SOC Indemmnity Form");
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.waitCode();

     }

     //Verify if the user is able to select the Effective date from the calender in the SOC Indemmnity Form in Upload forms submenu
	 @Test(priority = 22)
	 public void SelectEffectiveDateFromTheCalenderInSOCIndemmnityForm() throws InterruptedException {

     LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
	 	standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
	 	e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("SOC Indemmnity Form");
	 try {
			standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
	 try {
		 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
	 	 e.printStackTrace();
		 }

     }
	 
	 //Verify if the user has successfully upload the form in the SOC Indemmnity Form in View Forms History submenu ////////////////////////////
	 //@Test(priority=23)
	 public void VerifyFileUploadedOrNotInSOCIndemmnityForm() throws InterruptedException, AWTException {
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("SOC Indemmnity Form");
     standarddocumentsnpage.Enter_version("1.3");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     standarddocumentsnpage.Click_uploadfilefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
     standarddocumentsnpage.Click_uploadTnCbtn();
     try {
	 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertTrue(standarddocumentsnpage.Success_message()); 
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Click_viewformsubmenu();
	 standarddocumentsnpage.Click_SOCtab2();
	 standarddocumentsnpage.Click_eyeicon("1.1");
	 standarddocumentsnpage.waitCode();
					
	 } 
	

	 //Verify if the user is able to select the Hazardous Goods Declaration option from the dropdown in Upload Forms submenu
	 @Test(priority=24)
	 public void SelectTheHazardousGoodsDeclarationOption() throws InterruptedException {
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Selectoptionsfromdropdown("Hazardous Goods Declaration");
     standarddocumentsnpage.waitCode();
			
	 }
		 
	 //Verify if the user is able to enter the Version number in the Hazardous Goods Declaration tab in Upload forms submenu
	 @Test(priority=25)
	 public void EnterTheVersionNumberInHazardousGoodsDeclarationTabInUploadFormSubmenu() throws InterruptedException {
							
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Selectoptionsfromdropdown("Hazardous Goods Declaration");
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.waitCode();

     }

     //Verify if the user is able to select the Effective date from the calender in the Hazardous Goods Declaration tab in Upload forms submenu
	 @Test(priority = 26)
	 public void SelectEffectiveDateFromTheCalenderInHazardousGoodsDeclarationTab() throws InterruptedException {

     LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
	 	standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
	 	e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("Hazardous Goods Declaration");
	 try {
			standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
	 try {
		 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
	 	 e.printStackTrace();
		 }

     }
	     
		 
	 //Verify if the user has successfully upload the form in the Hazardous Goods Declaration tab in View Forms History submenu ////////////////////////////
	 //@Test(priority=27)
	 public void VerifyFileUploadedOrNotInHazardousGoodsDeclaration() throws InterruptedException, AWTException {
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("Hazardous Goods Declaration");
     standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     standarddocumentsnpage.Click_uploadfilefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
     standarddocumentsnpage.Click_uploadTnCbtn();
     try {
	 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertTrue(standarddocumentsnpage.Success_message()); 
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Click_viewformsubmenu();
	 standarddocumentsnpage.Click_SOCtab3();
	 standarddocumentsnpage.Click_eyeicon("1.1");
	 standarddocumentsnpage.waitCode();
					
	 } 	 
	 
	 
	 //Verify if the user is able to select the Forwarding Instructions Form option from the dropdown in Upload Forms submenu
	 @Test(priority=28)
	 public void SelectTheForwardingInstructionsFormption() throws InterruptedException {
							
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Selectoptionsfromdropdown("Forwarding Instructions Form");
     standarddocumentsnpage.waitCode();
			
	 }
			 
	 //Verify if the user is able to enter the Version number in the Forwarding Instructions Form tab in Upload forms submenu
	 @Test(priority=29)
	 public void EnterTheVersionNumberInForwardingInstructionsFormTabInUploadFormSubmenu() throws InterruptedException {
								
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Selectoptionsfromdropdown("Forwarding Instructions Form");
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.waitCode();
	 
     }

     //Verify if the user is able to select the Effective date from the calender in the Forwarding Instructions Form tab in Upload forms submenu
	 @Test(priority = 30)
	 public void SelectEffectiveDateFromTheCalenderInForwardingInstructionsFormTab() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
	 	standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
	 	e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("Forwarding Instructions Form");
	 try {
			standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	 standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
	 try {
	 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
	 	 e.printStackTrace();
		 }

     }
		     
			 
	 //Verify if the user has successfully upload the form in the Forwarding Instructions Form tab in View Forms History submenu ////////////////////////////
	 //@Test(priority=31)
	 public void VerifyFileUploadedOrNotInForwardingInstructionsForm() throws InterruptedException, AWTException {
						
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_uploadformssubmenu();
	 standarddocumentsnpage.Selectoptionsfromdropdown("Hazardous Goods Declaration");
     standarddocumentsnpage.Enter_version("1.1");
	 standarddocumentsnpage.Click_datefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.SelectdatenMonth("November 2023", "07");
     standarddocumentsnpage.Click_uploadfilefield();
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
     standarddocumentsnpage.Click_uploadTnCbtn();
     try {
	     standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
     Assert.assertTrue(standarddocumentsnpage.Success_message()); 
	 standarddocumentsnpage.waitCode();
	 standarddocumentsnpage.Click_viewformsubmenu();
	 standarddocumentsnpage.Click_SOCtab4();
	 standarddocumentsnpage.Click_eyeicon("1.1");
	 standarddocumentsnpage.waitCode();
						
	 } 	
	 
	                  //////////////////////View Forms History////////////////////////
	 
	 //Verify if the user is able to click on View Forms History sub-menu and get the title of the page
     @Test(priority=32)
	 public void ClickOnViewFormsHistorySubmenu() {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
	 try {
		 standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 standarddocumentsnpage.Click_viewformsubmenu();
	 try {
		standarddocumentsnpage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
     Assert.assertEquals(standarddocumentsnpage.titleOfPage(), "SWiM GDS - Seller - View Forms History"); 
			
	 } 
     
     //Verify if the user is able to click on Eye icon to view the uploaded form in the Forwarding Instructions Form tab in View Forms History sub-menu
   	 @Test(priority=33)
   	 public void ClickOnEyeIconInSOCCSCCertificationAndIdentityFormTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 standarddocumentsnpage.Click_viewformsubmenu();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_eyeicon_inTab1("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 }
   	 
   	 //Verify if the user is able to click on Download icon to downlaod the uploaded file in the SOC CSC Certification & Identity Form tab in View Forms History sub-menu
   	 @Test(priority=34)
   	 public void ClickOnDownloadeIconInSOCCSCCertificationAndIdentityFormTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
     standarddocumentsnpage.Click_viewformsubmenu();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_downlaodicon_inTab1("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 } 
   	 
     //Verify if the user is able to click on Eye icon to view the uploaded form in the SOC Indemmnity Form tab in View Forms History sub-menu
   	 @Test(priority=35)
   	 public void ClickOnEyeIconSOCIndemmnityFormmTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 standarddocumentsnpage.Click_viewformsubmenu();
   	 standarddocumentsnpage.Click_SOCtab2();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_eyeicon_inTab2("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 }
   	 
   	 //Verify if the user is able to click on Download icon to downlaod the uploaded file in the SOC Indemmnity Form tab in View Forms History sub-menu
   	 @Test(priority=36)
   	 public void ClickOnDownloadIconSOCIndemmnityFormmTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
     standarddocumentsnpage.Click_viewformsubmenu();
     standarddocumentsnpage.Click_SOCtab2();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_downlaodicon_inTab2("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 } 
   	 
   	 //Verify if the user is able to click on Eye icon to view the uploaded form in the Hazardous Goods Declaration tab in View Forms History sub-menu
   	 @Test(priority=37)
   	 public void ClickOnEyeIconInHazardousGoodsDeclarationTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 standarddocumentsnpage.Click_viewformsubmenu();
   	 standarddocumentsnpage.Click_SOCtab3();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_eyeicon_inTab3("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 }
   	 
   	 //Verify if the user is able to click on Download icon to downlaod the uploaded file in the Hazardous Goods Declaration tab in View Forms History sub-menu
   	 @Test(priority=38)
   	 public void ClickOnDownloadIconInHazardousGoodsDeclarationTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
     standarddocumentsnpage.Click_viewformsubmenu();
     standarddocumentsnpage.Click_SOCtab3();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_downlaodicon_inTab3("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 } 
   	 
     //Verify if the user is able to click on Eye icon to view the uploaded form in the Forwarding Instructions Form tab in View Forms History sub-menu
   	 @Test(priority=39)
   	 public void ClickOnEyeIconInForwardingInstructionsFormTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 standarddocumentsnpage.Click_viewformsubmenu();
   	 standarddocumentsnpage.Click_SOCtab4();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_eyeicon_inTab4("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 }
   	 
   	 //Verify if the user is able to click on Download icon to downlaod the uploaded file in the Forwarding Instructions Form tab in View Forms History sub-menu
   	 @Test(priority=40)
   	 public void ClickOnDownloadIconInForwardingInstructionsFormTab() throws InterruptedException {
   			
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(Email);
   	 landingPage.Enter_password(Password);
   	 landingPage.Loginbtn();
   	 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
   	 try {
   		 standarddocumentsnpage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
     standarddocumentsnpage.Click_viewformsubmenu();
     standarddocumentsnpage.Click_SOCtab4();
   	 standarddocumentsnpage.waitCode();
   	 standarddocumentsnpage.Click_downlaodicon_inTab4("1.1");
   	 try {
   			standarddocumentsnpage.waitCode();
   		 } catch (InterruptedException e) {
   			e.printStackTrace();
   		 }
   		
   	 } 
	 
	 
}

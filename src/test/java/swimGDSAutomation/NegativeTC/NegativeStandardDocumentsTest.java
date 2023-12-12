package swimGDSAutomation.NegativeTC;

import java.awt.AWTException;
import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.StandardDocumentsPage;

public class NegativeStandardDocumentsTest extends BaseClass{

	     String Email = "nda.norala@gmail.com";
         String Password ="Nikhil@86"; 
	     
                     //////////////////////////Upload T&C's///////////////////////

         
	     //Verify if the user is able to enter the characters in the version number field in Upload T&C's Submenu
		 @Test(priority=1)
		 public void EnterCharacterInVersionFieldInUploadTnCSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("DummyData");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to enter the Special characters in the version number field in Upload T&C's Submenu
		 @Test(priority=2)
		 public void EnterSpecialCharacterInVersionFieldInUploadTnCSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("!@@##");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to enter the invalid/incorrect details in the version number field in Upload T&C's Submenu
		 @Test(priority=3)
		 public void EnterInvalidDetailsInVersionFieldInUploadTnCSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("-11.1");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to enter the nth numbers in the version number field in Upload T&C's Submenu
		 //As per client no fix required
		 @Test(priority=4)
		 public void EnterNthNumbersDetailsInVersionFieldInUploadTnCSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("11111111111111111111111111111111111111111111111111111111111111111111111.0000000000000000000");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     //Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to upload the T&C's for already existing version number in Upload T&C's Submenu
		 //@Test(priority=5)
		 public void UploadTnCForExistingVersionNumberInUploadTnCSubmenu() throws InterruptedException, AWTException {
				
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
	     standarddocumentsnpage.Enter_version("1.30");
		 standarddocumentsnpage.Click_datefield();
		 standarddocumentsnpage.waitCode();
	     standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
		 standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
	     standarddocumentsnpage.Click_uploadTnCbtn();
	     standarddocumentsnpage.waitCode();
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
			
		 }
		 
		 //Verify if the user is able to enter the invalid/incorrect date in the Effective date field in Upload T&C's Submenu
		 //@Test(priority=6)
		 public void EnterInvalidDateInUploadTnCSubmenu() throws InterruptedException, AWTException {
				
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
	     standarddocumentsnpage.Enter_version("1.09");
	     standarddocumentsnpage.Enterdateinfield("121122221");
	     standarddocumentsnpage.waitCode();
	     standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
		 standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
	     standarddocumentsnpage.Click_uploadTnCbtn();
	     standarddocumentsnpage.waitCode();
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
		
		 }
		 
		 //Verify if the user is able to upload the doc extension file successfully in Upload T&C's submenu
		 @Test(priority=7)
		 public void UploadDocExtensionFileInUploadTnCSubmenu() throws InterruptedException, AWTException {
					
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
	     standarddocumentsnpage.Enter_version("100");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
	     Thread.sleep(10000);
	     standarddocumentsnpage.Uploadfile("/Users/c100-96/Desktop/DOCS.txt");
	     standarddocumentsnpage.Click_uploadTnCbtn();
	     try {
			 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
				
		 }
		 
		 //Verify if the user is able to upload the jpg extension file successfully in Upload T&C's submenu
		 @Test(priority=8)
		 public void UploadJPGExtensionFileInUploadTnCSubmenu() throws InterruptedException, AWTException {
						
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
         standarddocumentsnpage.Enter_version("100");
		 standarddocumentsnpage.Click_datefield();
		 standarddocumentsnpage.waitCode();
         standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
		 Thread.sleep(10000);
		 standarddocumentsnpage.Uploadfile("Users/c100-96/Desktop/JPG.jpg");
		 standarddocumentsnpage.Click_uploadTnCbtn();
		 try {
			 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
					
		 }
			 
	     //Verify if the user is able to upload the png extension file successfully in Upload T&C's submenu
		 @Test(priority=9)
		 public void UploadPNGExtensionFileInUploadTnCSubmenu() throws InterruptedException, AWTException {
						
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
	     standarddocumentsnpage.Enter_version("100");
		 standarddocumentsnpage.Click_datefield();
		 standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
		 standarddocumentsnpage.Click_uploadfilefield();
		 Thread.sleep(10000);
		 standarddocumentsnpage.Uploadfile("Users/c100-96/Desktop/PNG.png");
		 standarddocumentsnpage.Click_uploadTnCbtn();
		 try {
			 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
				
		 }
			 
		 //Verify if the user is able to upload the xlsx extension file successfully in Upload T&C's submenu
		 @Test(priority=10)
		 public void UploadEmptyXLSXExtensionFileInUploadTnCSubmenu() throws InterruptedException, AWTException {
						
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
	     standarddocumentsnpage.Enter_version("100");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
		 standarddocumentsnpage.Click_uploadfilefield();
		 Thread.sleep(10000);
		 standarddocumentsnpage.Uploadfile("Users/c100-96/Desktop/XLSX.xlsx");
		 standarddocumentsnpage.Click_uploadTnCbtn();
		 try {
		 	  standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
				
		 }
		 
		 //Verify if the user is able to click on upload button withou inserting required details in Upload T&C's submenu
		 @Test(priority=11)
		 public void WithoutInsertingDetailsClickOnUploadButtonInUploadTnCButton() {
				
		 LandingPage landingPage = new LandingPage(driver);
		 landingPage.Enter_useremail(Email);
		 landingPage.Enter_password(Password);
		 landingPage.Loginbtn();
		 StandardDocumentsPage standarddocumentsnpage = landingPage.StandardDocumentsPageOption();
		 standarddocumentsnpage.Click_uploadTnCsubmenu();
		 try {
			 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
		 Assert.assertFalse(standarddocumentsnpage.Enabled_uploadBtn());
		 standarddocumentsnpage.Click_uploadTnCbtn();
			
		 }
		 
		 
                    ////////////////////////////Upload Forms//////////////////////////
		 
		 //Verify if the user is able to enter the characters in the version number field in Upload Forms Submenu
		 @Test(priority=12)
		 public void EnterCharacterInVersionFieldInUploadFormsSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("DummyData");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to enter the Special characters in the version number field in Upload Forms Submenu
		 @Test(priority=13)
		 public void EnterSpecialCharacterInVersionFieldInUploadFormsSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("!@@##");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to enter the invalid/incorrect details in the version number field in Upload Forms Submenu
		 @Test(priority=14)
		 public void EnterInvalidDetailsInVersionFieldInUploadFormsSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("-11.1");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to enter the nth numbers in the version number field in Upload Forms Submenu
		 //No fix required as per client
		 @Test(priority=15)
		 public void EnterNthNumbersDetailsInVersionFieldInUploadFormsSubmenu() throws InterruptedException {
				
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
	     standarddocumentsnpage.Enter_version("11111111111111111111111111111111111111111111111111111111111111111111111.0000000000000000000");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     //Assert.assertEquals(standarddocumentsnpage.Validation_versionnield(), "Please enter a valid version. Version with pattern like 1.1");
			
		 }
		 
		 //Verify if the user is able to upload the T&C's for already existing version number in Upload Forms Submenu
		 //@Test(priority=16)
		 public void UploadFormForExistingVersionNumberInUploadFormsubmenu() throws InterruptedException, AWTException {
				
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
	     standarddocumentsnpage.Enter_version("1.30");
		 standarddocumentsnpage.Click_datefield();
		 standarddocumentsnpage.waitCode();
	     standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
		 standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
	     standarddocumentsnpage.Click_uploadTnCbtn();
	     standarddocumentsnpage.waitCode();
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
			
		 }
		 
		 //Verify if the user is able to enter the invalid/incorrect date in the Effective date field in Upload Forms Submenu
		 //@Test(priority=17)
		 public void EnterInvalidDateInUploadFormsSubmenu() throws InterruptedException, AWTException {
				
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
	     standarddocumentsnpage.Enter_version("1.09");
	     standarddocumentsnpage.Enterdateinfield("121122221");
	     standarddocumentsnpage.waitCode();
	     standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
		 standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.Uploadfile("Users//C-96//desktop.file.pdf");
	     standarddocumentsnpage.Click_uploadTnCbtn();
	     standarddocumentsnpage.waitCode();
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
		
		 }
		 
		 //Verify if the user is able to upload the doc extension file successfully in Upload Forms submenu
		 @Test(priority=18)
		 public void UploadDocExtensionFileInUploadFormsSubmenu() throws InterruptedException, AWTException {
					
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
	     standarddocumentsnpage.Enter_version("100");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
	     standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
	     Thread.sleep(10000);
	     standarddocumentsnpage.Uploadfile("/Users/c100-96/Desktop/DOCS.txt");
	     standarddocumentsnpage.Click_uploadTnCbtn();
	     try {
			 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
				
		 }
		 
		 //Verify if the user is able to upload the jpg extension file successfully in Upload Forms submenu
		 @Test(priority=19)
		 public void UploadJPGExtensionFileInUploadFormsSubmenu() throws InterruptedException, AWTException {
						
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
         standarddocumentsnpage.Enter_version("100");
		 standarddocumentsnpage.Click_datefield();
		 standarddocumentsnpage.waitCode();
         standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
	     standarddocumentsnpage.Click_uploadfilefield();
		 Thread.sleep(10000);
		 standarddocumentsnpage.Uploadfile("Users/c100-96/Desktop/JPG.jpg");
		 standarddocumentsnpage.Click_uploadTnCbtn();
		 try {
			 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
					
		 }
			 
	     //Verify if the user is able to upload the png extension file successfully in UploadForms submenu
		 @Test(priority=20)
		 public void UploadPNGExtensionFileInUploadFormsSubmenu() throws InterruptedException, AWTException {
						
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
	     standarddocumentsnpage.Enter_version("100");
		 standarddocumentsnpage.Click_datefield();
		 standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
		 standarddocumentsnpage.Click_uploadfilefield();
		 Thread.sleep(10000);
		 standarddocumentsnpage.Uploadfile("Users/c100-96/Desktop/PNG.png");
		 standarddocumentsnpage.Click_uploadTnCbtn();
		 try {
			 standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
				
		 }
			 
		 //Verify if the user is able to upload the xlsx extension file successfully in Upload Forms submenu
		 @Test(priority=21)
		 public void UploadEmptyXLSXExtensionFileInUploadFormsSubmenu() throws InterruptedException, AWTException {
						
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
	     standarddocumentsnpage.Enter_version("100");
	     standarddocumentsnpage.Click_datefield();
	     standarddocumentsnpage.waitCode();
		 standarddocumentsnpage.SelectdatenMonth("October 2023", "18");
		 standarddocumentsnpage.Click_uploadfilefield();
		 Thread.sleep(10000);
		 standarddocumentsnpage.Uploadfile("Users/c100-96/Desktop/XLSX.xlsx");
		 standarddocumentsnpage.Click_uploadTnCbtn();
		 try {
		 	  standarddocumentsnpage.waitCode();
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	     Assert.assertTrue(standarddocumentsnpage.failed_message());
				
		 }
		 
		 //Verify if the user is able to click on upload button withou inserting required details in Upload Forms submenu
		 @Test(priority=22)
		 public void WithoutInsertingDetailsClickOnUploadButtonInUploadFormsButton() {
				
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
		 Assert.assertFalse(standarddocumentsnpage.Enabled_uploadBtn());
		 standarddocumentsnpage.Click_uploadTnCbtn();
			
		 }
		 
		 
		 
		 
		 
		 
}

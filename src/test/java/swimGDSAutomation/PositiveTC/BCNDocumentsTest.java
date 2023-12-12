package swimGDSAutomation.PositiveTC;

import java.awt.AWTException;
import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.BCNDocumentsPage;
import swimGDSAutomation.pageclass.LandingPage;

public class BCNDocumentsTest extends BaseClass{

	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	 String Email = "cma@gmail.com";
     String Password ="Admin@123";
    
     //Verify if the user is able to click on BCN Documents menu and can get the title
	 @Test(priority=1)
	 public void ClickOnBCNDocumentsMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.titleOfPage();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if user is able to click on Enter BCN Number field and Dropdown list should be displayed in BCN Documents menu
	 @Test(priority=2)
	 public void ClickOnEnterBCNNumberField() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
	 }
	 
	 //Verify if user is able to Enter the BCN Number in the field in BCN Documents menu
	 @Test(priority=3)
	 public void EnterTheBCNNumberInTheField() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Enter_BCNnumber("MMCU0000691");
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
	 }
	 
	 //Verify if user is able to Select the BCN Number from the dropdown options list in BCN Documents menu
	 @Test(priority=4)
	 public void SelectTheBCNNumberFromDropdown() {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
	 }
	 
	 //Verify if user is able to Click on the View button after inserting the BCN number in BCN Documents menu
	 @Test(priority=5)
	 public void ClickOnViewButtonToUploadTheDocuments() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		 
	 }
	 
	            ///////////////////Upload CRN//////////////////////
	 
	 //Verify if user is able to click on Upload CRN to upload the document in BCN Documents menu
	 @Test(priority=6)
	 public void ClickOnUploadCRNLink() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
	   	 e.printStackTrace();
	   	 }
	 BCNdocumentstest.ClickOnActionRequiredLink("Upload CRN");
			 
	 }	

	 //Verify if user is able to Upload the CRN - Container Release Note(s) Document in BCN Documents menu
	 //@Test(priority=7)
	 public void UploadCRNDocument() throws InterruptedException, AWTException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
	   	 e.printStackTrace();
	   	 }
	 BCNdocumentstest.ClickOnActionRequiredLink("Upload CRN");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\dummy.pdf");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
			 
	 }		  
	 
     //Verify if user is able to click on Email icon of CRN - Container Release Note(s) document in BCN Documents menu
	 @Test(priority=8)
	 public void ClickOnEmailActionOfCRNDocument() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnEmailAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.waitCode();
	 
	 }	
	 
     //Verify if user is able to enter the email address in the CRN - Container Release Note(s) pop-up and click on Cancel button in BCN Documents menu
	 @Test(priority=9)
	 public void EnterEmailAddressInFieldAndClickOnCancelButton() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnEmailAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	 BCNdocumentstest.Click_cancelbtn();
		 
	 }	
	 
	 //Verify if user is able to enter the email address in the CRN - Container Release Note(s) pop-up and click on Send button in BCN Documents menu
	 @Test(priority=10)
	 public void EnterEmailAddressInFieldAndClickOnSendButton() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnEmailAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("nda.norala@gmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
		 
	 }	
	 
	 //Verify if the user is able to click on Download icon of Upload CRN document in BCN Document submenu
	 @Test(priority=11)
	 public void ClickOnDownloadActionOfCRNDocument() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDownloadAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.waitCode();
	
	 }

	 //Verify if the user has received the email with the attachement from SwimGDS Contact
	 @Test(priority=12)
	 public void VerifyUserReceivedTheAttachmentInEMail() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnEmailAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Verify_attachment();
	 BCNdocumentstest.waitCode();	
			 
	 }	
	 
	 //Verify if the user is able to click on View icon of Upload CRN document in BCN Document submenu
	 @Test(priority=13)
	 public void ClickOnViewActionOfCRNDocument() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnviewAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.waitCode();
		 
	 }	
	 
	 //Verify if the user is able to click on Delete icon of Upload CRN document and click on No button in BCN Document submenu
	 @Test(priority=14)
	 public void ClickOnDeleteActionOfCRNDocument_AndClickOnNoButton() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.Click_no_btn();
	 BCNdocumentstest.waitCode();
		 
	 }	
	 
	 //Verify if the user is able to click on Delete icon of Upload CRN document and click on Yes button in BCN Document submenu
	 //@Test(priority=15)
	 public void ClickOnDeleteActionOfCRNDocument_AndClickOnYesButton() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.Click_yes_btn();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
		 
	 }	
	 
	 
               ///////////////////Upload BOL//////////////////////

     //Verify if user is able to click on Upload BOL to upload the document in BCN Documents menu
     @Test(priority=16)
     public void ClickOnUploadBOLLink() throws InterruptedException {
			
     LandingPage landingPage = new LandingPage(driver);
     landingPage.Enter_useremail(Email);
     landingPage.Enter_password(Password);
     landingPage.Loginbtn();
     BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
     BCNdocumentstest.Click_onBCNfield();
     BCNdocumentstest.Select_bcnnumber("MMCU0000691");
     BCNdocumentstest.Clickonviewbtn();	
     BCNdocumentstest.waitCode();
     BCNdocumentstest.scrolling();
     try {
    	 BCNdocumentstest.waitCode();
    	 } 
     catch (InterruptedException e) 
         { 
    	 e.printStackTrace();

         }
     BCNdocumentstest.ClickOnActionRequiredLink("Upload BOL");
	 
     }	

     //Verify if user is able to Upload the BOL - Bill of Lading Document in BCN Documents menu
	 //@Test(priority = 17)
	 public void UploadBOLDocument() throws InterruptedException, AWTException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
			BCNdocumentstest.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		}
	 BCNdocumentstest.ClickOnActionRequiredLink("Upload BOL");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\dummy.pdf");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();

	 }	  

     //Verify if the user is able to click on Email icon of Upload the BOL - Bill of Lading document in BCN Documents menu
	 @Test(priority = 18)
	 public void ClickOnEmailActionOfBOLDocument() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("BOL - Bill of Lading");
	 BCNdocumentstest.waitCode();

	 }

     //Verify if the user is able to enter the email address in the BOL - Bill of Lading pop-up and click on Cancel button in BCN Documents menu
	 @Test(priority = 19)
 	 public void EnterEmailAddressInFieldAndClickOnCancelButton_BOLPopup() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("BOL - Bill of Lading");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	 BCNdocumentstest.Click_cancelbtn();

	 }

     //Verify if user is able to enter the email address in the BOL - Bill of Lading pop-up and click on Send button in BCN Documents menu
	 @Test(priority = 20)
	 public void EnterEmailAddressInFieldAndClickOnSendButton_BOLPopup() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
		 } catch (InterruptedException e) {
	 	 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("BOL - Bill of Lading");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("nda.norala@gmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());

	 }

     //Verify if the user has received the email with the BOL - Bill of Lading attachement from SwimGDS Contact
	 @Test(priority = 21)
	 public void VerifyUserReceivedTheAttachmentInEMail_BOLPopup() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("BOL - Bill of Lading");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Verify_attachment();
	 BCNdocumentstest.waitCode();

	 }
	 
     //Verify if the user is able to click on Download icon of Upload BOL document in BCN Document submenu
	 @Test(priority=22)
	 public void ClickOnDownloadActionOfBOLDocument() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDownloadAction("BOL - Bill of Lading");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
     //Verify if the user is able to click on View icon of Upload BOL document in BCN Document submenu
	 @Test(priority=23)
	 public void ClickOnViewActionOfBOLDocument() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnviewAction("BOL - Bill of Lading");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of Upload BOL document and click on No button in BCN Document submenu
	 @Test(priority=24)
	 public void ClickOnDeleteActionOfBOLDocument_AndClickOnNoButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("BOL - Bill of Lading");
	 BCNdocumentstest.Click_no_btn();
	 BCNdocumentstest.waitCode();
			 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of Upload BOL document and click on Yes button in BCN Document submenu
	 //@Test(priority=25)
	 public void ClickOnDeleteActionOfBOLDocument_AndClickOnYesButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("BOL - Bill of Lading");
	 BCNdocumentstest.Click_yes_btn();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
			 
	 }	 
	 
 
               ///////////////////Upload DO//////////////////////

	 /*// Verify if user is able to click on Upload DO to upload the document in BCN Documents menu
	 @Test(priority = 26)
	 public void ClickOnUploadDOLink() throws InterruptedException {
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
	 BCNdocumentstest.ClickOnActionRequiredLink("Upload DO");

	 }

     //Verify if user is able to Upload the DO - Delivery Order Document in BCN Documents menu
	 //@Test(priority = 27)
	 public void UploadDODocument() throws InterruptedException, AWTException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnActionRequiredLink("Upload DO");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\dummy.pdf");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();

	 }

     //Verify if the user is able to click on Email icon of Upload the DO - Delivery Order document in BCN Documents menu
	 @Test(priority = 28)
	 public void ClickOnEmailActionOfUploadDODocument() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("DO - Delivery Order");
	 BCNdocumentstest.waitCode();

	 }

     //Verify if the user is able to enter the email address in the DO - Delivery Order pop-up and click on Cancel button in BCN Documents menu
	 @Test(priority = 29)
	 public void EnterEmailAddressInFieldAndClickOnCancelButton_DOPopup() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("DO - Delivery Order");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("nda.norala@gmail.com");
	 BCNdocumentstest.Click_cancelbtn();

	 }

     //Verify if user is able to enter the email address in the DO - Delivery Order pop-up and click on Send button in BCN Documents menu
	 @Test(priority = 30)
	 public void EnterEmailAddressInFieldAndClickOnSendButton_BOPopup() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("DO - Delivery Order");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("nda.norala@gmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());

	 }

     //Verify if the user has received the email with the DO - Delivery Order attachement from SwimGDS Contact
	 @Test(priority = 31)
 	 public void VerifyUserReceivedTheAttachmentInEMail_DOPopup() throws InterruptedException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 BCNdocumentstest.ClickOnEmailAction("DO - Delivery Order");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Verify_attachment();
	 BCNdocumentstest.waitCode();

	 }
	 
     //Verify if the user is able to click on Download icon of Upload DO document in BCN Document submenu
	 @Test(priority=32)
	 public void ClickOnDownloadActionOfDODocument() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDownloadAction("DO - Delivery Order");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
     //Verify if the user is able to click on View icon of Upload BOL document in DO Document submenu
	 @Test(priority=33)
	 public void ClickOnViewActionOfDODocument() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnviewAction("DO - Delivery Order");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of Upload DO document and click on No button in BCN Document submenu
	 @Test(priority=34)
	 public void ClickOnDeleteActionOfDODocument_AndClickOnNoButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("DO - Delivery Order");
	 BCNdocumentstest.Click_no_btn();
	 BCNdocumentstest.waitCode();
			 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of Upload DO document and click on Yes button in BCN Document submenu
	 @Test(priority=35)
	 public void ClickOnDeleteActionOfDODocument_AndClickOnYesButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("DO - Delivery Order");
	 BCNdocumentstest.Click_yes_btn();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
			 
	 }	*/ 
	 
	 
               ///////////////////Upload Notice//////////////////////

	//Verify if user is able to click on Upload Notice to upload the document in BCN Documents menu
    @Test(priority = 36)
    public void ClickOnUploadNoticeLink() throws InterruptedException {
	LandingPage landingPage = new LandingPage(driver);
	landingPage.Enter_useremail(Email);
	landingPage.Enter_password(Password);
	landingPage.Loginbtn();
	BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	BCNdocumentstest.Click_onBCNfield();					
	BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	BCNdocumentstest.Clickonviewbtn();
	BCNdocumentstest.waitCode();
	BCNdocumentstest.scrolling();
	try {
		BCNdocumentstest.waitCode();
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	BCNdocumentstest.ClickOnActionRequiredLink("Upload Notice");

	}

     //Verify if user is able to Upload the Upload Notice Document in BCN Documents menu
	 //@Test(priority = 37)
	 public void UploadNoticeDocument() throws InterruptedException, AWTException {

	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
	 BCNdocumentstest.ClickOnActionRequiredLink("Upload Notice");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\dummy.pdf");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();

	 }

     //Verify if the user is able to click on Email icon of Upload the Upload Notice document in BCN Documents menu
     @Test(priority = 38)
     public void ClickOnEmailActionOfUploadNoticeDocument() throws InterruptedException {

     landingPage = new LandingPage(driver);
     landingPage.Enter_useremail(Email);
     landingPage.Enter_password(Password);
     landingPage.Loginbtn();
     BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
     BCNdocumentstest.Click_onBCNfield();
     BCNdocumentstest.Select_bcnnumber("MMCU0000691");
     BCNdocumentstest.Clickonviewbtn();
     BCNdocumentstest.waitCode();
     BCNdocumentstest.scrolling();
     try {
          BCNdocumentstest.waitCode();
         } catch (InterruptedException e) {
          e.printStackTrace();
         }
     BCNdocumentstest.ClickOnEmailAction("No Show Notification");
     BCNdocumentstest.waitCode();

     }

     //Verify if the user is able to enter the email address in the Upload Notice pop-up and click on Cancel button in BCN Documents menu
	 @Test(priority = 39)
	 public void EnterEmailAddressInFieldAndClickOnCancelButton_NoticePopup() throws InterruptedException {

 	 LandingPage landingPage = new LandingPage(driver);
  	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		  BCNdocumentstest.waitCode();
		 } catch (InterruptedException e) {
	  	 e.printStackTrace();
		 }
 	BCNdocumentstest.ClickOnEmailAction("No Show Notification");
	BCNdocumentstest.waitCode();
	BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	BCNdocumentstest.Click_cancelbtn();

	}

     //Verify if user is able to enter the email address in the Upload Notice pop-up and click on Send button in BCN Documents menu
 	 @Test(priority = 40)
	 public void EnterEmailAddressInFieldAndClickOnSendButton_NoticePopup() throws InterruptedException {

 	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
 	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
     BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
  	 BCNdocumentstest.scrolling();
	 try {
			BCNdocumentstest.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
	  	 }
	 BCNdocumentstest.ClickOnEmailAction("No Show Notification");
	 BCNdocumentstest.waitCode();
 	 BCNdocumentstest.Enter_emailaddress("nda.norala@gmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());

	}

    //Verify if the user has received the email with the Upload Notice attachement from SwimGDS Contact
    @Test(priority = 41)
	public void VerifyUserReceivedTheAttachmentInEMail_NoticePopup() throws InterruptedException {

	LandingPage landingPage = new LandingPage(driver);
	landingPage.Enter_useremail(Email);
	landingPage.Enter_password(Password);
	landingPage.Loginbtn();
	BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	BCNdocumentstest.Click_onBCNfield();
	BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	BCNdocumentstest.Clickonviewbtn();
	BCNdocumentstest.waitCode();
	BCNdocumentstest.scrolling();
	try {
			BCNdocumentstest.waitCode();
		} catch (InterruptedException e) {
    		e.printStackTrace();
		}
	BCNdocumentstest.ClickOnEmailAction("No Show Notification");
	BCNdocumentstest.waitCode();
	BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	BCNdocumentstest.Click_sendbtn();
	BCNdocumentstest.waitCode();
	Assert.assertTrue(BCNdocumentstest.Success_message());
	BCNdocumentstest.waitCode();
	BCNdocumentstest.Verify_attachment();
	BCNdocumentstest.waitCode();

	}
    
     //Verify if the user is able to click on Download icon of Upload Notice document in BCN Document submenu
	 @Test(priority=42)
	 public void ClickOnDownloadActionOfNoticeDocument() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDownloadAction("No Show Notification");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
     //Verify if the user is able to click on View icon of Upload Notice document in DO Document submenu
	 @Test(priority=43)
	 public void ClickOnViewActionOfNoticeDocument() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnviewAction("No Show Notification");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of Upload Notice document and click on No button in BCN Document submenu
	 @Test(priority=44)
	 public void ClickOnDeleteActionOfNoticeDocument_AndClickOnNoButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("No Show Notification");
	 BCNdocumentstest.Click_no_btn();
	 BCNdocumentstest.waitCode();
			 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of Upload Notice document and click on Yes button in BCN Document submenu
	 //@Test(priority=45)
	 public void ClickOnDeleteActionOfNoticeDocument_AndClickOnYesButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("No Show Notification");
	 BCNdocumentstest.Click_yes_btn();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
			 
	 }	
	 
	 
	           ////////////////////////Buyer Document Review////////////////
	 
	 //Verify if the user is able to click on Email icon of SOC CSC Certification and Identity Form	 (Buyer's document) in BCN Documents menu
     @Test(priority = 46)
     public void ClickOnEmailActionOfBuyersDocument() throws InterruptedException {

     landingPage = new LandingPage(driver);
     landingPage.Enter_useremail(Email);
     landingPage.Enter_password(Password);
     landingPage.Loginbtn();
     BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
     BCNdocumentstest.Click_onBCNfield();
     BCNdocumentstest.Select_bcnnumber("MMCU0000691");
     BCNdocumentstest.Clickonviewbtn();
     BCNdocumentstest.waitCode();
     BCNdocumentstest.scrolling();
     try {
          BCNdocumentstest.waitCode();
         } catch (InterruptedException e) {
          e.printStackTrace();
         }
     BCNdocumentstest.ClickOnEmailAction("SOC CSC Certification and Identity Form");
     BCNdocumentstest.waitCode();

     }

     //Verify if the user is able to enter the email address in the SOC CSC Certification and Identity Form pop-up and click on Cancel button in BCN Documents menu
	 @Test(priority = 47)
	 public void EnterEmailAddressInFieldAndClickOnCancelButton_SOCPopup() throws InterruptedException {

 	 LandingPage landingPage = new LandingPage(driver);
  	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000855");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		  BCNdocumentstest.waitCode();
		 } catch (InterruptedException e) {
	  	 e.printStackTrace();
		 }
 	BCNdocumentstest.ClickOnEmailAction("SOC CSC Certification and Identity Form");
	BCNdocumentstest.waitCode();
	BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	BCNdocumentstest.Click_cancelbtn();

	}

     //Verify if user is able to enter the email address in the SOC Indemmnity Form pop-up and click on Send button in BCN Documents menu
 	 @Test(priority = 48)
	 public void EnterEmailAddressInFieldAndClickOnSendButton_SOCPopup() throws InterruptedException {

 	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
 	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
     BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000855");
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.waitCode();
  	 BCNdocumentstest.scrolling();
	 try {
			BCNdocumentstest.waitCode();
		 } catch (InterruptedException e) {
			e.printStackTrace();
	  	 }
	 BCNdocumentstest.ClickOnEmailAction("SOC Indemmnity Form");
	 BCNdocumentstest.waitCode();
 	 BCNdocumentstest.Enter_emailaddress("nda.norala@gmail.com");
	 BCNdocumentstest.Click_sendbtn();
	 BCNdocumentstest.waitCode();
	 Assert.assertTrue(BCNdocumentstest.Success_message());

	}

    //Verify if the user has received the email with the SOC Indemmnity Form as attachement from SwimGDS Contact
    @Test(priority = 49)
	public void VerifyUserReceivedTheAttachmentInEMail_SOCPopup() throws InterruptedException {

	LandingPage landingPage = new LandingPage(driver);
	landingPage.Enter_useremail(Email);
	landingPage.Enter_password(Password);
	landingPage.Loginbtn();
	BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	BCNdocumentstest.Click_onBCNfield();
	BCNdocumentstest.Select_bcnnumber("MMCU0000855");
	BCNdocumentstest.Clickonviewbtn();
	BCNdocumentstest.waitCode();
	BCNdocumentstest.scrolling();
	try {
			BCNdocumentstest.waitCode();
		} catch (InterruptedException e) {
    		e.printStackTrace();
		}
	BCNdocumentstest.ClickOnEmailAction("SOC Indemmnity Form");
	BCNdocumentstest.waitCode();
	BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
	BCNdocumentstest.Click_sendbtn();
	BCNdocumentstest.waitCode();
	Assert.assertTrue(BCNdocumentstest.Success_message());
	BCNdocumentstest.waitCode();
	BCNdocumentstest.Verify_attachment();
	BCNdocumentstest.waitCode();

	}
    
     //Verify if the user is able to click on Download icon of SOC Indemmnity Form document in BCN Document submenu
	 @Test(priority=50)
	 public void ClickOnDownloadActionOfSOCDocument() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000855");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDownloadAction("SOC Indemmnity Form");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
     //Verify if the user is able to click on View icon of SOC Indemmnity Form document in DO Document submenu
	 @Test(priority=51)
	 public void ClickOnViewActionOfSOCDocument() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000855");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnviewAction("SOC Indemmnity Form");
	 BCNdocumentstest.waitCode();
		 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of SOC Indemmnity Form and click on No button in BCN Document submenu
	 @Test(priority=52)
	 public void ClickOnDeleteActionOfSOCDocument_AndClickOnNoButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000855");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("SOC Indemmnity Form");
	 BCNdocumentstest.Click_no_btn();
	 BCNdocumentstest.waitCode();
			 
	 }	
		 
	 //Verify if the user is able to click on Delete icon of SOC Indemmnity Form and click on Yes button in BCN Document submenu
	 //@Test(priority=53)
	 public void ClickOnDeleteActionOfSOCiceDocument_AndClickOnYesButton() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000855");
	 BCNdocumentstest.Clickonviewbtn();	
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		  e.printStackTrace();
	     }
	 BCNdocumentstest.ClickOnDeleteAction("SOC Indemmnity Form");
	 BCNdocumentstest.Click_yes_btn();
	 Assert.assertTrue(BCNdocumentstest.Success_message());
	 BCNdocumentstest.waitCode();
			 
	 }	


	 
}

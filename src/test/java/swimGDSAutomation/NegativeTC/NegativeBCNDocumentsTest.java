package swimGDSAutomation.NegativeTC;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.BCNDocumentsPage;
import swimGDSAutomation.pageclass.LandingPage;

public class NegativeBCNDocumentsTest extends BaseClass{

	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	 String Email = "cma@gmail.com";
     String Password ="Admin@123";
   
     //Verify if the user is able to enter the invalid BCN number and click on View button
	 @Test(priority=1)
	 public void EnterInvalidBCNNumberAndClickOnViewButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Enter_BCNnumber("MM#$@dd");
	 Assert.assertFalse(BCNdocumentstest.Enabled_viewbtn());
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 
	 }
	 
	 //Verify if the user is able to enter the incomplete BCN number and click on View button in BCN Documents menu
	 //Pass
	 @Test(priority=2)
	 public void EnterIncompleteBCNNumberAndClickOnViewButton() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Enter_BCNnumber("0691");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
	   	 e.printStackTrace();
	     }	 
	 
	 }
	 
	 //Verify if the user is able to click on send button without inserting the email address in the field in BCN Documents menu
	 @Test(priority=3)
	 public void WithoutInsertingEmail_ClickOnSendButton() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
	 BCNdocumentstest.Click_onBCNfield();
	 BCNdocumentstest.Select_bcnnumber("MMCU0000691");
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.Clickonviewbtn();
	 BCNdocumentstest.scrolling();
	 try {
		 BCNdocumentstest.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
	   	 e.printStackTrace();
	   	 }
	 BCNdocumentstest.ClickOnEmailAction("No Show Notification");
	 BCNdocumentstest.waitCode();
 	 BCNdocumentstest.Enter_emailaddress("");
     Assert.assertFalse(BCNdocumentstest.Enable_sendbtn());
     
	 }
	 
     //Verify if the user is able to enter the blankspace in email address field and click on Send button in BCN Documents menu
 	 @Test(priority = 4)
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
 	 BCNdocumentstest.Enter_emailaddress("  ");
	 Assert.assertFalse(BCNdocumentstest.Enable_sendbtn());


	}
 	 
     //Verify if the user is able to enter the invalid email address in the field and click on Send button in BCN Documents menu
 	 //Pass
 	 @Test(priority = 5)
	 public void EnterInvalidEmailAddressInFieldAndClickOnSendButton() throws InterruptedException {

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
 	 BCNdocumentstest.Enter_emailaddress("Abc..123@example.com");
 	 BCNdocumentstest.Enter_emailaddress("email@111.222.333.44444");
 	 BCNdocumentstest.waitCode();
	 Assert.assertFalse(BCNdocumentstest.Enable_sendbtn());


	 }

 	 //Verify if the user is able to enter the multiples email address in the field and click on Send button in BCN Documents menu
 	 //Pass
 	 @Test(priority = 6)
	 public void EnterMultiplesEmailAddressInFieldAndClickOnSendButton() throws InterruptedException {

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
	 BCNdocumentstest.ClickOnEmailAction("CRN - Container Release Note(s)");
	 BCNdocumentstest.waitCode();
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.Enter_emailaddress("narola@yopmail.com");
 	 BCNdocumentstest.waitCode();
 	 BCNdocumentstest.Click_sendbtn();
	 Assert.assertTrue(BCNdocumentstest.Success_message());

	}
 	 
	 //Verify if user is able to Upload the .png extension file in CRN - Container Release Note(s) Document  in BCN Documents menu
	 //@Test(priority=7)
	 public void UploadPNGExtensionFileInCRNDocument() throws InterruptedException, AWTException {			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(Email);
	 landingPage.Enter_password(Password);
	 landingPage.Loginbtn();
	 BCNDocumentsPage BCNdocumentstest = landingPage.BCNDocumentsPageOption();
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
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\PNG.png"); 
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.failed_message());
	 BCNdocumentstest.waitCode();
			 
	 }	 
	 

	 //Verify if user is able to Upload the .jpg extension file in CRN - Container Release Note(s) Document  in BCN Documents menu
	 //@Test(priority=8)
	 public void UploadJPGExtensionFileInCRNDocument() throws InterruptedException, AWTException {			
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
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\JPG.jpg"); 
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.failed_message());
	 BCNdocumentstest.waitCode();
			 
	 }	
	 

	 //Verify if user is able to Upload the .txt extension file in CRN - Container Release Note(s) Document  in BCN Documents menu
	 //Fail: https://nda-narola.tinytake.com/msc/ODg1NTAxN18yMjI5Nzc2Nw
	 @Test(priority=9)
	 public void UploadTextExtensionFileInCRNDocument() throws InterruptedException, AWTException {			
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
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\DOCS.txt"); 
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.failed_message());
	 BCNdocumentstest.waitCode();
			 
	 }
	 

	 //Verify if user is able to Upload the .csv extension file in CRN - Container Release Note(s) Document  in BCN Documents menu
	 //@Test(priority=10)
	 public void UploadCSVExtensionFileInCRNDocument() throws InterruptedException, AWTException {			
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
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\Excel.csv"); 
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.failed_message());
	 BCNdocumentstest.waitCode();
			 
	 }	

	 //Verify if user is able to Upload the Large Size file in CRN - Container Release Note(s) Document  in BCN Documents menu
	 //@Test(priority=11)
	 public void UploadLargeSizeFileInCRNDocument() throws InterruptedException, AWTException {			
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
	 BCNdocumentstest.Uploadfile("C:\\Users\\pgargi\\Desktop\\ABC\\Video.mov"); 
	 BCNdocumentstest.waitCode();
	 BCNdocumentstest.ScrollingUp();
	 Assert.assertTrue(BCNdocumentstest.failed_message());
	 BCNdocumentstest.waitCode();
			 
	 }	
  
	 
	
}

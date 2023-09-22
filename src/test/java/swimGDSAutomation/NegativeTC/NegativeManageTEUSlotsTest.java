package swimGDSAutomation.NegativeTC;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageTEUSlotsPage;

public class NegativeManageTEUSlotsTest extends BaseClass{
	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
	
     
     //Verify if user is able to directly click on Upload CSV button without selecting the month and required file 
     @Test(priority=1)
	 public void ClickUploadButtonWithoutSelectingFileAndMonth	() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_uploadCSVbtn();
		
	 }
     
     //Verify if user is able to click on Upload CSV button without selecting required file 
     @Test(priority=2)
	 public void ClickUploadButtonWithoutSelectingFile() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("August 2024");
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_uploadCSVbtn();
		
	 }
     
     //Verify if user is able to click on Upload CSV button without selecting Month/Year
     //  @Test(priority=3)
 	 public void ClickUploadButtonWithoutSelectingMonthAndYEar() throws AWTException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_choosefilefield();
	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/Validfile.csv");
	 
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_uploadCSVbtn();
		
	 }  
     
	 //Verify if user is able to find the search by inserting the Month which is not listed in the dropdown option in specify Month / Year to upload CSV file and can able to search the same
     @Test(priority=4)
	 public void ClickOnSpecifyMonthOrYearField() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Enter_monthinCSVfilefield("July 2022");
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
		
	 }
     
	 //Verify if user is able to find the Autosuggetion list for the matching month in the Month/Year field
     //Failed
     @Test(priority=5)
	 public void AutosuggestionForTheMatchingMonth() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Enter_monthinCSVfilefield("July");
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 Assert.assertEquals(manageTEUslotspage.Click_specifymonthfield(), 2);
	 }
     
     //Verify if user is able to change the month by simply clicking on the dropdown field again
     //Failed
     @Test(priority=6)
	 public void ChangeTheMonth_ByClickingOnDropdownAgain() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("December 2023");
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.HoveronCSVtemplatefile();
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("July 2023");
	 Assert.assertEquals( manageTEUslotspage.Attributeondropdown(), "July 2023");
	 
	 }
     
     //Verify if user is able to insert the month and year which is not listed in the dropdown and can upload the CSV file
     //@Test(priority=7)
	 public void EnterMonthYearNotInList_AndUploadFile() throws AWTException {
		
    	 LandingPage landingPage = new LandingPage(driver);
    	 landingPage.SellerLogin();	
    	 landingPage.Loginpage();
    	 landingPage.Enter_useremail(email);
    	 landingPage.Enter_password(password);
    	 landingPage.Loginbtn();
    	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
    	 manageTEUslotspage.Click_CSVfileupload();
    	 manageTEUslotspage.Enter_monthinCSVfilefield("February 2022");
    	 manageTEUslotspage.Click_choosefilefield();
    	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/Validfile.csv");
    	 manageTEUslotspage.Click_uploadCSVbtn(); 
    	 try {
    		 manageTEUslotspage.waitCode();
    	     } 
    	 catch (InterruptedException e) 
    	     {
    		    e.printStackTrace();
    	     }
    	 Assert.assertTrue(manageTEUslotspage.Success_message(), "Success Message has been displayed");
	 
	 }
     
     //Verify if user is able to see the uploaded file details in CSV File list sub-menu for the entered month and year
   	 // @Test(priority=8)
   	 public void VerifyUploadedFileDetailsVisibleInCSVFileListSubmenu() throws AWTException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.SellerLogin();	
   	 landingPage.Loginpage();
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
   	 manageTEUslotspage.Click_CSVfileupload();
   	 manageTEUslotspage.Click_specifymonthfield();
   	 manageTEUslotspage.Select_monthfromdropdown("January 2022");
   	 manageTEUslotspage.Click_choosefilefield();
   	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/Validfile.csv");
   	 manageTEUslotspage.Click_uploadCSVbtn();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_CSVfilelist();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.click_uparrow();
   	 manageTEUslotspage.Click_DownloadCSVfilelink("FILENAME.csv");  ////////////
   	 
   	 }	
   	 
     //Verify if user is able to upload the empty csv file
   	 //@Test(priority=9)
   	 public void UpoadEmptyCSVFile() throws AWTException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.SellerLogin();	
   	 landingPage.Loginpage();
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
   	 manageTEUslotspage.Click_CSVfileupload();
   	 manageTEUslotspage.Click_specifymonthfield();
   	 manageTEUslotspage.Select_monthfromdropdown("August 2024");
   	 manageTEUslotspage.Click_choosefilefield();
   	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/Validfile.csv");
   	 manageTEUslotspage.Click_uploadCSVbtn();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
     
   	 }
   	 
     //Verify if user is able to upload the invalid csv file
   	 //@Test(priority=10)
   	 public void UpoadInvalidCSVFile() throws AWTException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.SellerLogin();	
   	 landingPage.Loginpage();
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
   	 manageTEUslotspage.Click_CSVfileupload();
   	 manageTEUslotspage.Click_specifymonthfield();
   	 manageTEUslotspage.Select_monthfromdropdown("August 2024");
   	 manageTEUslotspage.Click_choosefilefield();
   	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/Validfile.csv");
   	 manageTEUslotspage.Click_uploadCSVbtn();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
     
   	 }
   	 
     //Verify if user is able to upload the .png extention file
   	 //@Test(priority=11)
   	 public void UploadPNGExtentionFile() throws AWTException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.SellerLogin();	
   	 landingPage.Loginpage();
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
   	 manageTEUslotspage.Click_CSVfileupload();
   	 manageTEUslotspage.Click_specifymonthfield();
   	 manageTEUslotspage.Select_monthfromdropdown("August 2024");
   	 manageTEUslotspage.Click_choosefilefield();
   	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/file.png");
   	 manageTEUslotspage.Click_uploadCSVbtn();
   	try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_CSVfilelist();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_DownloadCSVfilelink("FILENAME.png");
     
   	 }
   	 
     //Verify if user is able to upload the .jpg extention file
   	 //@Test(priority=12)
   	 public void UploadJPGExtentionFile() throws AWTException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.SellerLogin();	
   	 landingPage.Loginpage();
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
   	 manageTEUslotspage.Click_CSVfileupload();
   	 manageTEUslotspage.Click_specifymonthfield();
   	 manageTEUslotspage.Select_monthfromdropdown("August 2024");
   	 manageTEUslotspage.Click_choosefilefield();
   	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/file.jpg");
   	 manageTEUslotspage.Click_uploadCSVbtn();
   	try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_CSVfilelist();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_DownloadCSVfilelink("FILENAME.jpg");
     
   	 }
   	 
     //Verify if user is able to upload the .docs extention file
   	 //@Test(priority=13)
   	 public void UploadDOCSExtentionFile() throws AWTException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.SellerLogin();	
   	 landingPage.Loginpage();
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
   	 manageTEUslotspage.Click_CSVfileupload();
   	 manageTEUslotspage.Click_specifymonthfield();
   	 manageTEUslotspage.Select_monthfromdropdown("August 2024");
   	 manageTEUslotspage.Click_choosefilefield();
   	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/file.docs");
   	 manageTEUslotspage.Click_uploadCSVbtn();
   	try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_CSVfilelist();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_DownloadCSVfilelink("FILENAME.docs");
     
   	 }
   	 
     //Verify if user is able to upload the .pdf extention file
   	 //@Test(priority=14)
   	 public void UploadPDFExtentionFile() throws AWTException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.SellerLogin();	
   	 landingPage.Loginpage();
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
   	 manageTEUslotspage.Click_CSVfileupload();
   	 manageTEUslotspage.Click_specifymonthfield();
   	 manageTEUslotspage.Select_monthfromdropdown("August 2024");
   	 manageTEUslotspage.Click_choosefilefield();
   	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/file.pdf");
   	 manageTEUslotspage.Click_uploadCSVbtn();
   	try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_CSVfilelist();
   	 try {
   		manageTEUslotspage.waitCode();
   	 } catch (InterruptedException e) {
   		e.printStackTrace();
   	 }
   	 manageTEUslotspage.Click_DownloadCSVfilelink("FILENAME.pdf");
     
   	 }
   	 
	 //Verify if user is able to get the details without entering Voyage and click on search button
	 @Test(priority=15)
	 public void ClickOnPriceOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
 	 try {
    		manageTEUslotspage.waitCode();
    	 } catch (InterruptedException e) {
    		e.printStackTrace();
    	 }
	 manageTEUslotspage.Click_searchbtn();
   	 
	 }
	 
	 //Verify if user is able to get the Autosuggestion for the entered Voyage
	 @Test(priority=16)
	 public void AutosuggestionForEnteredVoyage() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Enter_voyage("V");

 	 try {
    		manageTEUslotspage.waitCode();
    	 } catch (InterruptedException e) {
    		e.printStackTrace();
    	 }
   	 
	 }
	 
	 //Verify if user is able to search the details for invalid voyage
	 @Test(priority=17)
	 public void EnterInvalidVoyage() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Enter_voyage("V00010-X");

 	 try {
    		manageTEUslotspage.waitCode();
    	 } catch (InterruptedException e) {
    		e.printStackTrace();
    	 }
 	 manageTEUslotspage.Click_searchbtn();
   	 
	 }
	 
	 //Verify if user is able to click on submit button without inserting/updating the Quantity and can get the succes message
	 //Failed
	 @Test(priority=18)
	 public void ClickSubmitBtnWithoutInsertingQuantity() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_submitbtn(1);
	 Assert.assertFalse(manageTEUslotspage.Success_message());
	 
	 }
	 
	 //Verify if user is able to submit the invalid details in New Quantity column 
	 @Test(priority=19)
	 public void EnterInvalidQuantityInFieldsAndClickSubmitbutton() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Enter_newqty("ah/d&");
	 manageTEUslotspage.Click_submitbtn(1);
	 
	 }
	 
	 //Verify if user is able to click on submit button without inserting/updating the existing data and can get the succes message
	 //Failed
	 @Test(priority=20)
	 public void ClickSubmitButtonWithoutInsertingPrice() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_Priceoption();
	 manageTEUslotspage.Click_submitbtn(0);
	 Assert.assertFalse( manageTEUslotspage.Success_message());
	 
	 }
	 
	 //Verify if user is able to enter the invalid value in Price fields and can click on Submit button
	 @Test(priority=21)
	 public void EnterInvalidValueInPriceFieldsAndClickSubmit() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_Priceoption();
	 manageTEUslotspage.Enter_newcharge("ascd.*:");
	 manageTEUslotspage.Click_submitbtn(0);
	 manageTEUslotspage.Success_message();	 
	 }
	 
	 
}

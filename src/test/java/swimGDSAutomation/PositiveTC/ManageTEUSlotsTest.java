package swimGDSAutomation.PositiveTC;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageTEUSlotsPage;

public class ManageTEUSlotsTest extends BaseClass{

	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
    
	 //Verify if user is able to click on Manage TEU Slots menu and visible 3 sub-menu options
	 @Test(priority=1)
	 public void ClickOnManageTEUSlotsMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.titleOfPage();
	 
	 } 
                  //////////////////CSV File Upload//////////////////
	 
	 //Verify if user is able to click on CSV File Upload sub-menu option and get the title of the page
	 @Test(priority=2)
	 public void ClickOnCSVUploadSlotSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 String actual = manageTEUslotspage.titleOfPage();
	 Assert.assertEquals(actual, "SWiM GDS - Seller - CSV File Upload");
	 
	 }
	 
	 //Verify if user is able to click on download CSV template file and can download the file
	 @Test(priority=3)
	 public void ClickOnDownloadCSVTemplateFile() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.DownloadCSVtemplatefile();
	 
	 }
	 
	 //Verify if user is able to click on Specify Month/year to upload CSV files field and can view the dropdown list
	 @Test(priority=4)
	 public void ClickOnSpecifyMonthOrYearField() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 }
	 
	 //Verify if user is able to Select the month/year options from Specify Month/year to upload CSV files field
	 @Test(priority=5)
	 public void SelectMonthOrYearOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("December 2023");
	 
	 }
	  
	 //Verify if user is able to click on Choose file field and the file manager pop-up should get displayed
	 @Test(priority=6)
	 public void ClickOnChooseFileField() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("December 2023");
	 manageTEUslotspage.Click_choosefilefield();
	 
	 }
	 
	 //Verify if user is able to upload the CSV file successfully
	 // @Test(priority=7)
	 public void UploadCSVFile() throws AWTException {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("December 2023");
	 manageTEUslotspage.Click_choosefilefield();
	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/Validfile.csv");
	 
	 }
	 
	 //Verify if the user is able to see the name of the selected file on the page
	 //@Test(priority=8)
	 public void VerifySelectedFilename() throws AWTException {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("December 2023");
	 manageTEUslotspage.Click_choosefilefield();
	 manageTEUslotspage.Uploadfile("/Users/c100-96/Desktop/Validfile.csv");
	 String actual = manageTEUslotspage.Filename_gettext();
	 Assert.assertEquals(actual, "Validfile.csv");
	 
	 }
	 
	 //Verify if user is able to click on Upload CSV button and can get the success validation for valid file
	 //@Test(priority=9)
	 public void ClickOnUploadCSVButton() throws AWTException {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 manageTEUslotspage.Click_specifymonthfield();
	 manageTEUslotspage.Select_monthfromdropdown("December 2023");
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
	  
	                    //////////////////CSV File List//////////////////
	 
	 //Verify if user is able to click on CSV File list sub-menu option and get the title of the page
	 @Test(priority=10)
	 public void ClickOnCSVListSlotSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfilelist();
	 String actual = manageTEUslotspage.titleOfPage();
	 Assert.assertEquals(actual, "SWiM GDS - Seller - CSV File List");
	 
	 }	 
	 
	 //Verify if user is able to see the uploaded file details in CSV File list sub-menu and can download the required file
	 //@Test(priority=11)
	 public void VerifyUploadedFileDetailsVisibleInCSVFileListSubmenu() throws AWTException {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Click_CSVfilelist();
	 manageTEUslotspage.Click_DownloadCSVfilelink("Validfile.csv");  ////////////
	 
	 }	
	 
	 //Verify if user is able to switch the page by clicking on pagination option
	 @Test(priority=12)
	 public void ClickPaginationForSwitchingThePage() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfilelist();
	 manageTEUslotspage.Click_PageNavigationArrow();
	 
	 }	
	 
	 //Verify if user is able to click on the Up arrow of Month column and view the details
	 @Test(priority=13)
	 public void ClickUpArrowOfMonthcolumn() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfilelist();
	 try {
		landingPage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 manageTEUslotspage.click_uparrow();
	 
	 }	 
	 
	 //Verify if user is able to click on the Down arrow of Month column and view the details
	 @Test(priority=14)
	 public void ClickDownArrowOfMonthcolumn() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfilelist();
	 try {
		landingPage.waitCode();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
	 manageTEUslotspage.click_downarrow();
	 
	 }
	                    //////////////////Inventory Reports//////////////////
	 
	 //Verify if user is able to click on Inventary Update sub-menu option and get the title of the page
	 @Test(priority=15)
	 public void ClickOnInventoryUpdateSubmenu() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 landingPage.waitCode();
	 String actual = manageTEUslotspage.titleOfPage();
	 Assert.assertEquals(actual, "SWiM GDS - Seller - Inventory Update");
	 
	 }
	 
	 //Verify if user is able to enter the Voyage and click on Search button
	 @Test(priority=16)
	 public void EnterVoyageAndClickOnSearchButton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 
	 }
	 
	 //Verify if user is able to enter the value in New Quantity column
	 @Test(priority=17)
	 public void EnterNewQunatityInFields() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Enter_newqty("1");
	 
	 }
	 
	//Verify if user is able to click on the Arrow to increase the quantity
	 @Test(priority=18)
	 public void ClickArrowToIncreaseQuantity() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_increaseqty();
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }

	 
	 }
	 
	 //Verify if user is able to click on the Arrow to decrease the quantity
	 @Test(priority=19)
	 public void ClickArrowToDecreaseQuantity() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_increaseqty();
	 try {
		 manageTEUslotspage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 manageTEUslotspage.Click_decreaseqty();

	 
	 }
	 
	 //Verify if user is able to enter the value in New Quantity column and can click on Submit button
	 @Test(priority=20)
	 public void EnterNewQunatityInFieldsAndClickSubmitbutton() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Enter_newqty("1");
	 manageTEUslotspage.Click_submitbtn(1);
	 manageTEUslotspage.Success_message();
	 
	 }
	 
	 //Verify if user is able to click on Price option and is able to view the details
	 @Test(priority=21)
	 public void ClickOnPriceOption() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_Priceoption();
	 
	 }
	 
	 //Verify if user is able to click on Price option and add the new charges in the field
	 @Test(priority=22)
	 public void EnterNewChargesInField() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_Priceoption();
	 manageTEUslotspage.Enter_newcharge("111");
	 
	 }
	 
	 //Verify if user is able to enter the value in Price fields and can click on Submit button
	 @Test(priority=23)
	 public void EnterPriceInFieldsAndClickSubmit() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
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
	 manageTEUslotspage.Enter_voyage("V00010-S");
	 manageTEUslotspage.Click_searchbtn();
	 manageTEUslotspage.Click_Priceoption();
	 manageTEUslotspage.Enter_newcharge("111");
	 manageTEUslotspage.Click_submitbtn(0);
	 manageTEUslotspage.Success_message();	 
	 }
	 
	 
	 //Verify if user is able to do Logout from Inventory Update Sub-menu
	 @Test(priority=24)
	 public void LogoutFromInventoryUpdateSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
//	 landingPage.SellerLogin();	
//	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 manageTEUslotspage.Logoutbtn(); 
	 }
}

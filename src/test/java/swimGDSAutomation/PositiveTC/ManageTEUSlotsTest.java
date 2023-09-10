package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageTEUSlotsPage;

public class ManageTEUSlotsTest extends BaseClass{

	 String email = "cma@gmail.com";
     String password ="Admin@123";
    
	 //Verify if user is able to click on Manage TEU Slots menu and visible 3 sub-menu options
	 @Test(priority=1)
	 public void ClickOnManageTEUSlotsMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.titleOfPage();
	 
	 }
	 
	 //Verify if user is able to click on CSV File Upload sub-menu option and get the title of the page
	 @Test(priority=2)
	 public void ClickOnCSVUploadSlotSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfileupload();
	 String actual = manageTEUslotspage.titleOfPage();
	 Assert.assertEquals(actual, "SWiM GDS - Seller - CSV File Upload");
	 
	 }
	 
	 //Verify if user is able to click on CSV File list sub-menu option and get the title of the page
	 @Test(priority=3)
	 public void ClickOnCSVListSlotSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_CSVfilelist();
	 String actual = manageTEUslotspage.titleOfPage();
	 Assert.assertEquals(actual, "SWiM GDS - Seller - CSV File List");
	 
	 }	 
	 
	 //Verify if user is able to click on Inventary Update sub-menu option and get the title of the page
	 @Test(priority=4)
	 public void ClickOnInventoryUpdateSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTEUSlotsPage manageTEUslotspage = landingPage.ManageTEUSlotsPageOption();
	 manageTEUslotspage.Click_inventoryupdate();
	 String actual = manageTEUslotspage.titleOfPage();
	 Assert.assertEquals(actual, "SWiM GDS - Seller - Inventory Update");
	 
	 }
}

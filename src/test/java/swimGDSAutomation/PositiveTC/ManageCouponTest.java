package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageCouponPage;

public class ManageCouponTest extends BaseClass{

	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
  
	 //Verify if user is able to click on Manage Coupon menu and is able to close the list
	 @Test(priority=1)
	 public void ClickOnEditBankInfo() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.waitCode();
	 managecouponpage.Close_managecouponlist();
	 }
	 
	 
	                ////////////////////////Create new coupon/////////////////////
	 
	 
	 //Verify if user is able to click on Manage Coupon menu submenu and then able to to do logout
	 @Test(priority=2)
	 public void ClickOnCreateTradingTerms() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.waitCode();
	 managecouponpage.Logoutbtn();
	 
	 }
	 
	 //Verify if user is able to enter the valid coupon code in the field in Create new coupon submenu 
	 @Test(priority=3)
	 public void EnterCouponCodeInFieldInCreateNewCouponSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("Test07");
	 managecouponpage.waitCode();
		 
	 }
	 
	 //Verify if user is able to enter the Coupon name in the field in Create new coupon submenu 
	 @Test(priority=4)
	 public void EnterCouponNameInFieldInCreateNewCouponSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("Test07");
	 managecouponpage.Enter_couponname("Narola18");
	 managecouponpage.waitCode();
	 
	 }
	 
	 //Verify if user is able to enter the Coupon name in the field in Create new coupon submenu 
	 @Test(priority=5)
	 public void EnterDiscountInFieldInCreateNewCouponSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("Test07");
	 managecouponpage.Enter_couponname("Narola18");
	 managecouponpage.Enter_discount("20");
	 managecouponpage.waitCode();
	 
	 }
		 	 
	 //Verify if user is able to select the date from the Expiration date field in Create new coupon submenu 
	 @Test(priority=6)
	 public void SelectDateFromFieldInCreateNewCouponSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("Test07");
	 managecouponpage.Enter_couponname("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("20");
	 managecouponpage.SelectdatenMonth("October 2023","19");
	 managecouponpage.waitCode();
	 
	 }
	 
	 //Verify if user is able to click on Create button in Create new coupon submenu : 
	 //Fail- https://nda-narola.tinytake.com/msc/ODgyMzA3M18yMjI1NTMzNQ
	 @Test(priority=7)
	 public void ClickOnCreateButtonInCreateNewCouponSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("Test07");
	 managecouponpage.Enter_couponname("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("20");
	 managecouponpage.SelectdatenMonth("October 2023","19");
	 managecouponpage.Click_createbtn();
	 managecouponpage.waitCode();
	 Assert.assertTrue(managecouponpage.Success_message());
		 
	 }
	
	 
	                 ////////////////////////Coupon list/////////////////////
	 
	 //Verify if user is able to click on Coupon list submenu and then able to to do logout
	 @Test(priority=8)
	 public void ClickOnListTradingTerms() throws InterruptedException {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.waitCode();
	 managecouponpage.Logoutbtn();
	 
	 }
	 
	 //Verify if user is able to search the coupon by entering the code details in the search field in List Coupon submenu	
	 @Test(priority=9)
	 public void EnterCouponDetailsInSearchFieldInCouponListSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.Enterterms_search("DIWALI");
	 managecouponpage.waitCode();
		 
	 }
	 
	 //Verify if user is able to click on toggle button to Activate the Coupon and then click on No button in List Coupon submenu	
	 @Test(priority=10)
	 public void ClickOnToggleButtonToChangeTheStatusToActivite_ThenClickNoBtn() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.waitCode();
	 managecouponpage.Entries("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Click_nobtn(1);
		 
	 }
	 
	 //Verify if user is able to click on toggle button to Activate the Coupon and then click on Yes button in List Coupon submenu	
	 @Test(priority=11)
	 public void ClickOnToggleButtonToChangeTheStatusToActivite_ThenClickYesBtn() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.waitCode();
	 managecouponpage.Entries("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Click_yesbtn(1);
	 managecouponpage.Success_message();
	 managecouponpage.waitCode();
			 
	 }
	 
	 //Verify if user is able to click on toggle button to Deactivate the Coupon and then click on No button in List Coupon submenu	
	 @Test(priority=12)
	 public void ClickOnToggleButtonToChangeTheStatusToDeactivite_ThenClickNoBtn() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.waitCode();
	 managecouponpage.Entries("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Click_nobtn(0);
	 managecouponpage.waitCode();
			 
	 }
	 
	 //Verify if user is able to click on toggle button to Deactivate the Coupon and then click on Yes button in List Coupon submenu	
	 @Test(priority=13)
	 public void ClickOnToggleButtonToChangeTheStatusToDeactivite_ThenClickYesBtn() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.waitCode();
	 managecouponpage.Entries("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Click_yesbtn(0);
	 managecouponpage.Success_message();
	 managecouponpage.waitCode();
				 
	 }
	 
	 //Verify if user is able to click on Create New Coupon button and can close the pop-up by clicking on Cancel button in Coupon List submenu
	 @Test(priority=14)
	 public void ClickOnCreateNewCouponButtonInCouponListSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();;
	 managecouponpage.Click_createnewcoupontbn();
	 managecouponpage.waitCode();
	 managecouponpage.Click_canceltbn();
		 
	 }
	 
	 //Verify if user is able to create a new coupon fom the Coupon List submenu
	 @Test(priority=15)
	 public void CreateNewCouponFromCouponListSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();;
	 managecouponpage.Click_createnewcoupontbn();
	 managecouponpage.Enter_code("Test09");
	 managecouponpage.Enter_couponname("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("20");
	 managecouponpage.SelectdatenMonth("October 2023","19");
	 managecouponpage.Click_createbtn();
	 managecouponpage.Success_message();
	 managecouponpage.waitCode();
		 
	 }
	 
	 
	 
}

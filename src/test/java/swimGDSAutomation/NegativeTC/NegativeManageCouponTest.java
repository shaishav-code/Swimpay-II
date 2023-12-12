package swimGDSAutomation.NegativeTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageCouponPage;

public class NegativeManageCouponTest extends BaseClass{

	
	 String email = "nda.norala@gmail.com";
     String password ="Nikhil@86";
     
     
                       ////////////////////////Create New Coupon///////////////////////
     
     //Verify if user is able to click directly on create button without inserting mandatory details in the fields in Create coupon code submenu
   	 @Test(priority=1)
   	 public void ClickOnCreateTradingTerms() throws InterruptedException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
   	 managecouponpage.Click_createnewcoupon();
   	 managecouponpage.waitCode();
   	 Assert.assertFalse(managecouponpage.Createbtn_isenabled());
   	 managecouponpage.Click_createbtn();
   	 
   	 }
   	 
   	 //Verify if user is able to insert the Blankspace in the required field in Create new coupon submenu 
	 @Test(priority=2)
	 public void SelectDateFromFieldInCreateNewCouponSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("   ");
	 managecouponpage.Enter_couponname("   ");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("   ");
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.waitCode();
   	 Assert.assertFalse(managecouponpage.Createbtn_isenabled());
   	 managecouponpage.Click_createbtn();
	 
	 }
	 

   	 //Verify if user is able to insert the Special character in the required field in Create new coupon submenu 
	 @Test(priority=3)
	 public void EnterSpecialCharacterFieldInCreateNewCouponSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("@%&*?.,");
	 managecouponpage.Enter_couponname("@%&*?.,");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("20");
	 managecouponpage.SelectdatenMonth("October 2023","20");
   	 managecouponpage.Click_createbtn();
   	 managecouponpage.waitCode();
   	 Assert.assertTrue(managecouponpage.Validationoncode());
     Assert.assertTrue(managecouponpage.Validationoncouponnamefield());
     
	 }
	 
     //Verify if user is able to enter the 0 value in in the Discount field in Create new coupon submenu 
	 @Test(priority=4)
	 public void EnterZeroValueInDiscountFieldInCreateNewCouponSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("@%&*?.,");
	 managecouponpage.Enter_couponname("@%&*?.,");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("0");
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.Click_createbtn();
	 managecouponpage.waitCode();
	 Assert.assertTrue(managecouponpage.Validationoncode());
     Assert.assertTrue(managecouponpage.Validationoncouponnamefield());
     Assert.assertTrue(managecouponpage.Validation_discountfield());
	     
	 }
	 
     //Verify if user is able to enter the invalid/incorrect value in the Discount field in Create new coupon submenu 
	 @Test(priority=5)
	 public void EnterInvalidValueInDiscountFieldInCreateNewCouponSubmenu() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.Click_createnewcoupon();
	 managecouponpage.Enter_code("@%&*?.,");
	 managecouponpage.Enter_couponname("@%&*?.,");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("101");
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.Click_createbtn();
	 managecouponpage.waitCode();
	 Assert.assertTrue(managecouponpage.Validationoncode());
	 Assert.assertTrue(managecouponpage.Validationoncouponnamefield());
	 Assert.assertTrue(managecouponpage.Validation_discountfield());
		     
     }
	 
	 //Verify if user is able to create a duplicate coupon code in Create new coupon submenu 
	 @Test(priority=6)
   	 public void CreateDuplicateCouponCodeInCreateNewCouponSubmenu() throws InterruptedException {
					
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
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.Click_createbtn();
	 managecouponpage.waitCode();
	 Assert.assertTrue(managecouponpage.Validationoncode());
		     
	 }	
	 
	 
	                       /////////////////////Coupon List////////////////////////
	 
	 //Verify if user is able to search the coupon which is not listed in the list in List Coupon submenu	
	 @Test(priority=7)
	 public void EnterCouponDetailsInSearchFieldInCouponListSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.Enterterms_search("Testing");
	 managecouponpage.waitCode();
			 
	 }
	 
     //Verify if user is able to click directly on create button without inserting mandatory details in the fields in Coupon list submenu
   	 @Test(priority=8)
   	 public void ClickOnCreateTradingTermsInCouponListSubmenu() throws InterruptedException {
   		
   	 LandingPage landingPage = new LandingPage(driver);
   	 landingPage.Enter_useremail(email);
   	 landingPage.Enter_password(password);
   	 landingPage.Loginbtn();
   	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
   	 managecouponpage.listcouponsubmenu();;
	 managecouponpage.Click_createnewcoupontbn();
   	 managecouponpage.waitCode();
   	 Assert.assertFalse(managecouponpage.Createbtn_isenabled());
   	 managecouponpage.Click_createbtn();
   	 
   	 }
   	 
   	 //Verify if user is able to insert the Blankspace in the required field in Coupon list submenu
	 @Test(priority=9)
	 public void SelectDateFromFieldInCouponListSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.Click_createnewcoupontbn();
	 managecouponpage.waitCode();
	 managecouponpage.Enter_code("   ");
	 managecouponpage.Enter_couponname("   ");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("   ");
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.waitCode();
   	 Assert.assertFalse(managecouponpage.Createbtn_isenabled());
   	 managecouponpage.Click_createbtn();
	 
	 }
	 

   	 //Verify if user is able to insert the Special character in the required field in Coupon list submenu
	 @Test(priority=10)
	 public void EnterSpecialCharacterFieldInCouponListSubmenu() throws InterruptedException {
			
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.Click_createnewcoupontbn();
	 managecouponpage.waitCode();
	 managecouponpage.Enter_code("@%&*?.,");
	 managecouponpage.Enter_couponname("@%&*?.,");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("20");
	 managecouponpage.SelectdatenMonth("October 2023","20");
   	 managecouponpage.Click_createbtn();
   	 managecouponpage.waitCode();
   	 Assert.assertTrue(managecouponpage.Validationoncode());
     Assert.assertTrue(managecouponpage.Validationoncouponnamefield());
     
	 }
	 
     //Verify if user is able to enter the 0 value in in the Discount field in Coupon list submenu
	 @Test(priority=11)
	 public void EnterZeroValueInDiscountFieldInCouponListSubmenu() throws InterruptedException {
				
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.Click_createnewcoupontbn();
	 managecouponpage.waitCode();
	 managecouponpage.Enter_code("@%&*?.,");
	 managecouponpage.Enter_couponname("@%&*?.,");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("0");
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.Click_createbtn();
	 managecouponpage.waitCode();
	 Assert.assertTrue(managecouponpage.Validationoncode());
     Assert.assertTrue(managecouponpage.Validationoncouponnamefield());
     Assert.assertTrue(managecouponpage.Validation_discountfield());
	     
	 }
	 
     //Verify if user is able to enter the invalid/incorrect value in the Discount field in Coupon list submenu
	 @Test(priority=12)
	 public void EnterInvalidValueInDiscountFieldInCouponListSubmenu() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.Click_createnewcoupontbn();
	 managecouponpage.waitCode();
	 managecouponpage.Enter_code("@%&*?.,");
	 managecouponpage.Enter_couponname("@%&*?.,");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("101");
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.Click_createbtn();
	 managecouponpage.waitCode();
	 Assert.assertTrue(managecouponpage.Validationoncode());
	 Assert.assertTrue(managecouponpage.Validationoncouponnamefield());
	 Assert.assertTrue(managecouponpage.Validation_discountfield());
		     
     }
	 
	 //Verify if user is able to create a duplicate coupon code in Coupon list submenu
	 @Test(priority=13)
   	 public void CreateDuplicateCouponCodeInCouponListSubmenu() throws InterruptedException {
					
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageCouponPage managecouponpage = landingPage.ManageCouponPageOption();
	 managecouponpage.listcouponsubmenu();
	 managecouponpage.Click_createnewcoupontbn();
	 managecouponpage.waitCode();
	 managecouponpage.Enter_code("Test07");
	 managecouponpage.Enter_couponname("Narola18");
	 managecouponpage.waitCode();
	 managecouponpage.Enter_discount("20");
	 managecouponpage.SelectdatenMonth("October 2023","20");
	 managecouponpage.Click_createbtn();
	 managecouponpage.waitCode();
	 Assert.assertTrue(managecouponpage.Validationoncode());
		     
	 }	 
 

}

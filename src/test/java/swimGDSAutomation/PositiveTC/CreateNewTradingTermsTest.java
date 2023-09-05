package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.CreateNewTradingTermsPage;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageTradingTermPage;

public class CreateNewTradingTermsTest extends BaseClass{

	 String email="nda.norala@gmail.com";
	 String password= "Nikhil@86";
		 
	 //Verify if user is able to open and close the dropdown for Terms(days)
	 @Test(priority=1)
	 public void VerifyTermsDropdown_OpenedAndClosed()   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 CreateNewTradingTermsPage createnewtradingterms = managetradingterms.CreateNewTradingTermsOption();
	 createnewtradingterms.Enter_code("ABC123");
	 createnewtradingterms.Enter_couponname("Copy Coupon");
	 createnewtradingterms.closedropdown();
	 try {
			createnewtradingterms.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 createnewtradingterms.closedropdown();
	 
	}
	
	 //Verify if user is able to enter the value in required fields
	 @Test(priority=2)
	 public void ClickOnCreateTradingTerms()   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 CreateNewTradingTermsPage createnewtradingterms = managetradingterms.CreateNewTradingTermsOption();
	 createnewtradingterms.Enter_code("ABC123");
	 createnewtradingterms.Enter_couponname("Copy Coupon");
	 createnewtradingterms.Select_dropdowndays("60");
	 createnewtradingterms.SelectdatenMonth("October 2023","12");
	 try {
		createnewtradingterms.waitCode();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 Assert.assertTrue(createnewtradingterms.Createbtn_isdisplayed());
	 
	}
	 
	 //Verify if user is able to create the New Terms in Manage trading terms section
	 @Test(priority=3)
	 public void CreateNewTerms()   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 CreateNewTradingTermsPage createnewtradingterms = managetradingterms.CreateNewTradingTermsOption();
	 createnewtradingterms.Enter_code("ABC123");
	 createnewtradingterms.Enter_couponname("Copy Coupon");
	 createnewtradingterms.Select_dropdowndays("60");
	 createnewtradingterms.SelectdatenMonth("October 2023","12");
	 createnewtradingterms.Click_createbtn();
	 Assert.assertTrue(createnewtradingterms.Success_message());
	}

}
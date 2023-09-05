package swimGDSAutomation.NegativeTC;


import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.CreateNewTradingTermsPage;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageTradingTermPage;

public class NegativeCreateNewTradingTermsTest extends BaseClass{

	 String email="nda.norala@gmail.com";
	 String password= "Nikhil@86";
	
	 //Verify if user is able to create the New Terms without entering any details in fields
	 @Test(priority=1)
	 public void WithoutEnteringDetails_ClickOnCreateTradingTerms()   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 CreateNewTradingTermsPage createnewtradingterms = managetradingterms.CreateNewTradingTermsOption();
	 createnewtradingterms.Click_createbtn();
	 Assert.assertTrue(createnewtradingterms.Validationoncode());
	 
	}
	 
	 //Verify if user is able to create the New Terms by entering blankspace in Code and Coupon name field
	 @Test(priority=2)
	 public void EnterBlankSpace_ClickOnCreateTradingTerms()   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 CreateNewTradingTermsPage createnewtradingterms = managetradingterms.CreateNewTradingTermsOption();
	 createnewtradingterms.Enter_code(" ");
	 createnewtradingterms.Enter_couponname(" ");
	 createnewtradingterms.Select_dropdowndays("30");
	 createnewtradingterms.SelectdatenMonth("November 2023","27");
	 createnewtradingterms.Click_createbtn();
	 
	}
	 
	 //Verify if user is able to create the New Terms by entering Special Character in Code and Coupon name field
	 @Test(priority=3)
	 public void EnterSpecialCharacter_ClickOnCreateTradingTerms()   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 CreateNewTradingTermsPage createnewtradingterms = managetradingterms.CreateNewTradingTermsOption();
	 createnewtradingterms.Enter_code("ABC@#[.423");
	 createnewtradingterms.Enter_couponname("ABC@#[.423");
	 createnewtradingterms.Select_dropdowndays("30");
	 createnewtradingterms.SelectdatenMonth("November 2023","27");
	 createnewtradingterms.Click_createbtn();
	 
	 
	}
	 
	 //Verify if user is able to create the New Terms without selecting Terms(Days) from the dropdown
	 @Test(priority=4)
	 public void WithoutSelectingDays_ClickCreateBtn()   {
		
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
	 createnewtradingterms.SelectdatenMonth("November 2023","27");
	 createnewtradingterms.Click_createbtn();
	 
	}
	 
	 //Verify if user is able to select the days which are not available in dropdown
	 @Test(priority=5)
	 public void SelectInvalidDaysOption_FromTermsDropdown()   {
		
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
	 
	 try {
		 createnewtradingterms.Select_dropdowndays("40");
		} catch (Exception e) {
			e.printStackTrace();
		}
	 
	}
	 
	 
	 //Verify if user is able to create the New Terms without selecting date
	 @Test(priority=6)
	 public void WithoutSelectingDate_ClickCreateBtn()   {
		
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
	 createnewtradingterms.Select_dropdowndays("30");
	 createnewtradingterms.Click_createbtn();
	 
	}
}

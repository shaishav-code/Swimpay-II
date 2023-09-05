package swimGDSAutomation.PositiveTC;

import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ManageTradingTermPage;

public class ManageTradingTermsTest extends BaseClass {

	
	String email = "nda.norala@gmail.com";
    String password ="Nikhil@86";
   
	 //Verify if user is able to click on Manage Trading Terms menu and is able to close the list
	 @Test(priority=1)
	 public void ClickOnEditBankInfo() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 managetradingterms.Close_managetradinglist();
	 }
	 
	 //Verify if user is able to click on Manage Trading Terms option and then able to to do logout
	 @Test(priority=2)
	 public void ClickOnCreateTradingTerms() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 managetradingterms.Close_managetradinglist();
	 managetradingterms.Click_createmanageterms();
	 managetradingterms.Logoutbtn();
	 
	 }
	 
	 //Verify if user is able to click on List trading terms option and then able to to do logout
	 @Test(priority=3)
	 public void ClickOnListTradingTerms() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 managetradingterms.Close_managetradinglist();
	 managetradingterms.Click_listterms();
	 managetradingterms.Logoutbtn();
	 
	 }
}

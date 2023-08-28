package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.AccountManagementPage;

public class AccountManagementTest extends BaseClass  {

     String email = "nda.norala@yopmail.com";
     String password ="Nayan@86"; 
     
     //Verify if user is able to click on Account Management menu and dropdown list is getting visible 
	 @Test(priority=1)
	 public void ClickOnAccountManagementDropDown() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();	
	 accountmanagement.titleOfPage();	 
	 }
	 
	 String accounttext= "My Account - Master User";
	 
     //Verify if user is able to click on MyAccount menu and view the details
	 @Test(priority=2)
	 public void ClickOnMyAccount() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();	
	 String actualtext = accountmanagement.Click_myaccount();
	 Assert.assertEquals(actualtext, accounttext);
	 accountmanagement.titleOfPage();	
	 }
	 
	 String authorizetext= "Authorized Users";
	 
     //Verify if user is able to click on Authorize User menu and view the details
	 @Test(priority=3)
	 public void ClickOnAuthorizeUser() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();	
	 String actualtext = accountmanagement.Click_authorizeuser();
	 Assert.assertEquals(actualtext, authorizetext);
	 accountmanagement.titleOfPage();	
	 }
	 
	 String tnctext="SWiM Terms & Conditions";
	 
     //Verify if user is able to click on Swim GDS Terms & Conditions menu and view the details
	 @Test(priority=4)
	 public void ClickOn_SwimTermsNCondition() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();	
	 String actualtext = accountmanagement.Click_swimTnC();
	 Assert.assertEquals(actualtext, tnctext);
	 accountmanagement.titleOfPage();	
	 }
	 
	 
	 String rulestext="SWiM GDS Rules";
	 
     //Verify if user is able to click on Swim GDS Rules menu and view the details
	 @Test(priority=5)
	 public void ClickOn_SwimGDSRules() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();	
	 String actualtext = accountmanagement.Click_swimRules();
	 Assert.assertEquals(actualtext, rulestext);
	 accountmanagement.titleOfPage();	
	 }
	 
	 
	 
}

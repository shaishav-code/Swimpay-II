package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AccountManagementPage;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.SwimGDSRulesPage;

public class SwimGDSRulesTest extends BaseClass{

    String email = "cma@gmail.com";
    String password ="Admin@123";
  
	 //Verify if user is able to click on Swim GDS Rules sub-module and then click on Logout button
    @Test(priority=1)
	 public void ClickOnEditBankInfo() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSRulesPage rulesPage= accountmanagement.SwimGDSRulesOption();
	 rulesPage.titleOfPage();
	 try {
		 rulesPage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 rulesPage.Logoutbtn();
	 }
    
    
	 //Verify if the Print Document button is displayed on Swim GDS Rules page
    @Test(priority=2)
	 public void PrintDocument_displayed() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSRulesPage rulesPage= accountmanagement.SwimGDSRulesOption();
	 try {
		 rulesPage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = rulesPage.Printdocumentbtn_displayed();
	 Assert.assertTrue(displayed, "Print document button has been displayed");
	  
	 }
    
	 //Verify if user is able to click on the Print Document button on Swim GDS Rules page
    @Test(priority=3)
	 public void ClickOnPrintDocument() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSRulesPage rulesPage= accountmanagement.SwimGDSRulesOption();
	 rulesPage.Click_printdocument();
	 try {
		 rulesPage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }

    }
    
	 //Verify if Download document button is displayed on Swim Rules page
    @Test(priority=4)
	 public void Downloaddocument_displayed() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSRulesPage rulesPage= accountmanagement.SwimGDSRulesOption();
	 try {
		 rulesPage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = rulesPage.Downloaddocumentbtn_displayed();
	 Assert.assertTrue(displayed, "Download document button has been displayed");
	  
	 }
    
	 //Verify if user is able to click on Download document and after clicking the document is downloaded on Swim Rules page
    @Test(priority=5)
	 public void ClickOnDownloaddocument() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSRulesPage rulesPage= accountmanagement.SwimGDSRulesOption();
	 rulesPage.Click_downloaddocument();
	 try {
		 rulesPage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 }

}

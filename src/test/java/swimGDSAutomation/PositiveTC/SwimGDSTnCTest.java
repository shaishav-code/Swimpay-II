package swimGDSAutomation.PositiveTC;



import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.AccountManagementPage;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.SwimGDSTnCPage;

public class SwimGDSTnCTest extends BaseClass{

	 String email = "cma@gmail.com";
     String password ="Admin@123";
   
	 //Verify if user is able to click on Swim GDS Terms & Condition sub-module and then click on Logout button
     @Test(priority=1)
	 public void ClickOnEditBankInfo() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSTnCPage TnCpage= accountmanagement.SwimGDSTnCOption();
	 TnCpage.titleOfPage();
	 try {
		 TnCpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 TnCpage.Logoutbtn();
	 }
     
     
	 //Verify if the Print Document button is displayed on Swim Terms & Condition page
     @Test(priority=2)
	 public void PrintDocument_displayed() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSTnCPage TnCpage= accountmanagement.SwimGDSTnCOption();
	 try {
		 TnCpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = TnCpage.Printdocumentbtn_displayed();
	 Assert.assertTrue(displayed, "Print document button has been displayed");
	  
	 }
     
	 //Verify if user is able to click on the Print Document button on Swim Terms & Condition page
     @Test(priority=3)
	 public void ClickOnPrintDocument() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSTnCPage TnCpage= accountmanagement.SwimGDSTnCOption();
     TnCpage.Click_printdocument();
	 try {
		 TnCpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 }
     
	 //Verify if Download document button is displayed on Swim Terms & Condition page
     @Test(priority=4)
	 public void Downloaddocument_displayed() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSTnCPage TnCpage= accountmanagement.SwimGDSTnCOption();
	 TnCpage.titleOfPage();
	 try {
		 TnCpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	 boolean displayed = TnCpage.Downloaddocumentbtn_displayed();
	 Assert.assertTrue(displayed, "Download document button has been displayed");
	  
	 }
     
	 //Verify if user is able to click on Download document and after clicking the document is downloaded
     @Test(priority=5)
	 public void ClickOnDownloaddocument() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 AccountManagementPage accountmanagement = landingPage.AccountManagementOption();
	 SwimGDSTnCPage TnCpage= accountmanagement.SwimGDSTnCOption();
	 TnCpage.titleOfPage();
	 TnCpage.Click_downloaddocument();
	 try {
		 TnCpage.waitCode();
	     } 
	 catch (InterruptedException e) 
	     {
		    e.printStackTrace();
	     }
	  
	 }
	
}

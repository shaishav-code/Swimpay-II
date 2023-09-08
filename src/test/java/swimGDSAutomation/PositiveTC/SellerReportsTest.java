package swimGDSAutomation.PositiveTC;

import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.SellerReportPage;

public class SellerReportsTest extends BaseClass{

	 String email = "cma@gmail.com";
     String password ="Admin@123";
   
	 //Verify if user is able to click on Seller module with two options displayed i.e. Ready Made & Report Writer
	 @Test(priority=1)
	 public void ClickSellerReportsMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 sellerreportspage.titleOfPage();
	 
	 }
	 
	 
	 //Verify if user is able to click on Ready Made sub-menu with 4 options displayed i.e. Balances Payable,Sellers Inventory Position Report, Sellers Slot Availability Trend Report & Bill Of Lading & Objections Report
	 @Test(priority=2)
	 public void ClickReadyMadeSubMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 sellerreportspage.Click_readymade();
	 sellerreportspage.titleOfPage();
	 
	 }
	 
	 //Verify if user is able to click on Report Writer menu 
	 @Test(priority=3)
	 public void ClickReportWriterMenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 sellerreportspage.Click_reportwriter();
	 sellerreportspage.titleOfPage();
	 
	 }
	
	
}

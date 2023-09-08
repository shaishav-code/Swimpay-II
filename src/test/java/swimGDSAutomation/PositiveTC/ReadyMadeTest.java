package swimGDSAutomation.PositiveTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ReadyMadePage;
import swimGDSAutomation.pageclass.SellerReportPage;

public class ReadyMadeTest extends BaseClass {

	 String email = "cma@gmail.com";
     String password ="Admin@123";
   
	 //Verify if user is able to click on Balance Payable sub-menu option and get the title
	 @Test(priority=1)
	 public void ClickBalancePayableSubmenu() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_balpayable();
	 readymadepage.titleOfPage();
	 
	 }
	 
	 //Verify if user is able to click on the Select buyer dropdown with buyer name listed
	 @Test(priority=2)
	 public void SelectBuyerName() {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_balpayable();
	 readymadepage.titleOfPage();
     readymadepage.Click_dropdown();
	
		try {
			readymadepage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual = readymadepage.Selectbuyer("DB Schenker");
		Assert.assertEquals(actual, "DB Schenker");
		readymadepage.scrolling();
     }
	 
	 //Verify if user is able to click on view button and can view the buyer details
	 @Test( dependsOnMethods="SelectBuyerName",priority=3)
	 public void ClickViewButtonToViewDetails() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_balpayable();
     readymadepage.Click_dropdown();
	
		try {
			readymadepage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual = readymadepage.Selectbuyer("Test Cancel Voyage");
		Assert.assertEquals(actual, "Test Cancel Voyage");
		readymadepage.Click_viewbtn();
		readymadepage.scrolling();
     }
	 
	 //Verify if user is able to Change the buyer by clicking on the dropdown again 
	 @Test( priority=4)
	 public void ChangeBuyerByClickingOnDropdownAgain() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_balpayable();
     readymadepage.Click_dropdown();
	
		try {
			readymadepage.waitCode();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual = readymadepage.Selectbuyer("Test Cancel Voyage");
		Assert.assertEquals(actual, "Test Cancel Voyage");
		readymadepage.Click_dropdown();
		String actual1 = readymadepage.Selectbuyer("THOMTT");
		Assert.assertEquals(actual1, "THOMTT");
     }
	 
	 //Verify if user is able to click on Sellers Inventory Position Report and can view the report download button
	 @Test( priority=5)
	 public void ClickSellersInventoryPositionReportSubmenu() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.click_sellerinventory();
     Assert.assertTrue(readymadepage.Verifyreportbtn_isdisplayed(), "Download button is displayed");
		try 
		{
			readymadepage.waitCode();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
     }
	
	 
	 //Verify if user is able to click on Download Sellers Inventory Position Report button to download the report
	 @Test( priority=6)
	 public void ClickDownloadSellersInventoryPositionReportButton() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.click_sellerinventory();
     readymadepage.click_downloadsellersreportbtn();
		try 
		{
			readymadepage.waitCode();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
     }
	 
	 
	 //Verify if user is able to click on Sellers Slot Availability Trend Report Sub-menu
	 @Test( priority=7)
	 public void ClickSellersSlotAvailabilityTrendReportSubmenu() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_sellerslotreport();
	 Assert.assertEquals(readymadepage.Validationonpage(),"Sellers Slot Availability Trend Report");
		try 
		{
			readymadepage.waitCode();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	 readymadepage.scrolling();
     }
	 
	 //Verify if user is able to click on Ascending and descending arrow of Destination coloumn
	 @Test( priority=8)
	 public void ClickAscendingNDescendingArrows() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_sellerslotreport();
	 try 
		{
			readymadepage.waitCode();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	 readymadepage.click_ASCnDESC();
	 readymadepage.scrolling();
     }
	 
	 //Verify if user is able to click on Bill Of Lading & Objections Report and view the details
	 @Test( priority=9)
	 public void ClickOnBillReportSubmenu() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_billreport();
	 Assert.assertEquals(readymadepage.Validationonpage(),"Bill Of Lading & Objections Report");
	 
     }	 
	 
	 //Verify if user is able to click on Ascending and descending arrow of Seller coloumn
	 @Test( priority=10)
	 public void ClickUpNDownArrowOfSellerColoumn() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_billreport();
	 readymadepage.click_updownarrow();
	 readymadepage.scrolling();
	 
     }
	 
	 //Verify if user is able to click on Forwarder dropdown field and options list is getting listed
	 @Test( priority=11)
	 public void ClickForwarderDropdownField() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_billreport();
	 readymadepage.Click_forwarderdropdown();
	 
     }
	 
	 //Verify if user is able to click on Forwarder dropdown field and options list is getting listed
	 @Test( priority=12)
	 public void SelectForwarderOption() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_billreport();
	 readymadepage.Click_forwarderdropdown();
	 try 
		{
		 readymadepage.Selecttheoptionsfromlist("SmartOsc");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	 
     }
	 
	 //Verify if user is able to download a CSV for Selected option from Forwarder dropdown
	 @Test( priority=13)
	 public void ClickDownloadCSV() {
		 
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 SellerReportPage sellerreportspage = landingPage.SellerReportPageOption();
	 ReadyMadePage readymadepage = sellerreportspage.ReadyMadePageOption();
	 readymadepage.Click_billreport();
	 readymadepage.Click_forwarderdropdown();
	 try 
		{
		 readymadepage.Selecttheoptionsfromlist("SmartOsc");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	 readymadepage.Click_downloadCSV();
	 try 
		{
			readymadepage.waitCode();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	 
     }

	 
}



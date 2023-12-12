package swimGDSAutomation.PositiveTC;


import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.QuotesPage;

public class QuotesTest extends  BaseClass{
	  
	               /////////////// Carrier Owned Containers - Special/////////////////
	
	
	  String email = "cosco@gmail.com";
	  String password = "Admin@123";
	
	  //Verify if user is able to click on Quotes menu
	  @Test(priority=1)
	  public void Visit_QuotesPage()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.titleOfPage();
	   }
	  
	  String Text="No quotes available";
	  //Verify if user is able to click on Carrier container & see the displayed quotes
	  @Test(priority=2)
	  public void VerifyQuotesin_CarrierContainer()
	  {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_carriercontainer();
			quotespage.ScrollingVertically();
			quotespage.Click_Submitbtn();
	  }

	  
	  //Verify if user is able to click on the status dropdown and see the options in Carrier Owned container
	  @Test(priority=3)
	  public void ClickDropDown_VisibleOptions()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Select_dropdown();
	   }
	 
	  
	  //Verify if user is able to select the Cancelled option and see the quotes in Carrier Owned container
	  @Test(priority=4)
	  public void SelectCancelledStatus()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Cancelled");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			quotespage.Carrierquotes(0);
			quotespage.scrolling();
	   }
	  
	  //Verify if user is able to select the Accepted option and see the quotes in Carrier Owned container
	  @Test(priority=5)
	  public void SelectAcceptedStatus()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Accepted");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			quotespage.Carrierquotes(0);
//			quotespage.scrolling();
	   }
	  
	//Verify if user is able to select the Out of Date option and see the quotes in Carrier Owned container
	  @Test(priority=6)
	  public void Select_OutOfDateStatus()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Out of Date");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			quotespage.Carrierquotes(0);
			quotespage.scrolling();
	   }
	  
	  //Verify if user is able to select the Quoted option and see the quotes in Carrier Owned container
	  @Test(priority=7)
	  public void SelectQuotedStatus()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Quoted");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			quotespage.Carrierquotes(0);
//			quotespage.scrolling();
	   }
	  
	  //Verify if user is able to select the Declined option and see the quotes in Carrier Owned container
	  @Test(priority=8)
	  public void SelectDeclinedStatus()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_dropdown();		
            quotespage.SelectDropdownOption("Declined");
            try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			quotespage.Carrierquotes(0);
			quotespage.scrolling();
	
	   }
	  
	  
	       ///////////////// Shipper Owned Containers////////////////
	  
 
	  //Verify if user is able to click on Shipped container & see the displayed quotes
	  @Test(priority=9)
	  public void VerifyQuotesin_ShippedContainer()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_shippercontainer();
	   }
	  
	  //Verify if user is able to click on the status dropdown and see the options in Shipper Owned container
	  @Test(priority=10)
	  public void ClickDropDown_ShippedContainer()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_shippercontainer();
			quotespage.Select_dropdown();
	   }
	  
	  //Verify if user is able to select the Cancelled option and see the quotes in Shipper Owned container
	  @Test(priority=11)
	  public void SelectCancelledStatus_ShippedContainer()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_shippercontainer();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Cancelled");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			quotespage.Shipperquotes();
//			quotespage.scrolling();	   
			}
	  
	  //Verify if user is able to select the Accepted option and see the quotes in Shipper Owned container
	  @Test(priority=12)
	  public void SelectAcceptedStatus_ShippedContainer()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_shippercontainer();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Accepted");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			quotespage.Shipperquotes();
//			quotespage.scrolling();
	   }
	  
	  @Test(priority=13)
	  //Verify if user is able to select the Out of Date option and see the quotes in Shipper Owned container
	  public void SelectOutofDateStatus_ShippedContainer()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_shippercontainer();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Out of Date");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			quotespage.Shipperquotes();
			quotespage.scrolling();
	   }
	  
	  //Verify if user is able to select the option and see the quotes in Shipper Owned container
	  @Test(priority=14)
	  public void SelectQuotedStatus_ShippedContainer()
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_shippercontainer();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Quoted");
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			quotespage.Shipperquotes();
//			quotespage.scrolling();
	   }
	  
	  //Verify if user is able to select the Declined option and see the quotes in Shipper Owned container
	  @Test(priority=15)
	  public void SelectDeclinedStatus_ShippedContainer() throws InterruptedException
	   {
			LandingPage landingPage = new LandingPage(driver);
//			landingPage.SellerLogin();	
//			landingPage.Loginpage();
			landingPage.Enter_useremail(email);
			landingPage.Enter_password(password);
			landingPage.Loginbtn();
			QuotesPage quotespage = landingPage.QuotesOption();
			quotespage.Click_shippercontainer();
			quotespage.Click_dropdown();
			quotespage.SelectDropdownOption("Declined");
			Thread.sleep(3000);
			try {
				quotespage.waitCode();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			quotespage.Shipperquotes();
//			quotespage.scrolling();
	   }
	  
	  
}
